package edu.fit.assist.csadl.reasoner;

import edu.fit.assist.csadl.CSADBObject;
import edu.fit.assist.csadl.Statement;
import edu.fit.assist.csadl.lib.Library;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To reason about a set of guarantees and assumptions and output messages
 */
public class Reasoner {
    private CSADBObject csadlObject;

    public Reasoner(CSADBObject csadbObject){
        this.csadlObject = csadbObject;
    }

    /**
     * This is the main method that takes a CSADL object containing assumptions and guarantees and reasons about them
     */
    public void run(){
        int numGuarantees = csadlObject.getGuaranteeCount();
        int numAssumptions = csadlObject.getAssumeCount();
        Library library = new Library(); // initialize a new library based on a hashmap of key-value action-association pairs

        // Go through a list containing guarantees read from the input file
        for(int i = 0 ; i < numGuarantees ; i++) {
            Statement guarantee = csadlObject.getGuarantee(i);

            // Look up the association for a given action of a guarantee.
            // for example, the action may be "sendMsgTo" and the association may be "hasConnectionWith"
            //System.out.println(guarantee.getAssociationAndType());
            //System.out.println(guarantee.getCapitalizedThingType());
            String association = library.get(guarantee.getAssociationAndType());
            //System.out.println(association);
            if(association == null){
                System.err.println("ERROR Action \'"+guarantee.getAssociationAndType()+"\' has no association.");
                System.exit(-1);
            }
            // Go through the list of Assumptions
            for(int j = 0; j < numAssumptions; j++) {
                Statement assumption = csadlObject.getAssume(j);


                //Example: if the library value "hasConnectionWith" maps to an assumption "hasConnectionWith"
                //System.out.println(assumption.getAssociation());
                if (association.equalsIgnoreCase(assumption.getAssociation())) {

                    //check if the guaranteed action is "sendMsgTo" or the guaranteed action is "receiveMsgFrom"

                    if (guarantee.getAction().equalsIgnoreCase("send") || guarantee.getAction().equalsIgnoreCase("receive")) {
                        // Then check if thingA from the guarantee matches thingA from the association and thingB from the guaranteed matches thingB from the assumption
                        // OR if thingA from the guarantee matches thingB from the assumption and thingB from teh guarantee matches thingA from the assumption
                        if ((guarantee.getThingA().equalsIgnoreCase(assumption.getThingA()) && guarantee.getThingB().equalsIgnoreCase(assumption.getThingB())) ||
                                (guarantee.getThingA().equalsIgnoreCase(assumption.getThingB()) && guarantee.getThingB().equalsIgnoreCase(assumption.getThingA()))
                        ) {
                            outputSatisfiedGuaranteeMsg(guarantee, (i+1), assumption, (j+1));
                            break;
                        } else {
                            outputMissingAssociationMsg(guarantee, association); // output a missing
                        }
                    }

                    //Check if the guaranteed action is "forward" then check if thingA maps to thingB
                    else if(guarantee.getAction().equalsIgnoreCase("forward")){

                        // If thingA in the guarantee maps to thingA in the assumption and thingB in the guarantee maps to thingB in the assumptiom
                        // Output a satisfied message
                        if(guarantee.getThingA().equalsIgnoreCase(assumption.getThingA()) && guarantee.getThingB().equalsIgnoreCase(assumption.getThingB())){
                            outputSatisfiedGuaranteeMsg(guarantee, (i+1), assumption, (j+1));

                            break;
                        }
                        // If thingA in the guarantee does not match thingA in the assumption, but thingB in the guarantee match thingB in the assumption,
                        // check the message sensitivity: for example, if is is sensitive, thing cannot forward it,
                        // but if it is normal, he can forward it
                        else if(!(guarantee.getThingA().equalsIgnoreCase(assumption.getThingA()) && (guarantee.getThingB().equalsIgnoreCase(assumption.getThingB())))){
                            checkMsgSensitivity(guarantee, (i+1));
                        }
                    }
                    // Check if the guaranteed action is "isSecure" then check if the server is secure
                    else if(association.equalsIgnoreCase("isDemInternal")){
                        boolean foundMatch = false;
                        for(int k = 0; k < numAssumptions; k++) {
                            Statement tempAssumption = csadlObject.getAssume(k);
                            if(tempAssumption.getThingA().equalsIgnoreCase(guarantee.getThingA())){
                                foundMatch = true;
                                break;
                            }
                        }
                        if(foundMatch){
                            System.out.println(guarantee.getThingA() + " is Secure!");
                        }else{
                            System.out.println(guarantee.getThingA() + " is NOT Secure!");
                        }
                        break;





                    }

                    //If thingA from the guarantee matches thing A from the assumption and thingB from the guarantee matches thingB from the assumption,
                    // output a satisfied message.
                    // Else, output a missing association message

                    else if(guarantee.getThingA().equalsIgnoreCase(assumption.getThingA()) && guarantee.getThingB().equalsIgnoreCase(assumption.getThingB())){
                        outputSatisfiedGuaranteeMsg(guarantee, (i+1), assumption, (j+1));
                        break;
                    }
                    else {
                        outputMissingAssociationMsg(guarantee, association);
                    }
                }
            }
        }
    }

    /**
     * Checks the sensitivity of a message and outputs messages accordingly
     * @param guarantee
     * @param guaranteeIndex
     */
    public void checkMsgSensitivity(Statement guarantee, int guaranteeIndex){
        int numAssumptions = csadlObject.getAssumeCount();
        for(int i = 0; i < numAssumptions; i++){
            Statement assumption = csadlObject.getAssume(i);
            if(assumption.getAssociation().equalsIgnoreCase("hasSensitive")){
                outputCannotForwardMsg(guarantee, assumption, (i+1));
                return;
            }
            else if (assumption.getAssociation().equalsIgnoreCase("hasNormal")) {
                outputSatisfiedGuaranteeMsg(guarantee, guaranteeIndex, assumption, (i+1));
                return;
            }
        }
        outputCannotForwardMsgNoContext(guarantee);

    }

    /**
     * Display a message that a guarantee is satisfied based on an assumption
     * @param guarantee
     * @param guaranteeIndex
     * @param assumption
     * @param assumptionIndex
     */
    public void outputSatisfiedGuaranteeMsg(Statement guarantee, int guaranteeIndex, Statement assumption, int assumptionIndex){
        System.out.println("guarantee "+ guaranteeIndex +": "+ guarantee.toString() +
                " satisfied based on \nassumption "+ assumptionIndex +": "+
                assumption.toString());
        System.out.println("...................................................");
    }

    /**
     * Display a message that an asset is missing an association with another asset
     * @param guarantee
     * @param association
     */
    public void outputMissingAssociationMsg(Statement guarantee, String association){
        System.out.println("Asset " + guarantee.getThingA() + " does not have association " + association +
                " with asset " + guarantee.getThingB() + " in assumption");
        System.out.println("...................................................");
    }

    public void outputCannotForwardMsgNoContext(Statement guarantee){
        System.out.println(guarantee.getThingA() + " cannot forward " + guarantee.getThingB()
                + " due to the lack of Sensitivity Context");
        System.out.println("...................................................");
    }

    /**
     * Display a message that an asset cannot forward a message based on an assumption
     * @param guarantee
     * @param assumption
     * @param assumptionIndex
     */
    public void outputCannotForwardMsg(Statement guarantee, Statement assumption, int assumptionIndex){
        System.out.println(guarantee.getThingA() + " cannot forward " + guarantee.getThingB()
                + "based on \nassumption " + assumptionIndex + ": " + assumption.toString());
        System.out.println("...................................................");
    }
}

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
        Library library = new Library(); // Initialize a new library based on a hashmap of key-value action-procedure pairs

        AssumeMap assumeMap = new AssumeMap(csadlObject.assume);
        for(String s:assumeMap.map.keySet()){
            //System.out.println(s);
        }

        // Go through a list containing guarantees read from the input file
        for(int i = 0 ; i < numGuarantees ; i++) {
            Statement guarantee = csadlObject.getGuarantee(i);
            // Get action from guarantee
            String action = guarantee.getAction();
            String thingA = guarantee.getThingA();
            String thingB = guarantee.getThingB();
            String thingC = guarantee.getThingC();
            // Get procedure from the library using the action
            String[] procedure = library.get(action);
            boolean success = true;
            String reasonTrue = "";
            String reasonFalse = "";

            // Do the procedure
            for(String step:procedure){
                String[] parts = step.split(";");
                String association = parts[0];
                String propertyToCheck = step.replaceAll(";a1",";"+thingA).replaceAll(";a2",";"+thingB).replaceAll(";a3",";"+thingC);

                if(association.equalsIgnoreCase("isDemInternal")){
                    if(!assumeMap.exists(propertyToCheck)){
                        success = false;
                        reasonFalse += "\n" + thingA + " is Not Demographically Internal.";
                    }else{
                        reasonTrue += "\n" + thingA + " is Demographically Internal.";
                    }
                }else if(association.equalsIgnoreCase("isConnectedTo")){
                    if(!assumeMap.exists(propertyToCheck)){
                        success = false;
                        reasonFalse += "\n" + thingA + " is Not Connected To " + thingB + ".";
                    }else{
                        reasonTrue += "\n" + thingA + " is Connected To " + thingB + ".";
                    }
                }else if(association.equalsIgnoreCase("created")){
                    if(!assumeMap.exists(propertyToCheck)){
                        success = false;
                        reasonFalse += "\n" + propertyToCheck.split(";")[1]  + " hasn't created " + thingC + "." ;
                    }else{
                        reasonTrue += "\n" + propertyToCheck.split(";")[1] + " has created " + thingC + "." ;
                    }
                }else if(association.equalsIgnoreCase("hasSensitiveContent")){
                    if(assumeMap.exists(propertyToCheck)){
                        success = false;
                        reasonFalse += "\n" + thingC + " has a sensitive context.";
                    }else{
                        reasonTrue += "\n" + thingC + " doesn't have a sensitive context.";
                    }
                }
            }
            System.out.print(printBorder());
            if(success){
                System.out.println(formatReason("\'"+guarantee+"\' is True.\nReason(s):")+formatReason(reasonTrue));
            }else{
                System.out.println(formatReason("\'"+guarantee+"\' is False.\nReason(s):")+formatReason(reasonFalse));
            }
            System.out.println(printBorder());
        }
    }
    private String printBorder(){
        String output = "";
        for(int i=0;i<100;i++){
            output += "-";
        }
        return "+" + output + "+";
    }
    private String formatReason(String reason){
        String output = "";
        for(String s: reason.split("\n")){
            s = s.replaceAll("\n", "");
            if(s.length() == 0)
                continue;

            for(int i=s.length();i<100;i++){
                s += " ";
            }
            s = "\n|" +s+ "|";
            output += s;
        }
        return output;

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

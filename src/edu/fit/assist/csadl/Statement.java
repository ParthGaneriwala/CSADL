package edu.fit.assist.csadl;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To convert each line in CSADL to a rule of the form:
 * Assume thingA association thingB or
 * Guarantee thingA association thingB
 */
public class Statement {
    private StatementType statementType;
    private String thingA;
    private String association;
    private String thingType;
    private String thingIdentifier;
    private String thingB;
    private String[] possibleThingTypes = {"data", "message"};

    public Statement(StatementType statementType, String thingA, String association, String thingB){
        this.statementType = statementType;
        this.association = association;
        this.thingA = thingA;
        this.thingB = thingB;
    }
    public Statement(StatementType statementType, String thingA, String association){
        this.statementType = statementType;
        this.association = association;
        this.thingA = thingA;
        this.thingB = "";

    }
    // thingType: data or message
    public Statement(StatementType statementType, String thingA, String association, String thingType, String thingB){
        this.statementType = statementType;
        this.association = association;

        for(int i=0;i<possibleThingTypes.length;i++){
            if(thingType.startsWith(possibleThingTypes[i])){
                this.thingType = possibleThingTypes[i];
                this.thingIdentifier = thingType.substring(this.thingType.length());
                break;
            }
        }

        //this.thingType = thingType;


        this.thingA = thingA;
        this.thingB = thingB;
    }

    public String getThingA(){return thingA;}
    public String getThingB(){return thingB;}
    public StatementType getRuleType(){return statementType;}
    public String getAssociation(){return association;} // An assumption has an association
    public String getThingType(){return thingType;};
    public String getThingIdentifier(){return  thingIdentifier;}
    public String getAction(){return association;} // A guarantee has an action
    public String getCapitalizedThingType(){
        if(thingType != null){
            return Character.toUpperCase(thingType.charAt(0)) +thingType.substring(1);
        }
        return "";
    }
    public String getAssociationAndType(){return association + getCapitalizedThingType();} // add thing type to association Example: send + data = sendData (capitalize the first letter of thing type)

    public String toString(){
        return getThingA() + " " + association + getCapitalizedThingType() + " " + getThingB();
    }
}

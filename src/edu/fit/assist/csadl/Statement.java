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
    private String thingB;

    public Statement(StatementType statementType, String thingA, String association, String thingB){
        this.statementType = statementType;
        this.association = association;
        this.thingA = thingA;
        this.thingB = thingB;
    }

    public String getThingA(){return thingA;}
    public String getThingB(){return thingB;}
    public StatementType getRuleType(){return statementType;}
    public String getAssociation(){return association;} // An assumption has an association
    public String getAction(){return association;} // A guarantee has an action

    public String toString(){
        return getThingA() + " " + association + " " + getThingB();
    }
}

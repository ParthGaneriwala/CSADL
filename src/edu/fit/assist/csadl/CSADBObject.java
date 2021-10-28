package edu.fit.assist.csadl;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To store a set of assumptions and guarantees
 */
public class CSADBObject {
    private int rows;
    private List<Statement> assume;
    private List<Statement> guarantee;

    public CSADBObject(){
        this.assume = new ArrayList<>();
        this.guarantee = new ArrayList<>();
    }

    public CSADBObject(List<Statement> assume, List<Statement> guarantee){
        this.assume = assume;
        this.guarantee = guarantee;
    }

    public void addAssume(Statement statement){
        this.assume.add(statement);
    }

    public void addGuarantee(Statement statement){
        this.guarantee.add(statement);
    }

    public Statement getGuarantee(int i){
        return guarantee.get(i);
    }

    public Statement getAssume(int i){
        return assume.get(i);
    }

    public int getGuaranteeCount(){
        return this.guarantee.size();
    }

    public int getAssumeCount(){
        return this.assume.size();
    }

}

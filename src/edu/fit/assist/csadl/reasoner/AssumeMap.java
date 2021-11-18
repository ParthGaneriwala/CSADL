package edu.fit.assist.csadl.reasoner;

import edu.fit.assist.csadl.Statement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssumeMap {
    Map<String, Boolean> map = new HashMap<>();
    public AssumeMap(List<Statement> assumeStatements){
        for(Statement stm: assumeStatements){
            String str = "";
            str += stm.getAssociationAndType() + ";";
            if(stm.getThingA() != null && stm.getThingA().length() > 0)
                str += stm.getThingA() + ";";
            if(stm.getThingB() != null && stm.getThingB().length() > 0)
                str += stm.getThingB() + ";";
            if(stm.getThingC() != null && stm.getThingC().length() > 0)
                str += stm.getThingC() + ";";
            map.put(str,true);
            // If A is connected to B, also assume B is connected to A
            if(stm.getAssociationAndType().equalsIgnoreCase("isConnectedTo")){
                String reverseConnectedToStatement = stm.getAssociationAndType()+";"+stm.getThingB()+";"+stm.getThingA()+";";
                map.put(reverseConnectedToStatement,true);
            }

        }
    }

    public boolean exists(String str){
        return map.containsKey(str);
    }

}

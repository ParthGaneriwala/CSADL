package edu.fit.assist.csadl.reasoner;

import edu.fit.assist.csadl.Statement;

import java.util.*;

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
            // If A hasFeatureEventEncryption with B, also assume B hasFeatureEventEncryption with A
            if(stm.getAssociationAndType().equalsIgnoreCase("hasFeatureEventEncryption")){
                String reverseConnectedToStatement = stm.getAssociationAndType()+";"+stm.getThingB()+";"+stm.getThingA()+";";
                map.put(reverseConnectedToStatement,true);
            }
            // If A is Securelyconnected to B, also assume B is Securelyconnected to A
            if(stm.getAssociationAndType().equalsIgnoreCase("isSecurelyConnectedTo")){
                String reverseConnectedToStatement = stm.getAssociationAndType()+";"+stm.getThingB()+";"+stm.getThingA()+";";
                map.put(reverseConnectedToStatement,true);
            }

        }

        generateTransitiveClosure("isConnectedTo;");
        addSecureConnections();
        generateTransitiveClosure("isSecurelyConnectedTo;");

    }

    private void addSecureConnections(){
        Map<String, Boolean> newMap = new HashMap<>();
        for(String key : map.keySet()){
            newMap.put(key, map.get(key));
            if(key.startsWith("isConnectedTo;")){

                String query = key.replace("isConnectedTo;","hasFeatureEventEncryption;");
                if(map.containsKey(query)){
                    String thingA = key.split(";")[1];
                    String thingB = key.split(";")[2];
                    newMap.put("isSecurelyConnectedTo;"+thingA+";"+thingB+";", true);
                    newMap.put("isSecurelyConnectedTo;"+thingB+";"+thingA+";", true);
                }
            }
        }
        this.map = newMap;
    }
    private void generateTransitiveClosure(String property) {
        // Get List of nodes
        ArrayList<String> nodes = new ArrayList<String>();
        for(String key : map.keySet()){
            if(key.startsWith(property)){
                nodes.add(key.split(";")[1]);
                nodes.add(key.split(";")[2]);
            }
        }
        // Create maping from node name to index
        int numberOfNodes = nodes.size();
        boolean graph[][] = new boolean[numberOfNodes][numberOfNodes];
        Map<String, Integer> idMap = new HashMap<>();
        int id = 0;
        for(String node: nodes){
            idMap.put(node, id);
            id++;
        }
        // create graph
        for(String key : map.keySet()){
            if(key.startsWith(property)){
                int id1 = idMap.get(key.split(";")[1]);
                int id2 = idMap.get(key.split(";")[2]);
                graph[id1][id2] = true;
                graph[id2][id1] = true;
            }
        }
        // Compute Transitive Closure
        for(int startNode = 0; startNode < numberOfNodes; startNode++){
            // DFS starting from startNode
            boolean visited[] = new boolean[numberOfNodes];
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(startNode);
            while(!stack.empty()){
                int node = stack.pop();
                graph[startNode][node] = true;
                graph[node][startNode] = true;
                visited[node] = true;
                for(int child=0;child<numberOfNodes;child++){
                    if(graph[node][child]){
                        if(!visited[child]) {
                            stack.push(child);
                        }
                    }
                }
            }

        }
        for(int node1=0;node1<numberOfNodes;node1++){
            for(int node2=0;node2<numberOfNodes;node2++){
                if(graph[node1][node2]){
                    String thingA = nodes.get(node1);
                    String thingB = nodes.get(node2);
                    map.put(property+thingA+";"+thingB+";", true);
                    map.put(property+thingB+";"+thingA+";", true);
                }
            }
        }

    }

    public boolean exists(String str){
        return map.containsKey(str);
    }

}

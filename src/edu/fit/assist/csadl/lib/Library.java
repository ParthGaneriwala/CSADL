package edu.fit.assist.csadl.lib;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To store all CSADL action-association pairs
 */
public class Library {
    Map<String, String[]> library = new HashMap<>();
    Map<List<String>, String> library1 =new HashMap<>();


    public void Library1() {
        List<String> action = new ArrayList<>();
        action.add("send");
        action.add("data");
        action.add("computer");
        library1.put(action, "isConnectedTo");
    }
    public Library(){
        // guarantee a1 action a2
        // guarantee a1 action a3 a2 Example: guarantee computerA send messsgeA ComputerB
        library.put("isSecure", new String[]{"isDemInternal;a1;"});
        //assume computerA isConnectedTo serverA;
        library.put("send", new String[]{"isConnectedTo;a1;a2;", "created;a1;a3;"});
        library.put("securelySend", new String[]{"isSecurelyConnectedTo;a1;a2;", "created;a1;a3;"});
        library.put("receive", new String[]{"isConnectedTo;a1;a2;", "created;a2;a3;"});
        library.put("securelyReceive", new String[]{"isSecurelyConnectedTo;a1;a2;", "created;a2;a3;"});
        library.put("forward", new String[]{"isConnectedTo;a1;a2;", "hasSensitiveContent;a3;"});
        library.put("isSecurelyConnectedTo", new String[]{"isSecurelyConnectedTo;a1;a2;"});
        library.put("encrypt", new String[]{"isConnectedTo;a1;a2;", "hasFeatureEventEncryption;a1;a2;"});
        library.put("decrypt", new String[]{"isConnectedTo;a1;a2;", "hasFeatureEventEncryption;a1;a2;"});
        /*library.put("sendData", "isConnectedTo");
        library.put("receiveData", "isConnectedTo");

        // The iotDevice/computer is connected to the iotDevice/computer/server
        library.put("sendMessage", "isConnectedTo");
        library.put("receiveMessage", "isConnectedTo");

        library.put("encrypt", "hasKeyOf");
        library.put("decrypt", "knowKeyOf");
        library.put("forwardData" , "created");
        library.put("forwardMessage" , "created");
        library.put("isSecure", "isDemInternal");*/

    }

    public Map<List<String>, String> getLibrary1() {
        return library1;
    }

    public Map<String, String[]> getLibrary(){
        return library;
    }
    public String[] get(String key){
        return library.get(key);
    }
}

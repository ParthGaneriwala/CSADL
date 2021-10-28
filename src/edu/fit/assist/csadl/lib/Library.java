package edu.fit.assist.csadl.lib;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To store all CSADL action-association pairs
 */
public class Library {
    Map<String, String> library = new HashMap<>();

    public Library(){
        library.put("sendMsgTo", "hasConnectionWith");
        library.put("receiveMsgFrom", "hasConnectionWith");
        library.put("encryptMsgTo", "hasKeyOf");
        library.put("decryptMsgFrom", "knowKeyOf");
        library.put("forward", "hasCreated");
    }

    public Map<String, String> getLibrary(){
        return library;
    }
    public String get(String key){
        return library.get(key);
    }
}

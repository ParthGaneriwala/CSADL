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
        //OLD LIBRARY
         library.put("sendMsgTo", "hasConnectionWith");
         library.put("receiveMsgFrom", "hasConnectionWith");
         library.put("encryptMsgTo", "hasKeyOf");
         library.put("decryptMsgFrom", "knowKeyOf");
         library.put("forward", "hasCreated");
        // The iotDevice/computer is connected to the iotDevice/computer/server
//        library.put("sendData", "isConnectedTo");
//        library.put("receiveData", "isConnectedTo");
//
//        // The iotDevice/computer is connected to the iotDevice/computer/server
//        library.put("sendMessage", "isConnectedTo");
//        library.put("receiveMessage", "isConnectedTo");
//
//        library.put("encrypt", "hasKeyOf");
//        library.put("decrypt", "knowKeyOf");
//        library.put("forward" , "created");
//
//        // Hardware Components Mapping
//        library.put("", "hasButton");
//        library.put("recordImage", "hasCamera");
//        library.put("recordAudio", "hasMicrophone");
//        library.put("produceAudio", "hasSpeaker");
//        library.put("provideWirelessConnectivity", "hasNetworkModule");
//        library.put("", "hasMotionSensor");
//        library.put("", "hasThermalSensor");
//
//        // Software Feature Mapping
//        library.put("canEncryptData", "hasFeatureDataEncryption");
//        library.put("canDecryptData", "hasFeatureDataDecryption");
//        library.put("canEncryptEvent", "hasFeatureEventEncryption");
//        library.put("canBalanceLoad", "hasFeatureSecurity");
//
//        // Use cases (hybrid Action-Association Mapping)
//
//        // 1. Perform Motion Sensing
//        library.put("", "hasMotionSensor");
//        library.put("performMotionSensing", "hasFeatureMotionSensing");
//
//        // 2. Perform Thermal Image Recognition
//        library.put("", "hasThermalSensor");
//        library.put("peformThermalImageRecognition", "hasFeatureThermalSensing");
//
//        // 3. Does the doorbell perform streaming
//        library.put("recordImage", "hasCamera");
//        library.put("provideWirelessConnectivity", "hasNetworkModule");
//
//        // 4. Does the device provide Sound Recognition
//        library.put("produceAudio", "hasSpeaker");
//        library.put("recordAudio", "hasMicrophone");
//        library.put("provideWirelessConnectivity", "hasNetworkModule");
//
//        // 5. Does the device send and receive secure data?
//        library.put("sendData", "isConnectedTo");
//        library.put("receiveData", "isConnectedTo");
//        library.put("canEncryptData", "hasFeatureDataEncryption");
//        library.put("canDecryptData", "hasFeatureDataDecryption");
//
//        // 6. Is the connection between the server and device secure?
//        library.put("sendData", "isConnectedTo");
//        library.put("receiveData", "isConnectedTo");
//        library.put("canEncryptEvent", "hasFeatureEventEncryption");


    }

    public Map<String, String> getLibrary(){
        return library;
    }
    public String get(String key){
        return library.get(key);
    }
}

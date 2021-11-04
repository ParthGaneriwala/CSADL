package main;

import edu.fit.assist.csadl.CSADBObject;
import edu.fit.assist.csadl.CSADLFileProcessor;
import edu.fit.assist.csadl.reasoner.Reasoner;

import java.io.IOException;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To process a CSADL file
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //Process and input file
        String dataFile = "/home/parthetic/CSADL/src/data/v1_examples/aaa.txt";
        CSADLFileProcessor csadlFileProcessor = new CSADLFileProcessor();
        CSADBObject csadbObject = csadlFileProcessor.processCSADLFile(dataFile);

        //Run the reasoner based on the CSADL object created from the data file
        Reasoner reasoner = new Reasoner(csadbObject);
        reasoner.run();
    }
}

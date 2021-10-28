package edu.fit.assist.csadl;

import java.io.*;


/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/28/21
 * Institution: Florida Institute of Technology
 * Purpose: To read and process a CSADL file containing assumptions and guarantees
 *
 */
public class CSADLFileProcessor {
    private static final int statementLength = 5;
    private CSADBObject csadbObject;

    public CSADLFileProcessor(){
        this.csadbObject = new CSADBObject();
    }

    /**
     * This method reads a CSADL file
     * @param filePath
     * @return a CSADL object containing a list of assumptions and guarantees
     * @throws IOException
     */
    public CSADBObject processCSADLFile(String filePath) throws IOException {
        File dataFile = new File(filePath);
        String line;
        int lineCount = 0;
        StatementType statementType;
        BufferedReader br = new BufferedReader(new FileReader(dataFile));

        // Go through each line in the input file
        while ((line = br.readLine()) != null) {
            if (!line.trim().equals("")) {
                String[] lineParts = line.split(" ");
                if(lineParts.length == statementLength){

                    //a statement consists of :statementType, thingA, association, thingB
                    //differentiate between assumption and guarantees
                    if(lineParts[0].equalsIgnoreCase("assume")){
                        statementType = StatementType.assume;
                        Statement statement = new Statement(statementType, lineParts[1], lineParts[2], lineParts[3]);
                        this.csadbObject.addAssume(statement);
                    }
                    else if(lineParts[0].equalsIgnoreCase("guarantee")){
                        statementType = StatementType.guarantee;
                        Statement statement = new Statement(statementType, lineParts[1], lineParts[2], lineParts[3]);
                        this.csadbObject.addGuarantee(statement);
                    }
                    lineCount++;
                }
            }

        }
        br.close();
        return this.csadbObject;
    }

}

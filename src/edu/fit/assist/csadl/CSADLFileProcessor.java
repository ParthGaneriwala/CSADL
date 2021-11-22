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
    private static final int statementLength = 5; // Outdated
    private static final int assumeStatementLength[] = {3,4};
    private static final int guaranteeStatementLength[] = {3,4,5};
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
                // remove semicolon
                line = line.replaceAll(";", "");
                String[] lineParts = line.split(" ");
                // Check if the length of line parts matches that of an assume statement
                if(contains(assumeStatementLength, lineParts.length)) {

                    //a statement consists of :statementType, thingA, association, thingB
                    //differentiate between assumption and guarantees
                    if (lineParts[0].equalsIgnoreCase("assume")) {
                        statementType = StatementType.assume;
                        Statement statement =null;
                        switch(lineParts.length) {
                            case 3:
                                statement = new Statement(line, statementType, lineParts[1], lineParts[2]);
                                break;
                            case 4:
                                statement = new Statement(line, statementType, lineParts[1], lineParts[2], lineParts[3]);
                                break;
                            default:
                                System.err.println("ERROR: assume statement with size "+(lineParts.length) + " not supported!");
                                break;
                        }
                        assert(statement != null);
                        this.csadbObject.addAssume(statement);
                    }
                }
                // Check if the length of line parts matches that of an guarantee statement
                if(contains(guaranteeStatementLength, lineParts.length)) {
                    if (lineParts[0].equalsIgnoreCase("guarantee")) {
                        statementType = StatementType.guarantee;
                        Statement statement = null;
                        switch(lineParts.length) {
                            case 3:
                                statement = new Statement(line, statementType, lineParts[1], lineParts[2]);
                                break;
                            case 4:
                                statement = new Statement(line, statementType, lineParts[1], lineParts[2], lineParts[3]);
                                break;
                            case 5:
                                statement = new Statement(line, statementType, lineParts[1], lineParts[2], lineParts[3], lineParts[4]);
                                break;
                            default:
                                System.err.println("ERROR: guarantee statement with size "+(lineParts.length) + " not supported!");
                                break;
                        }
                        assert(statement != null);
                        this.csadbObject.addGuarantee(statement);
                    }
                    lineCount++;
                }
            }


        }
        br.close();
        return this.csadbObject;
    }
    private boolean contains(int arr[], int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value)
                return true;
        }
        return false;
    }
}

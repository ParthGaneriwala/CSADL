package main;

import edu.fit.assist.csadl.lib.antlr.csadlverifiernew.CSADLErrorListener;
import edu.fit.assist.csadl.lib.antlr.csadlverifiernew.SecurityBaseListener;
import edu.fit.assist.csadl.lib.antlr.csadlverifiernew.SecurityLexer;
import edu.fit.assist.csadl.lib.antlr.csadlverifiernew.SecurityParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;


/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/29/21
 * Institution: Florida Institute of Technology
 * Purpose: To verify a CSADL file that it follows the grammar
 * References:
 * 1. https://www.baeldung.com/java-antlr
 * 2. https://stackoverflow.com/questions/29472276/antlr-4-generate-parse-tree-code-in-java
 * 3. https://blog.knoldus.com/testing-grammar-using-antlr4-testrig-grun/
 * 4. http://www.cstaylor.org/how-to-silence-antlr4s-error-messages/
 * 5. https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 *
 */
public class GrammarVerifier {
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args){
        String csadlData = "assume computerB hasConnectionWith computerA ;\n" +
                "assume computerA hasCreated msgA ;\n" +
                "assume computerB knowKeyOf computerA ;\n" +
                "assume computerA hasKeyOf computerB ;\n" +
                "assume msgA hasSensitive content ;\n" +
                "guarantee computerA sendMsgTo computerB ;\n" +
                "guarantee computerA forward msgA ;\n" +
                "guarantee computerB decryptMsgFrom computerA ;\n" +
                "guarantee computerA encryptMsgTo computerB ;";

//        SecurityLexer securityLexer = new SecurityLexer(CharStreams.fromString(csadlData));

        try {
            File csadlFile = new File("./src/data/v2_examples/v3.txt");
            FileInputStream is = new FileInputStream(csadlFile);
            SecurityLexer securityLexer = new SecurityLexer(CharStreams.fromStream(is));

            CommonTokenStream tokens = new CommonTokenStream(securityLexer);
            CSADLErrorListener errorListener = new CSADLErrorListener();
            SecurityParser securityParser = new SecurityParser(tokens);
            securityParser.removeErrorListeners();
            securityParser.addErrorListener(errorListener);
            ParseTree tree = securityParser.csadl();
            ParseTreeWalker walker = new ParseTreeWalker();
            SecurityBaseListener listener = new SecurityBaseListener();
            walker.walk(listener, tree);

            if(errorListener.hasErrors()){
                System.out.printf(ANSI_RED + "%s\n", errorListener);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

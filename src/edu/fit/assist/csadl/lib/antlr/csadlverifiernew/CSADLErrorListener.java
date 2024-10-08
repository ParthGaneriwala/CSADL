package edu.fit.assist.csadl.lib.antlr.csadlverifiernew;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/29/21
 * Institution: Florida Institute of Technology
 * Purpose:
 */
public class CSADLErrorListener extends BaseErrorListener {
    private List<SyntaxErrorItem> items;

    public CSADLErrorListener() {
        this.items = new ArrayList<SyntaxErrorItem>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        items.add(new SyntaxErrorItem(line, charPositionInLine, msg, offendingSymbol, e));
    }

    public boolean hasErrors() {
        return this.items.size() > 0;
    }

    @Override
    public String toString() {
        if (!hasErrors()) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for (SyntaxErrorItem s : items) {
            builder.append(String.format("%s\n", s));
        }
        return builder.toString();
    }
}

class SyntaxErrorItem {
    private int line;
    private Object offendingSymbol;
    private int column;
    private String msg;
    private RecognitionException oops;

    SyntaxErrorItem(int line, int column, String msg, Object symbol, RecognitionException oops) {
        this.line = line;
        this.column = column;
        this.msg = msg;
        this.offendingSymbol = symbol;
        this.oops = oops;
    }

    @Override
    public String toString() {
        if (oops == null) return String.format("[%d:%d] %s", line, column, msg);
        else {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            oops.printStackTrace(pw);
            pw.close();
            return String.format("[%d:%d] %s\n%s", line, column, msg, sw.toString());
        }
    }
}

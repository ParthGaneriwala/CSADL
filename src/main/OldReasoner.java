package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

/**
 * Author: fitzroi <fnembhard@fit.edu>
 * Date:   4/29/21
 * Institution: Florida Institute of Technology
 * Purpose:
 */
public class OldReasoner {
    public static void main(String[] args) throws Exception {
        int row = 0;
        int assume = 0;
        int guarantee = 0;
        File file = new File("./src/data/aaa.txt");
        if (file.exists()) {
            try {
                FileReader reader = new FileReader(file);
                LineNumberReader LR = new LineNumberReader(reader);
                while (LR.readLine() != null) {
                    row++;
                }
                LR.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(System.getProperty("user.dir"));
        Path path = Paths.get(System.getProperty("user.dir")).resolve("src/data/aaa.txt");
        BufferedReader myReader = new BufferedReader(new FileReader(path.toFile()));
        Map<String, String> library = new HashMap<String, String>();
        //Map<String, String> assumeMap = new HashMap<String, String>();
        //Map<String, String> guaranteeMap = new HashMap<String, String>();
        library.put("sendMsgTo", "hasConnectionWith");
        library.put("receiveMsgFrom", "hasConnectionWith");
        library.put("encryptMsgTo", "hasKeyOf");
        library.put("decryptMsgFrom", "knowKeyOf");
        library.put("forward", "hasCreated");

        int z = 0;
        int w = 5;//number of columns in the array
        int v = 0;
        // the array called "a" is for storing the code file content
        //where row is the number of rows in the code file
        //and w is the number of columns which is a fixed number 5
        //5 because of the CSADL language
        String[][] a = new String[row][w];
        String myLang = myReader.readLine();
        while (myLang != null) {
            if (!myLang.trim().equals("")) {
                String b[] = new String[4];
                b = myLang.split(" ");
                for (v = 0; v < b.length; v++) {
                    a[z][v] = b[v];
                    // System.out.println(a[z][v]);
                }

                z++;
                //count the number of lines start with assume
                if (myLang.startsWith("assume")) {
                    assume++;
                }
                //count the number of lines start with guarantee
                if (myLang.startsWith("guarantee")) {
                    guarantee++;
                }
                //System.out.println(assume+"    "+guarantee);
                myLang = myReader.readLine();
            }
        }
        //create an array called Assumption to store only assumptions statements
        String[][] Assumption = new String[assume][4];
        //create an array called Guarantee to store only guarantees statements
        String[][] Guarantee = new String[guarantee][4];
        int k = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i][0].equals("assume")) {
                //System.out.println("........................");
                for (int j = 0; j < 4; j++) {
                    Assumption[i][j] = a[i][j];
                    //System.out.println(Assumption[i][j]);
                }
            }
            else if (a[i][0].equals("guarantee")) {
                //System.out.println("........................");
                for (int j = 0; j < 4; j++) {
                    Guarantee[k][j] = a[i][j];
                    //System.out.println(Guarantee[k][j]);
                }
                k++;
            }
        }
        // the reasoning part
        System.out.println("...................................................");
        for(int i = 0 ; i < Guarantee.length ; i++) {
            String association = library.get(Guarantee[i][2]);
            //System.out.println(association);
            //System.out.println("........................");
            for (int j = 0; j < Assumption.length ; j++) {
                if (association.equals(Assumption[j][2])){
                    //guarantee computerB decryptMsgFrom computerA
                    if (Guarantee[i][2].equals("sendMsgTo")||Guarantee[i][2].equals("receiveMsgFrom")) {
                        if ((Guarantee [i][1].equals(Assumption[j][1]))&& (Guarantee [i][3].equals(Assumption[j][3]))
                                ||(Guarantee [i][1].equals(Assumption[j][3]))&& (Guarantee [i][3].equals(Assumption[j][1] ))) {
                            System.out.println("guarantee "+(i+1)+": "+Guarantee[i][1]+" "+Guarantee[i][2]+" "+Guarantee[i][3]+
                                    " satisfied based on \nassumption "+(j+1)+": "+
                                    Assumption[j][1]+" "+Assumption[j][2]+" "+Assumption[j][3]);
                            System.out.println("...................................................");
                            break;
                        }else {
                            System.out.println("Asset "+Guarantee[i][1]+" does not have association "+association+
                                    "\nwith asset " + Guarantee[i][3]+" in assumption");
                            System.out.println("...................................................");
                        }
                    }
                    else if(Guarantee[i][2].equals("forward")) {
                        if(Guarantee [i][1].equals(Assumption[j][1])&& Guarantee [i][3].equals(Assumption[j][3])) {
                            //System.out.println("guarantee "+(i+1)+" satisfied");
                            System.out.println("guarantee "+(i+1)+": "+Guarantee[i][1]+" "+Guarantee[i][2]+" "+Guarantee[i][3]+
                                    " satisfied based on \nassumption "+(j+1)+": "+
                                    Assumption[j][1]+" "+Assumption[j][2]+" "+Assumption[j][3]);
                            System.out.println("...................................................");
                            break;
                        }
                        else if (!(Guarantee [i][1].equals(Assumption[j][1]))&& (Guarantee [i][3].equals(Assumption[j][3]))) {
                            for (int d = 0 ; d < Assumption.length; d++) {
                                if (Assumption[d][2].equals("hasSensitive")) {
                                    System.out.println(Guarantee[i][1]+" cannot forward "+Guarantee[i][3]
                                            + "based on \nassumption "+(d+1)+": "+Assumption[d][1]+" "+" "+Assumption[d][2]+" "+Assumption[d][3]);
                                    System.out.println("...................................................");
                                    break;
                                }
                                else if (Assumption[d][2].equals("hasNormal")) {
                                    //System.out.println("guarantee "+(i+1)+" satisfied");
                                    System.out.println("guarantee "+(i+1)+": "+Guarantee[i][1]+" "+Guarantee[i][2]+" "+Guarantee[i][3]+
                                            " satisfied based on \nassumption "+(d+1)+": "+
                                            Assumption[d][1]+" "+Assumption[d][2]+" "+Assumption[d][3]);
                                    System.out.println("...................................................");
                                    break;
                                }
                            }
                        }
                    }
                    else if (Guarantee [i][1].equals(Assumption[j][1])&& Guarantee [i][3].equals(Assumption[j][3])) {
                        //System.out.println("guarantee "+(i+1)+" satisfied");
                        System.out.println("guarantee "+(i+1)+": "+Guarantee[i][1]+" "+Guarantee[i][2]+" "+Guarantee[i][3]+
                                " satisfied based on \nassumption "+(j+1)+": "+
                                Assumption[j][1]+" "+Assumption[j][2]+" "+Assumption[j][3]);
                        System.out.println("...................................................");
                        break;
                    }
                    else {
                        System.out.println("Asset "+Guarantee[i][1]+" does not have association "+association+
                                "\nwith asset " + Guarantee[i][3]+" in assumption");
                        System.out.println("...................................................");
                    }
                }
				/*else {
					System.out.println(association +" does not exist in assumption statement "+ (j+1));
					System.out.println("...................................................");
				}*/
            }
        }
        myReader.close();
    }


}

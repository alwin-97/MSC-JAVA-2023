package alin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Pearson {
    // private String Name;
    // private String Phone;
    // private String Email;
    private String[][] pearsondetails;
    private String srch;
    // private String[][] pearsondetailsclm;

    public Pearson(String[][] pearsondetails) {
        // contructr with parameter
        this.pearsondetails = pearsondetails;

    }

    public Pearson(String srch) {
        this.srch = srch;

    }

    public void prr(){
        String[][] pearsondetailsclm = new String[1][3];

                pearsondetailsclm[0][0] = "NAME";
                pearsondetailsclm[0][1] = "PHONE";
                pearsondetailsclm[0][2] = "EMAIL";

                System.out.println(
                        pearsondetailsclm[0][0] + "   " + pearsondetailsclm[0][1] + "   " + pearsondetailsclm[0][2]);
                System.out.println();

                System.out.println();
                System.out.println();

                // ptinting the array

                for (int i = 0; i < pearsondetails.length; i++) {
                    for (int k = 0; k < pearsondetails[1].length; k++) {
                        if (pearsondetails[i][k] != null) {
                            System.out.println(
                                    pearsondetails[i][k] + "   ");
                            // System.out.println("\n");

                        }

                    }
                }
    }

    public void serch(){

        // it is type of get method (used from extractoin the data fropm array)
        try{

            FileReader rw = new FileReader("contactdetails.txt");
            BufferedReader qw = new BufferedReader(rw);
            String line;

            while ((line =qw.readLine())!=null) {
                if (line.contains(srch)) {
                    System.out.println(line);
                    
                }
                
            }
            qw.close();
        }catch(Exception F ){

        }
        

    }

    // Pearson(String Name,String Phone,String Email){
    // this.Name = Name;
    // this.Phone = Phone;
    // this.Name = Name;
    // }

    public void printt() {
        String[][] pearsondetailsclm = new String[1][3];

        pearsondetailsclm[0][0] = "NAME";
        pearsondetailsclm[0][1] = "PHONE";
        pearsondetailsclm[0][2] = "EMAIL";

        try {
            FileWriter wrte = new FileWriter("contactdetails.txt", true);
            wrte.write("\n");
            wrte.write("\n");
            wrte.write("\n");
            wrte.write("WELCOME  ALIN TO THE PROGRAM ");
            wrte.write("\n");
            wrte.write("\n");
            wrte.write("\n");

            wrte.write("----------------------------------------------------------------------------------------");
            wrte.write("\n");
            wrte.write("\n");
            wrte.write("\n");
            wrte.write(pearsondetailsclm[0][0] + "   " + pearsondetailsclm[0][1] + "   " + pearsondetailsclm[0][2]);
            wrte.write("\n");
            for (int i = 0; i < pearsondetails.length; i++) {
                for (int k = 0; k < pearsondetails[1].length; k++) {
                    if (pearsondetails[i][k] != null) {
                        wrte.write(pearsondetails[i][k]+"      ");
                        // wrte.write("\n");

                    }

                   

                }
               
            }

            wrte.write("\n");

            wrte.close();

            FileReader red = new FileReader("contactdetails.txt");
            Scanner ried = new Scanner(red);
            while (ried.hasNextLine()) {
                System.out.println(ried.nextLine());
                
            }
            ried.close();

        } catch (Exception E) {

        }

    }
}

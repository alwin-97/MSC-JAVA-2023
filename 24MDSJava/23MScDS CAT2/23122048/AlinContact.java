import java.util.Scanner;

import alin.*; //  import package

public class AlinContact {
    static String[][] pearsondetails;// 2d array
    static int i = 0;
    static int po = 0;

    public static void main(String[] args) {
        String[][] pearsondetails = new String[31][3];// initialise the array  with 31 row and 3 coloum
        Scanner scan = new Scanner(System.in);// for taking the input
        while (true) {
            //menu driven
            System.out.println("1. add  new conmtact");
            System.out.println("2.  search in  conmtact");
            System.out.println("3.  listing conmtact");
            System.out.println("4. exit");

            System.out.print("what to do: ");
            int option = scan.nextInt();
            if (option == 1) {

                // data filled in to the array

                System.out.print("enter the name :  ");
                pearsondetails[i][0] = scan.next().toUpperCase();
                System.out.print("enter the phone :");
                pearsondetails[i][1] = scan.next();
                System.out.print("enter the email : ");
                pearsondetails[i][2] = scan.next();
                i++;

                // System.out.print("do u want to add more details (y/n) : ");
                // String ask = scan.next().toLowerCase();
                // if (ask.equals("n")) {
                // po++;

                // } else {
                // i++;
                // }

            }
            if (option == 2) {

                System.out.println("welcome Alin to the search box   ");
                System.out.println();
                System.out.println();
                System.out.println("------------------------------------------------------------------------");
                System.out.print("enter the name of the person :  ");
                String searchh = scan.next().toUpperCase();
// called the class from package 
                Pearson prsn = new Pearson(searchh);
                prsn.serch();

            }

            if (option == 3) {
                Pearson prsn = new Pearson(pearsondetails);
                prsn.printt();
                // prsn.prr();
                
                
                // break;

            }
            if (option == 4) {
                System.out.println("data loded sucessfully");
                break;

            }
        }

    }
}
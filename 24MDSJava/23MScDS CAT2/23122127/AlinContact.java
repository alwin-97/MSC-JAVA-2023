/*IMporting Our User Defined Package */
import Alin.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


import java.util.ArrayList;       


public  class AlinContact{
    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(System.in);
       
    
        System.out.println("WELCOME TO JAVA Mr. ALIN");
        ArrayList<String> details=new ArrayList<>();
        System.out.println("ENTER 1 TO ADD DETAILS");
        System.out.println("ENTER 2 TO print DETAILS");
        int choice=scan.nextInt();
        if (choice==1){
            for (int i=0;i<2;i++){
                System.out.println("ENTER NAME");
                String name=scan.nextLine();
                System.out.println("ENTER PHONE NUMBER");
                String num=scan.nextLine();
                System.out.println("ENTER MAIL ID");
                String Mail=scan.nextLine();
                /*String[] data={name,num,Mail};*/
                String combinedinput=name+"   "+num+"  "+Mail;
                Person data=new Person(name,num,Mail);
                /*details.add(new Person(name, num, Mail));   ;*/
                details.add(combinedinput);
                String[] TOTAL={name,num,Mail};
                FileWriter writer=new FileWriter("save.txt");
                writer.write(combinedinput);
                writer.close();


                

            }


        }
        else if (choice==2){
            /*printing details */
            System.out.println(details);
        }
        else{
            System.out.println("SEARCH NAME OF THE PERSON");
           
        }
        scan.close();
      







           
    }

    
}
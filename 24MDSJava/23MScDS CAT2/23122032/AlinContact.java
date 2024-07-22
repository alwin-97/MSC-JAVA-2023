/* Register Number 23122032
 MSCDSA
 */ 


import alin.Person;

import java.util.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.bufferReader;
import java.io.BufferWriter;


public class AlinContact{
    public static void main(String [] args){
   
    Scanner scan = new Scanner(System.in);

    do{
    System.out.println("-----------------------------");
    System.out.println("Welcome to AlinContact");
    System.out.println("-----------------------------");
    System.out.println("1. Add New Conatact");
    System.out.println("2. Search for an Existing Contact");
    System.out.println("3. Listing Contacts");
    System.out.println("4. To Exit");
    
    System.out.println("Enter Your Choice");

    int choice=scan.nextInt();
    

    switch(choice){
        case 1:
 
            // printDetails();
            // Person Person1=new Person("Shruti", 4334,"shdfjh@gmail.comk");
            // Person1.printDeatils();
            System.out.println("Enter the Name");
            String Name=scan.nextLine();
            System.out.println("Enter Phone Number");
            int Phone=scan.nextInt();
            System.out.println("Enter Email:");
            String Email=scan.nextLine();

            Person person=new Person();

            person.saveDetails();
            System.out.println("Contact Added");
            break;
        case 2:
                System.out.println("Enter the Nmae");
                String Name=nextLine();
                String fileName="ContactDetails.txt";
                try(BufferReader br=new BufferReader(new FileReader(filename))){
                String line;
                boolean found=false;
                while(line=br.readline()!=null){
                    parts=line.split(",");
                    if(Name=equalIgnorecase(Name)){
                        found=true;
                        System.out.println("Contact Found");
                        System.out.println("Name" + parts[0].trim(","));
                        System.out.println("Phone" + parts[1].trim(","));
                        System.out.println("Email" + parts[2].trim(","));
                        break;

                    }
                
                }catch(IOException e){
                    System.out.println("error!");
                }
            

            break;
        case 3:
            break;
        case 4:
            System.out.println("Existing.......");
            
            break;

        case 5:
            System.out.println("Invalid Choice!");
            break;
            
                }
    }

    }while(Choice!=4);

}
}
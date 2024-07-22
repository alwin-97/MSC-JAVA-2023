import alin.*;//importing person class

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java .io.IOException;


public class AlinContact{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         int choice =0;

        //  static String void Welcome(){
        //     System.out.println("Welcome to AlinContact,How can i help you?");

        // }

    
        Person [] details = new Person[300];
        int dcounter =0;

    do{
        System.out.println("1.Adding new contact");
        System.out.println("2.Searching existing contact");
        System.out.println("3.listing the contact");
        System.out.println("4.Exit the program");
        System.out.println("Enter your choice: ");
        choice =Integer.parseInt(scan.nextLine());
        
        switch(choice){
            case 1: //Adding the contact detalis 
                    System.out.println("Enter name: ");
                    String Name = scan.nextLine();
                    System.out.println("Enter Phone no : ");
                    int Phone = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter Email:");
                    String Email = scan.nextLine();
                    details[dcounter]= new Person(String Name,int Phone,String Email);
                    dcounter++;
                    System.out.println("Contact adding Successfully");
                
                break;

            case 2: // Searching a contact
                    System.out.println("Enter the contact name: ");
                    String SearchingName = scan.nextLine();
                    int index = -1;
                    for(int i =0; i<dcounter;i++){
                        if(details[i].getName().equals(SearchingName)){
                            index =i;
                            break;
                        }
                        if(index==-1){
                            System.out.println("Name is not found");

                        }
                        else{
                            details[index].printdetails();
                        }    
                    }
                    break;
            case 3: //Person's detalisare saved into a file
            
                try{
                    File file =new File("detalis.txt");
                    FileWriter fileWriter = new FileWriter(file,true);
                    fileWriter.append(details[dcounter].getDetalis());
            }catch(IOException e){
        
            
            }

            break;
            case 4:
            break;

        }

    }while(choice != 5);

}
}
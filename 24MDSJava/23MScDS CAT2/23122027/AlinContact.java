import alin.PersonDetail;
import management.FileManagementSystem;
//importing packages

import java.util.*;
//importing necessary library


//main class
public class AlinContact {
    public static void main (String [] args){

        //using scanner 
        Scanner scanner = new Scanner (System.in);
        FileManagementSystem fms = new FileManagementSystem();
        
        boolean exit = false;

        //printing menu options
        while(!exit){
            System.out.println("-------------------------------------");
            System.out.println("Hello Alin! Welcome to the program!");
            System.out.println("-------------------------------------");
            System.out.println("1. Add new contact.");
            System.out.println("2. Save contacts to file.");
            System.out.println("3. Load contacts in file.");
            System.out.println("4. Display list of contacts.");  
            System.out.println("5. Exit!");
            System.out.println( "Please enter your choice.");
            int choice = scanner.nextInt();
            scanner.nextLine();


            //using switch cases for the menu options
            switch (choice){
                case 1:
                System.out.println("Add new Contact!");
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Phone Number:");
                long PhoneNo = scanner.nextLong();
                scanner.nextLine();
                System.out.println("Email:");
                String Email = scanner.nextLine();
                System.out.println("Address:");
                String Address = scanner.nextLine();
                fms.addPerson(new PersonDetail(name, PhoneNo, Email, Address));
                System.out.println("Contact added successfully!");
                break;

                case 2:
                System.out.println("Enter file name");
                String saveFileName = scanner.nextLine();
                fms.saveToCSV(saveFileName);
                System.out.println("Contacts Saved Successfully");
                break;

                case 3:
                System.out.println("Enter File Name");
                String loadFileName = scanner.nextLine();
                fms.loadFromCSV(loadFileName);
                fms.displayPerson();
                break;

                case 4:
                System.out.println("List of contacts.");
                fms.displayPerson();
                break;

                case 5:
                exit = true;
                System.out.println("Exiting the application...");
                break;

                default:
                System.out.println("Invalid input, try again.");

            }

        }
        scanner.close();
    }

    
}

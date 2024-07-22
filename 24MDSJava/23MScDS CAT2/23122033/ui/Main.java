package ui;

// importing packages
import alin.Person;
import model.PersonManager;

import java.util.*;

public class Main{

    private static final Scanner scanner = new Scanner(System.in);
    private static final PersonManager manager = new PersonManager();

    public static void main(String[] args){
        while(true){
            //User Menu
            System.out.println("*****MENU*****");
            System.out.println("1. Add person");
            System.out.println("2. print all contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            //Adding a line
            scanner.nextLine();
        
        switch(choice){
            case 1:
                AddPerson();
                break;
            
            case 2:
                printAllContact();
                break;
            
            case 3:
                break;
            
            default:
                System.out.println("Invalid choice");
            }
        }  
    }
    private static void AddPerson(){
        try{
            System.out.print("Enter contact name: ");
            String name = scanner.nextLine();

            System.out.print("Enter phone number: ");
            int phone = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            manager.AddPerson(name, phone, email);
            System.out.println("Person added to your contact");

        }catch(Exception exception){
            System.out.println("File not found");
        }

    }

    private static void printAllContact(){
        manager.printAllContact();
    }
}


package Alin;

import java.util.*;

import Alin.Person;

public class AlinContact{
    /*Menu Driven for the different functions */
    public static void main(String[] args){
        System.out.println("Welcome to the AlinContactDetais");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("*****Alin ContactInfo*****");
            System.out.println("1.Adding new contact");
            System.out.println("2.Search for existing Contact");
            System.out.println("3.Display all Contact");
            System.out.println("4.Exiting");
            System.out.println("Enter you choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AddContact( );
                    break;
                case 2:
                    SearchContact();
                    break;
                case 3:
                    DisplayContact();
                    break;
                case 4:
                    System.out.println(".....Exiting.....");
                break;
                default:
                    System.out.println("Invalid choice please enter the correct choice !!!!");
            }
        }while(choice!=4);
        scanner.close();

        Person details = new Person();
        details.printdetails();
        details.savetofile();
    }

/*function for adding details of the person */
    public static void AddContact(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact details:");
        System.out.println("Enter the Name:");
        String Name = scan.nextLine();
        System.out.println("Enter your Contact Number:");
        long PhoneNo = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your Email_id:");
        String email = scan.nextLine();
        Person file = new Person(Name, PhoneNo , email);
        file.savetofile();
    }
/*function for searching details */
    public static void SearchContact(){

    }
/* funtion for display the details */
    public static void DisplayContact(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String Name = scan.nextLine();
        System.out.println("Enter your Contact Number:");
        long PhoneNo = scan.nextLong();
        System.out.println("Enter your Email_id:");
        String email = scan.nextLine();
        Person file = new Person(Name, PhoneNo , email);
        file.printdetails();
    }



}



import alin.*;

import java.util.*;

public class AlinContact {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        wellcome();
        PersonsDatabase database = new PersonsDatabase();
        while(true){
            System.out.println("Options You have:");
            System.out.println("----------------------");
            System.out.println("(1) Adding a new Contact");
            System.out.println("(2) Searching for a existing Contact");
            System.out.println("(3) Listing Contacts");
            System.out.println("(4) For exiting the Application");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 :
                    System.out.println("Adding a new contact");
                    System.out.println("----------------------");
                    System.out.println("Name of the person: ");
                    String Name = scanner.nextLine();
                    System.out.println("Phone number of the Person: ");
                    String Phone = scanner.nextLine();
                    System.out.println("Email id of the Person: ");
                    String Email = scanner.nextLine();
                    database.addPerson(Name, Phone, Email);
                    break;
                case 2:
                    System.out.println("Searching for a existing Contact");
                    System.out.println("----------------------");
                    System.out.println("Name of the person you want to find: ");
                    String S_Name = scanner.nextLine();
                    database.searchbyName(S_Name);
                    break;
                case 3:
                    System.out.println("Listing all the contacts ");
                    database.listcontacts();
                    break;
                case 4:
                    System.out.println("Exiting............");
                    scanner.close();
                    System.exit(0);
                default:
                System.out.println("Invalid choice plese enter between 1 - 4");
            }

        }
        
    }
    public static void wellcome(){
        System.out.println("WellCome Alin.......................");
        System.out.println("This is your Contact Manager Programe");
        System.out.println("I help you to Maintain your contacs");
    }

}

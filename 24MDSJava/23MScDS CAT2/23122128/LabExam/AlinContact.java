import alin.Person;
import Contacts.ContactManager;
import java.util.*;

@SuppressWarnings("unused")
public class AlinContact{
    private static final Scanner scanner = new Scanner(System.in);
    private static final ContactManager manager = new ContactManager();
    public static void main(String[] args) {
        while(true){
            System.out.println("\n1.Add Contact \n2.Print All Contacts \n3.Find Contact \n4.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 : 
                    addContact();
                break;
            
                case 2:  
                    manager.printAllContacts();               
                break;

                case 3 : 
                    findperson(null, choice, null);
                break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                
                    default:
                        System.out.println("Invalid Choice");


            }       

        }
    }
    private static void addContact(){
        System.out.print("Enter Contact's Name:");
        String name = scanner.nextLine();
        System.out.print("Enter Phone number:");
        int phone = scanner.nextInt();
        if(name.equals(null)){
            System.out.println("Invalid, Please enter a name");

        }
         else{
            manager.addContact(name, phone, name);
            System.out.println("Contact Added Successfully");
         }

    }
    private static void findperson(String name, int phone, String email){
        System.out.println("Enter name");
        String name1 = scanner.nextLine();
        if(name1.equals(manager.toString())){
            System.out.println("Name:"+ name +"Phone:"+phone+"Email:"+email);
        }
        else{
            manager.findperson(name1, phone, email);
            System.out.println("Added");
        }
    }
    
}
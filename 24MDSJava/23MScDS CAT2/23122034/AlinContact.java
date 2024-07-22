import java.util.Scanner;
// package import
import alin.*;

public class AlinContact {
    // Welcome message function
    public static void welcomeAlin(){
        System.out.println("******************************************************************************");
        System.out.println("******************************************************************************");
        System.out.println("*********************** JavaApplication To Manage Contact*********************");
        System.out.println("***********************  Welcome Alin to the Application *********************");
        System.out.println("******************************************************************************");
        System.out.println("******************************************************************************");
    }
    //Main method 
    public static void main(String[] args) {
        Person person = new Person();  // object creation  of a user defined class 
        welcomeAlin();
        Scanner sc = new Scanner(System.in); // object creation of a predefined class
        // Array of object
        Person [] persons = new Person[300];  // initalizing of an array
        int choice = 0; 
        int counter = 0;
        do {
            System.out.println("******************************************************************************");
            System.out.println("Press 1 to Adding a new contact ");
            System.out.println("Press 2 to Searching the contact");
            System.out.println("Press 3 to Listing the contact");
            System.out.println("Press 4 to Exit the program");
            System.out.println("Enter Your Choice ");
            System.out.println("******************************************************************************");
            choice = Integer.parseInt(sc.nextLine());
            // To perform function by pressing the keys 
            switch (choice) {
                case 1:
                    System.out.println(" Enter the Name ");
                    String Name = sc.nextLine();
                    System.out.println(" Enter the Phone ");
                    long Phone =Long.parseLong(sc.nextLine());
                    System.out.println(" Enter the Email ");
                    String Email = sc.nextLine();

                    persons[counter] =new Person(Name, Phone, Email);
                    person = new Person(Name, Phone, Email);
                    person.saveDetails(); 
                    counter++;
                    break;
                case 2:
                    System.out.println("Enter the name you want to Search");
                    String s_name = sc.nextLine();
                    person.search(s_name);
                    break;
                case 3:
                    person.printAll();
                        break;
                case 4:
                    System.out.println("******************************************************************************");
                    System.out.println("!! Thank You !!");
                    System.out.println("******************************************************************************");
                    System.exit(0);
                    break;
                default:
                    System.out.println("******************************************************************************");
                    System.out.println("Wrong Input Try Again!!!!");
                    System.out.println("******************************************************************************");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }   
}

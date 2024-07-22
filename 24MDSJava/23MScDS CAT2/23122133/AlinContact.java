// Importing the necessaries
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import alin.Person;

// Creating a public class called "AlinContact"
public class AlinContact{
    private static String name;
    private static long phone;
    private static String email;
    private static final String PERSON_FILE_PATH = "persons.txt";
    private static int totalContacts = 0;

    // Giving choices for maximum 200 persons to save their contacts
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person[] person = new Person[200];
        int personCounter = 0;
        while(true){
            // Showing our choices
            System.out.println("**********************************");
            System.out.println("\nMenu");
            System.out.println("1. Adding new contacts");
            System.out.println("2. Searching for existing contact");
            System.out.println("3. Listing all contacts");
            System.out.println("4. Exit!");
            // Selecting a choice to whether add, search or display total number of contacts
            System.out.println("**********************************");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice){
                // Choice for giving contacts inputs
                case 1:
                    acceptContacts();
                    break;

                // Choice for searching within the contacts 
                // case 2:
                //     boolean found = false;
                //     System.out.println("Enter person name: ");
                //     String searchName = scanner.nextLine().toLowerCase();
                //     for(int i = 0; i < personCounter; i++){
                //         if(person[i].getName().toLowerCase().equals(searchName)){
                //             found = true;
                //             person[i].printPersonDetails();
                //             break;
                //         }
                //     }
                //     if(!found){
                //         System.out.println("Invalid!");
                //     }
                //     break;

                // Choice for displaying the total number of contacts saved
                case 3:
                    displayAllContacts();
                    break;

                // Choice for exiting the program    
                case 4:
                    System.out.println("**********************************");
                    System.out.println("Exiting!");
                    return;

                // For throwing invalid choices
                default:
                    System.out.println("**********************************");
                    System.out.println("Invalid!");
            }
        }
    }

    // Accepting the details of persons in form of their name, phone no and email id while keeping it inside a try-catch loop
    private static void acceptContacts(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("**********************************");
            System.out.println("Enter person name: ");
            String name = scanner.nextLine();
            System.out.println("Enter his/her phone no: ");
            long phone = Long.parseLong(scanner.nextLine());
            System.out.println("Enter his/her email id: ");
            String email = scanner.nextLine();
            

            //Incrementing the contacts
            totalContacts++;
            
            // Writing contact details to "persons" file
            FileWriter personFileWriter = new FileWriter(PERSON_FILE_PATH, true);
            personFileWriter.write("**********************************\n");
            personFileWriter.write("Person Details:\n");
            personFileWriter.write("His/her name: " + name + "\n");
            personFileWriter.write("His/her phone no: " + phone + "\n");
            personFileWriter.write("His/her email id: " + email + "\n");
            personFileWriter.write("\n");
            personFileWriter.close();
            personFileWriter.write("Saved Successfully!");

            //Increment of Contacts
            totalContacts++;
        }catch(IOException e){
            System.out.println("Exception error!");
        }
    }

    // Displaying the total number of contacts saqved so far
    private static void displayAllContacts(){
        System.out.println("**********************************");
        System.out.println("Total contacts saved so far: " + totalContacts);
    }

    // Printing the person details on searching his/her name
    public void printPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + phone);
        System.out.println("Email ID: " + email);
    }
}
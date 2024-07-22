// Importing alin package
import alin.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class AlinContact{

    // Function to Welcome Alin
    static void welcomeDisplay(){
        System.out.println("\n****************************************");
        System.out.println("    Welcome to the Contact List Alin    ");
        System.out.println("****************************************\n");
    }

    // Printing the Table Title
    static void displayHeader(){
        String [] title = {"Name","Phone","Email"};
        int [] length = {30,15,40};
        for (int j = 0; j < 3; j++){
            for ( int i = 0; i < title.length; i++){
                if(j == 0 || j == 2){
                    System.out.print("|");
                    for (int k = 0; k < length[i]; k++){
                        System.out.print("-");
                    }
                }
                else if(j == 1){
                    System.out.print("|");
                    System.out.print(title[i]);
                    int len = length[i] - title[i].length();
                    for (int k = 0; k < len; k++){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        } 
    }

    // Printing the Details in table format
    static void printPersonContact(Person pr){
        String [] details = {pr.getName(), pr.getPhone(), pr.getEmail()};
        int [] length = {30,15,40};
        for (int j = 0; j < 2; j++){
            for ( int i = 0; i < details.length; i++){
                if(j == 1){
                    System.out.print("|");
                    for (int k = 0; k < length[i]; k++){
                        System.out.print("-");
                    }
                }
                else if(j == 0){
                    System.out.print("|");
                    System.out.print(details[i]);
                    int len = length[i] - details[i].length();
                    for (int k = 0; k < len; k++){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        } 
    }
    
    public static void main (String [] args){

        //Array of objects to store multiple contacts
        Person [] pr = new Person[100];
        int personCounter = 0;

        // Reading the Existing Data from File and Storing it using Array of Object
        File fileR = new File("alincontacts.csv");
        try{
            Scanner scanR = new Scanner(fileR);
            while(scanR.hasNextLine()){
                String [] line = scanR.nextLine().split(",");
                pr[personCounter] = new Person(line[0],line[1],line[2]);
                personCounter+=1;
            }
            scanR.close();
        }catch(Exception e){
            System.out.println("Error in Reading the File"+e);
        }
        Scanner sc = new Scanner(System.in);
        welcomeDisplay();

        // Menu Driven Program
        while(true){
            System.out.println("\nSelect the Action:\n1.Add New Contact\n2.Searching a Contact\n3.View All Contact\n4.Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1: // Adding New Contact to the Directory
                    System.out.println("\n------------------------");
                    System.out.println("    Adding New Contact  ");
                    System.out.println("------------------------\n");
                    System.out.print("Enter Person Name: ");
                    String name = sc.nextLine();
                    System.out.print("\nEnter Person Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("\nEnter Person Email: ");
                    String email = sc.nextLine();
                    pr[personCounter] = new Person(name,phone,email);
                    System.out.println("\nContact Added Successfully!");
                    personCounter+=1;
                    break;
                case 2: // Searching for a contact using name or phone or email from directory
                    System.out.println("\n----------------------------");
                    System.out.println("    Searching for Contact   ");
                    System.out.println("----------------------------\n");
                    if(personCounter == 0){ // Alert when there is no contact to search
                        System.out.println("You have 0 Contacts");
                        break;
                    }
                    System.out.print("Search using:\n1.Name\n2.Phone\n3.Email\nYour Choice:");
                    int sChoice = Integer.parseInt(sc.nextLine());
                    Person spr = null;
                    switch(sChoice){
                        case 1: // Search using name
                            System.out.print("\nEnter the name to search with: ");
                            String sname = sc.nextLine();
                            for(int i = 0; i < personCounter; i++){
                                if(pr[i].getName().equalsIgnoreCase(sname)){
                                    spr = pr[i];
                                }
                            }
                            if(spr == null){
                                System.out.println("Person not found");
                            }
                            else{
                                displayHeader();
                                printPersonContact(spr);
                            }
                            break;
                        case 2: // Search Using Phone
                            System.out.print("\nEnter the phone to search with: ");
                            String sphone = sc.nextLine();
                            for(int i = 0; i < personCounter; i++){
                                if(pr[i].getPhone().equals(sphone)){
                                    spr = pr[i];
                                }
                            }
                            if(spr == null){
                                System.out.println("Person not found");
                            }
                            else{
                                displayHeader();
                                printPersonContact(spr);
                            }
                            break;
                        case 3: // Search Using Email
                            System.out.print("\nEnter the email to search with: ");
                            String semail = sc.nextLine();
                            for(int i = 0; i < personCounter; i++){
                                if(pr[i].getEmail().equals(semail)){
                                    spr = pr[i];
                                }
                            }
                            if(spr == null){
                                System.out.println("Person not found");
                            }
                            else{
                                displayHeader();
                                printPersonContact(spr);
                            }
                            break;
                        default:
                            System.out.println("Kindly Select from the Given Option");
                            break;
                    }
                    break;
                case 3: // Viewing all the contacts in the directory
                    System.out.println("\n----------------------------");
                    System.out.println("    Viewing All Contact     ");
                    System.out.println("----------------------------\n");
                    if(personCounter == 0){ // Alert when there is no contact to view
                        System.out.println("You have 0 Contacts");
                        break;
                    }
                    displayHeader();
                    for( int i = 0; i < personCounter; i++){
                        printPersonContact(pr[i]);
                    }
                    break;
                case 4:

                    // Writing all the Current data into file
                    try{
                        FileWriter fileW = new FileWriter("alincontacts.csv");
                        for( int i = 0; i < personCounter; i++){
                            fileW.write(pr[i].getName()+","+pr[i].getPhone()+","+pr[i].getEmail()+"\n");
                        }
                        fileW.close();

                        System.out.println("\n****************************************");
                        System.out.println("Thank You for Using the Application Alin");
                        System.out.println("****************************************\n");

                        // Exits only if the file is written successfully
                        System.exit(0); 
                    }catch(Exception e){
                        System.out.println("Error in Writing the File");
                    }
                    break;
                default:
                    System.out.println("Kindly Select from the Options Provided");
            }

        }


    }


}
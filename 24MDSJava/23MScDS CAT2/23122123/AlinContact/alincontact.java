package AlinContact;

// importing necessary packages
import alin.person;
import java.util.*;
import java.io.*;


// main class alincontact
public class alincontact {
    // private List<person> 
    // creating a array to store person details
    private static ArrayList<person> personscollection = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            welcome();
            // asking choice from the user
            System.out.println("Select an Option");
            System.out.println("1. Adding new contact");
            System.out.println("2. Searching Contact");
            System.out.println("3. Listing Contacts");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            // cases for calling the methods/functions
            switch (choice) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                System.out.println("Enter Name to Search");
                sc.nextLine();
                String name = sc.nextLine();
                for (int i=0; i<personscollection.length;i++){
                    if (name.equals(person[i])){
                        System.out.println(personscollection[i].toString);
                    }
                }
                    break;
                case 3:
                    read();
                    listContact();
                    break;

                // saving and exiting
                case 4:
                    save();
                    System.out.println("Saving Done!!!");
                    System.out.println("Exiting...");
                    System.exit(4);
                    break;
                default:
                    break;
            }
        }
        while(choice !=5);
        sc.close();

    }

    public static void welcome(){
        System.out.println("Welcome to Alin's Contact List");
    }

    public void addcon(String name){

    }
    // function for adding the contacts
    private static void addContact(Scanner sc){
        System.out.println("Please enter the details");
        System.out.println("Enter Name");
        String phone1 = sc.nextLine();
        String name = sc.nextLine();
  
        
        System.out.println("Enter Phone");
        String phone = sc.nextLine();

        System.out.println("Enter Email");
        String email = sc.nextLine();
        // Collection[] String = new Collection[10]
        // String[] person = (name,phone,email);

        person person = new person(name,phone,email);
        personscollection.add(person);

        System.out.println("Success");

        try{
            FileWriter writer = new FileWriter("new.txt");
            writer.write ("Name: "+name+",");
            writer.write ("Phone: "+phone+",");
            writer.write ("Email: "+email+",");
            writer.close();

        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    // funtion for listing all the contacts
    private static void listContact(){
        for(person i : personscollection){
            System.out.println(i);
        }
    }

    // function for saving the contacts into a txt file
        public static void save(){
            try
                (BufferedWriter writer = new BufferedWriter(new FileWriter("contact.txt"))){
                    for (person i : personscollection){
                        writer.write(i.toString());
                    }
                    // System.out.println("Saved");
                }
            catch(IOException e){
                System.out.println("Error");
                e.printStackTrace();
            }
        }

    
    // function for reading the contacts from a txt file
    public static void read(){
        try
            (BufferedReader reader = new BufferedReader(new FileReader("new.txt"))){
                String line;
                while((line = reader.readLine())!= null){
                    String[] details = line.split(",");
                    if(details[0].equalsIgnoreCase("Name")){
                        String name =details[1];
                        String phone =details[2];
                        String email =details[3];


                        person person = new person(name,phone,email);
                        personscollection.add(person);
                    }
                }
                // System.out.println("Saved");
            }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }


}

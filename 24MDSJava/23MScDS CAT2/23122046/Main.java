// importing person class from package alin
import java.io.*;
import java.util.*;
import alin.Person;

class AlinContact {
    // static function to welcome alin to the program
    public static void welcome(){
        System.out.println("Welcome Alin!!");
    }
    Scanner scan = new Scanner (System.in);
    // adding contact details
    public static void addContact(){
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your phone number:");
        long phone = scan.nextLong();
        System.out.println("Enter your email id:");
        String email = scan.nextLine();
        persons.printDetails (name,phone,email);
        System.out.println("Details are saved succesfully!");

}
    // searching contact details based on their name
    public static void searchContact(String name){
        System.out.println("Enter the name of the person you want to search:");
        name = scan.nextLine();
        String [] splits;
        String flag;
        try {
            File file = new File ("contactDetails.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                splits = line.split(",");

                flag = "True";
                if(splits [0].equals(name)){
                    System.out.println("Name:" +splits[0]);
                    System.out.println("Phone number:" +splits[1]);
                    System.out.println("Email:" +splits[2]);
                } else {
                    System.out.println("Person doesn't exist!!");
                }

            }
        } catch (Ioexception e){
            System.out.println("Some error occurred");
        }


    }


    // list of contact details
    public static void listContacts(){
        System.outprintln("Name\t Phone Number \t Email ID");
        for(int i=0; i<personCounter; i++){

        
        Person person = persons[i];
        System.out.println(person.getName() + "\t" +
                           person.getPhone () + "\t"+
                           person.getEmail ()
                           );

    }
    
}
// saving to the file "contactDetails.txt"
public void saveToFile (){
    try{
        FileWriter fileWriter = new FileWriter ("contactDetails.txt");
        fileWriter.write ("Name\t Phone Number \t Email ID");
        fileWriter.write(name);
        fileWriter.write(phone);
        fileWriter.write(email);
        fileWriter.close();
        System.out.println("saved the details successfully!");


    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}
// main method
public class Main{
public static void main(String []args){
    // array of person details to store the person details
     Person [] persons = new Person [10];
    int personCounter =0;
    
    Scanner scan = new scan (System.in);
    int choice =0;
    while(true){
        choice = Integer.parseInt(scan.nextLine());
        //menu for adding, searching and listing
        System.out.println("Menu");
        System.out.println("Enter you choice: ");
        System.out.println("1. Add new contact");
        System.out.println("2. Search for an existing contact");
        System.out.println("3. List contacts");
        System.out.println("0. Exit");
    


    switch(choice){
        case 1 :
        addContact();
            break;
        case 2 :
        searchContact();
            break;
        case 3 :
        listContact();
            break;
        case 0 :
            System.out.println("Exiting...");
            saveToFile("ContactDetails.txt");
            System.exit(0);
            break;
        default:
            System.out.println("Not in the list...");
            break;
        Scanner.close();

    
}
}
}
}

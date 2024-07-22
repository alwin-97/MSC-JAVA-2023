package alin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Person{
    private string name;
    private long mobilenos;
    private double email;

}

public Person(string name, long mobilenos, double email){
    this.Person = "Person";
    this.email = "email";
    this.mobilenos = "mobilenos";
    this.name = "name";
    
}



public string to string(){
    return "person" + "name" + "email" + "mobilenos";
}

 //public methods for all the private variables
 public String getName(){
    return name;
}

public long getRegno(){
    return regno;
}

public String getEmail(){
    return email;
}




public static void main (string[]args){
    read Person FromFile("personDetails");
    Scanner scanner = new Scanner(sytem.in);
    System.out.println("here is the person");
    String searchName  = scanner.nextLine();
    Search & Display Person Details(searchName)
    scanner.close();
}


public class AlinContact{

    // creating a Scanner reference variable
    static Scanner scan = new Scanner(System.in);

    //Print functions for menu
    static int printMenu(){
        System.out.println("::::::Options::::::");
        System.out.println("1. Add new contacts");
        System.out.println("2. Search for existing contact");
        System.out.println("3. listing of contact");
        System.out.print("Enter your choice: ");
       
        return Integer.parseInt(scan.nextLine());
    }

    // function for saving details into the file
    static void SavePersonToFile(Person aliPerson){
        try{
            FileWriter writer = new FileWriter("alincontacts.csv", true);
            writer.write(stud.getName() + " " + alin.getRegno() + " " + alin.getEmail() + " " + alin.getCourse() + " " + alin.getYear());
            writer.close();
            System.out.println("contacts data saved");
        }catch(Exception exception){
            System.out.println("Error occured");
        }
    }

    static void search alincontact(){
        System.out.println("Enter the contact name: ");
        String searchName = scan.nextLine();

        try {
            File file = new File("ContactDetails.csv");
            Scanner filScanner = new Scanner(file);

            String[] alinData = {};

            while (filScanner.hasNextLine()) {
                studData = filScanner.nextLine().split("\t");
            }

            if(studData[0].equals((searchName))){
                System.out.println("contact Found");
                System.out.println("Name: " + alinDataData[0]);
                System.out.println("Reg no: " + alinDataData[1]);
                System.out.println("Email: " + alinDataData[2]);
                System.out.println("Course: " + alinDataData[3]);
                System.out.println("Year: " +alinDataData[4]);
            };

            filScanner.close();
        } catch (Exception e) {
            System.out.println("contact not found");
        }
    }

    public static void main(String)[] (args) {
        
        // Code for menu driven
        int options;

        do {
            options = printMenu();
            switch (options) {
                case 1:
                System.out.print("Enter the name of the contact: ");
                String name = scan.nextLine();
                System.out.println("Enter the phone: ");
                long regno = Integer.parseInt(scan.nextLine());
                System.out.print("Enter the email address: ");
                String email = scan.nextLine();
        
                alincontacts alinData = new Contact();
        
                SavecontactToFile(stud);
                    break;
        
                case 2:
                    searchcontact();
                    break;

                default:
                System.out.println("Invalid Entry");
                    break;
            }
        } while (options != 4);
    }
}





        
package alin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Person {

    String Name;
    int Phone;
    String Email;
    public int personCounter;
    static Scanner scan = new Scanner(System.in);

    //initializing the values through constructors
    public Person() {

        this.Name = "";
        this.Phone = 0;
        this.Email = "";
        this.personCounter = 0;

    }

    public Person(String Name, int Phone, String Email) {

        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        
        saveDetails(Name, Phone, Email);

    }

    // fuction to save the contact details of the person
    public void saveDetails(String Name, int Phone, String Email) {

        try {
            // writing to the file
            File newFile = new File("Contacts.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writeFile = new FileWriter(newFile, true);
            writeFile.write(Name + "," + Phone + "," + Email + "\n");
            writeFile.close();
        } catch (IOException e) {

            System.out.println("Error occured in writing the file");
        }

    }

    // function to search for the person
    public void searchPerson(String Name) {

        try {

            // reading from the file
            Scanner myReader = new Scanner(new File("Contacts.txt"));
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] details = data.split(",");
                if (details[0].equals( Name)) {
                    System.out.println("Found");
                    System.out.println(details[0] + "," + details[1] + "," + details[2]);
                    break;
                }
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Error in reading the file");
        }
    }

    // listing all the contacts
    public void listContacts() {
        try {
            Scanner myReader = new Scanner(new File("Contacts.txt"));
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("Error in reading the file");

        }
    }


    public String getName(){
        return this.Name;
    }
}

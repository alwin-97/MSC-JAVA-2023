
// package 

package alin;

// predefined class

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// Creation of a class

public class Person {

    // Data members

    String Name;
    long Phone;
    String Email;
    String[][] person;
    int counter = 0;

    // Default constructer

    public Person() {
        this.Name = " ";
        this.Phone = 0;
        this.Email = " ";
        this.person = new String[300][3];
        this.counter = 0;
    }

    // parameterize constructor

    public Person(String Name, long Phone, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.person = new String[300][3];
    }

    // method to print Individual Details

    public void printDetails() {
        System.out.println(" Name : " + this.Name + " Phone : " + this.Phone + " Email : " + this.Email);
    }

    // method with return type String

    public String getDetails() {
        return this.Name + "," + this.Phone + "," + this.Email + "\n";
    }

    // method to savedetail in the file

    public void saveDetails() {
        try {
            FileWriter File = new FileWriter("contact.txt", true);
            File.write(getDetails());
            File.close();
        } catch (Exception e) {
            System.out.println("Error when saving the file " + e.getMessage());
        }
    }

    // method to search the name in contact list

    public void search(String s_name) {
        try {
            FileReader file = new FileReader("contact.txt");
            Scanner filereader = new Scanner(file);
            while (filereader.hasNextLine()) {
                String line = filereader.nextLine();
                String name = line.split(",")[0].trim();
                if (name.equalsIgnoreCase(s_name)) {
                    System.out.println(line);
                }

            }
            filereader.close();
        } catch (Exception e) {
            System.out.println(" Error while searching the file " + e.getMessage());
        }
    }

    // method to print all the contact list

    public void printAll() {
        try {
            FileReader file = new FileReader("contact.txt");
            Scanner filereader = new Scanner(file);
            while (filereader.hasNextLine()) {
                System.out.println(filereader.nextLine());
            }
            filereader.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
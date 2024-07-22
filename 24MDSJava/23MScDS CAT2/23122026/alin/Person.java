package alin;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter; 

public class Person {
    public String name;
    public Long phone;
    public String email;
    public int personCounter;

    Scanner scanner = new Scanner(System.in);

    // Default Constructor
    public Person() {
    }

    // Parametrized Constructor
    public Person(String name, Long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void printDetails(String name, Long phone, String email) {
        System.out.println("NAME: " + this.name);
        System.out.println("PHONE: " + this.phone);
        System.out.println("EMAIL: " + this.email);
    }

    // FUNCTION TO CREATE A TEXT FILE FOR ADDING THE DETAILS
    // This function will create a text file of contact details
    public void createTxtFile() {
        try{
            FileWriter fileWriter = new FileWriter("details.txt");
            fileWriter.write("Name,Contact Number,Email ID\n");  
            fileWriter.close();
        } catch(Exception exception) {

        }
}

    // FUNCTION TO ADD THE DETAILS OF A PERSON
    // This function will add the details of a person and save them to the file
    public void addContact(){
        System.out.println("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter your Phone Number: ");
        this.phone = Long.parseLong(scanner.nextLine());

        System.out.println("Enter your EmailId: ");
        this.email = scanner.nextLine();

        try{
            FileWriter fileWriter = new FileWriter("details.txt");
            fileWriter.write(this.name + "," + String.valueOf(this.phone) + "," + this.email);
            fileWriter.close();
        } catch(Exception exception) {

        }

        System.out.println("Details are successfully added.");
    }

    // FUNCTION TO SEARCH THE DEAILS OF A PERSON
    // This function will search the details of a person
    public void searchContact(String filename){
        System.out.println("Enter the Person's Name you want to search");
        String name = scanner.nextLine();

        String[] parts;
        String flag;
        try{
            File file = new File(filename);
            
            Scanner fileReader = new Scanner(file);
            // fileReader.nextLine();
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                parts = line.split(",");
                flag = "True";
            if(parts[0].equals(name)) {
                flag = "False";
            } else {
                flag = "True";
            }
            if(flag.equals("False")) {
                System.out.println("Person's detail successfully found");
                System.out.println("Name: " + parts[0]);
                System.out.println("Phone Number: " + parts[1]);
                System.out.println("Email ID: " + parts[2]);
                break;
            } else {
                System.out.println("Person does not exist. Please check it again.");
            }
            }
            fileReader.close();   
        } catch(Exception exception) {
        }
    }


}
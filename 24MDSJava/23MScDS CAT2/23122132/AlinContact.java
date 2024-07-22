//importing 'Person' class from 'alin' package 
import alin.Person;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//class containing the main Method
public class AlinContact{ 
    private String[] personDetails;

    //static function to print the 'Welcome Alin' message 
    static void welcome(){
        System.out.println("Welcome Alin!");
    }
    
    //main method
    public static void main(String[] args) {

        String name;
        String phone;
        String email;
        //creating array for person details;
        // Person[] details = new Person[300]; //since she is meetin 10 people daily for 30 days

        
        Scanner scan = new Scanner(System.in);
        int ch=0;
        int count = 0;
        String details[]= new String[300];
        do{
            //menu-driven
            int choice;
            System.out.println("1. Add new contact");
            System.out.println("2. Search a contact");
            System.out.println("3. List all contacts");
            System.out.println("4. Exit");
            System.out.println("\n");
            System.out.print("Enter your choice: ");
            choice=Integer.parseInt(scan.nextLine());

            switch(choice){
                case 1:
                    //creating an object of class Person
                    Person person = new Person();
                    //taking user input
                    System.out.print("\n");
                    System.out.print("Enter name: ");
                    name=scan.nextLine();
                    System.out.print("Enter Phone no.: ");
                    phone=scan.nextLine();
                    System.out.print("Enter email: ");
                    email=scan.nextLine();
                    
                    String onePerson=person.personDetails(name, phone, email);
                    details[count]=onePerson;
                    count++;
                    System.out.println("Data added successfully");
                

                    break;
                case 2:
                //search for a contact
                    break;
                case 3:
                //reading the file to show the output
                    System.out.println(details[count]);
                    try{
                        File obj = new File("personDetails.txt");
                        Scanner read = new Scanner(obj);
                        while (read.hasNextLine()){
                            String data = read.nextLine();
                            System.out.println(data);}
                            read.close();
                        }
                        catch (FileNotFoundException e){
                            System.out.println("Error");
                            e.printStackTrace();
                        }
                    
                //list all contacts
                    break;
                case 4:
                //exit
                    Person person4 = new Person();
                    person4.write_to_file();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input. Enter a value between 1-4 only!");
                        break;}
                    System.out.println("Do you wish to continue?(y/n)");
                    ch = scan.nextLine().charAt(0);
            }
                while(ch=='Y'||ch=='y');
                scan.close();
                
        
    }}

 
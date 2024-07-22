import java.text.FieldPosition;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
//imported the Person class from user define package alin
import alin.Person;
// main class of alin packages named as ALinContact
public class AlinContact {
    static Scanner scan = new Scanner(System.in);
    Person[] person = new Person[10];  //created an array of object to store the person's detail
    static int counter = 0;

    //main function
    public static void main(String[] args) {


        //function to welcome Alin to the program
        System.out.println("**************************************");
        System.out.println("WELCOME TO THE CLI APPLICATION ALIN");
        System.out.println("**************************************");


        Person ppl = new Person();
        Scanner scan = new Scanner(System.in);
        int ch;
        //Menu - driven
        do {
            int choice = 0;
            System.out.println("1.Add new Contact");
            System.out.println("2.Search for an existing contact");
            System.out.println("3.List all contacts");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:                  
                    ppl.getInput();
                    // addContact();                      //functionality to add contact
                    break;
                
                case 2:
                    int number;
                    boolean found = false;
                    System.out.println("Enter the num to be searched:");
                    number = Integer.parseInt(scan.nextLine());
                    try {
                        File file = new File("contacts.txt");
                        Scanner fileReader = new Scanner(file);
                        while (fileReader.hasNextLine()) 
                        {
                            String line = fileReader.nextLine();
                            String[] parts = line.split("\t");
                            int num = Integer.parseInt(parts[0].split(":")[1].trim());
                            if (num == number) {
                                System.out.println("Contact Found!!");
                                System.out.println(line);
                                break;
                                
                            }
                            
                        }fileReader.close();
                        if(!found){
                            System.out.println("Not found");
                        }

                    } catch (FileNotFoundException e) {
                        e.getMessage();
                    }
                    // searchContact();                     //functionality to search a  contact
                    break;
            
                case 3:
                    ppl.printDetails();
                    // printDetails();                       //functionality to list all  contact
                    break;

                case 4:
                    ppl.saveToFile();
                    System.exit(0);                            // this option exits the program
                default:    
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue? then press (Y/y)");
            ch = scan.nextLine().charAt(0);
            
        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }
    
}

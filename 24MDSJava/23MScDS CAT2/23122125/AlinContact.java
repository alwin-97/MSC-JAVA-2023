
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import alin.Person;

//initializing the main class
public class AlinContact {

    public static void welcome() {
        System.out.println("Welcome alin");
    }

    // initializing the static mainfunction
    public static void main(String[] args) {

        // creating the object of the scanner class
        Scanner scan = new Scanner(System.in);

        Person person = new Person();// creating an object for the class person

        // initializing the array for storing the person details
        Person storedetails[] = new Person[10];
        int detcount = 0;// initializing the array count
        int choice;
        do {
            // creating the menu driven
            System.out.println("Welcome Alin");
            System.out.println("**MENU***");
            System.out.println("1.ADDING NEW CONTACT");
            System.out.println("2.SEARCHING FOR AN EXISTING CONTACT");
            System.out.println("3.LISTING CONTACTS");
            System.out.println("4.EXIT");
            System.out.println("ENTER THE OPTION");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    // implementing the functionality of adding a new person with the help of
                    // objects of person class
                    System.out.println("Enter the name of the person");
                    String name = scan.nextLine();
                    System.out.println("Enter the phone number");
                    int phone = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the email address");
                    String email = scan.nextLine();
                    storedetails[detcount] = new Person(name, phone, email);
                    detcount++;// incrementing the array count

                    break;
                case 2:
                    // implementing the functionality of searching for an existing person and
                    // dispaying the details of the person

                    System.out.println("searching");
                    System.out.println("Enter the name you want to search");
                    String searchname = scan.nextLine();
                    for (int i = 0; i < detcount; i++) {
                        if (storedetails[i].equals(searchname)) {
                            System.out.println("Person found");
                        } else {
                            System.out.println("Not found");
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < detcount; i++) {
                        System.out.println(storedetails[i].getPersondetails());
                    }
                    break;
                case 4:
                    System.out.println("Exiting..");
                    try {
                        // all the persons' data are saved to the file
                        File obj = new File("persondetails.txt");
                        if (obj.createNewFile()) {
                            System.out.println("File created");
                        } else {
                            System.out.println("File already exists");
                        }
                        // file writing
                        FileWriter writer = new FileWriter("persondetails.text", true);
                        // person = new Person(name, phone, email);

                        for (int i = 0; i < detcount; i++) {
                            writer.write(storedetails[i].getPersondetails() + "\n");
                        }
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("AN error occured");
                        e.printStackTrace();
                    }
                    try {

                        // loading the person's details from the file to the programming memory
                        File obj = new File("persondetails.txt");
                        Scanner reader = new Scanner(obj);
                        while (reader.hasNextLine()) {
                            String data = reader.nextLine();
                            System.out.println(data);
                            
                            for (int i = 0; i < detcount; i++) {
                                System.out.println(storedetails[i].getPersondetails());
                            }

                        }
                    } catch (IOException e) {
                        System.out.println("AN error occured");
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 4);
    }

}

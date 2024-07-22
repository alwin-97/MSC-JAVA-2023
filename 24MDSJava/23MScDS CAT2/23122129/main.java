// Sandeep Kumar G 23122129

import alin.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;  // comments in alin.java

public class main {
    public static void main (String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            Person[] persons = new Person[10];
            int per_count = 0;

            File per_File = new File(pathname:"Persons");           // write in a file "per_File"
            FileWriter per_writer = new FileWriter(per_File,append;true);
            Scanner per_reader = new Scanner(per_File);            // scan and read until last line

            char cont = ' ';

        do {                                                // apply menu driven program
            System.out.println("\n1. details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

        switch (choice) {                                                      
            case 1:

                System.out.println("Enter the name")
                String name = input.nextLine();
                break;

                System.out.println("Enter the email")
                String email = input.nextLine();
                break;

                System.out.println("Enter the Phone Number")
                int phone = input.nextInt();
                input.nextLine();
                break;

            persons[per_count] = new person (name,email,phone);
            per_writer;
            write(persons[per_count].printdetails() + persons [per_count].printdetails() + "\n");
            per_writer.close();
            per_count++;
            break;

            case 4:
                System.out.println("Exit the program")
                break;
            default:
                System.out.println("Invalid Choice")
                break;

        }

        System.out.println("Do you want to continue? (Yes or NO)");        // program for if you want to continue or not, so can exit..
        cont = input.next().charAt(0);
        }
        while (cont == 'Y' || CONT == 'y');
        input.close();
        per_reader.close();
        }
        scanner.close();
    }
    catch (Exception e) {                                        // to handle errors
    System.out.println("An error occured");
    e.printStackTrace();
}
}
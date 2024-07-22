package alin;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AlinContact extends Person {
    

    AlinContact(String name, String phone, String email){
        super(name, phone, email);
    }

    public void welcome(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hey Alin :) Welcome to Contact management system by Mubashir.");
        System.out.println("--------------------------------------------------------------------");
    }

    public void addContact(){
        try {
            Scanner scan  = new Scanner(System.in);
            FileWriter file = new FileWriter("contacts.csv");

            System.out.print("Enter your name: ");
            name = scan.next();
            System.out.print("Enter your phone number: ");
            phone = scan.next();
            System.out.print("Enter your E-mail: ");
            email = scan.next();

            Person per = new Person(name, phone, email);

            file.write(per.name + ", " + per.phone + ", " + per.email + "\n");
            file.close();

        } catch (Exception e) {
            System.out.println("An error occoured.");
        }
    }

    public void searchContact(){
        try {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the name you want to search: ");
            String search  = scan.next();

            FileReader readfile = new FileReader("contacts.csv");
            Scanner scanfile = new Scanner(readfile);

            if(search.equals(scanfile)){
                System.out.println(scanfile);
            }
            else{
                System.out.println("Name not found");
            }
            scanfile.close();

        } catch (Exception e) {
            System.out.println("An error occoured.");
        }
    }

    public void listContact(){
        try {
            
            FileReader readfile = new FileReader("contacts.csv");
            Scanner scanfile = new Scanner(readfile);
            while (scanfile.hasNextLine()) {
                System.out.println(scanfile.nextLine());
            }
            scanfile.close();

        } catch (Exception e) {
            System.out.println("An error occoured.");
        }
    }


    public static void main(String[] args) {

        AlinContact al = new AlinContact("Mubashir", "70188", "wedfrtgyhuj");

        al.welcome();
        Scanner scan = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("1. Add new contact");
            System.out.println("2. Search contact");
            System.out.println("3. List contacts");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();


            switch (choice) {
                case 1:
                    al.addContact();
                    break;
                case 2:
                    al.searchContact();
                    break;
                case 3:
                    al.listContact();
                    break;
                case 4:
                    break;
            }

        } while (choice == 4);
    }

}

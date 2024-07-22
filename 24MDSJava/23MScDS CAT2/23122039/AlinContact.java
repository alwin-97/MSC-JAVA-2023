import alin.Person;
import java.util.Scanner;


public class Contact{

//function for welcoming Alin

 public static void welcome() {
     
     System.out.printLn("Welcome Alin !!!.........");

}

}

//Main function

class AlinContact{

    public static void main(String[] args)
    {
     Scanner scanner =  new Scanner(System.in);
     int choice = 0;

while(true)
     // Printing the menu:
      System.out.printLn("Enter 1 for adding new contact");
      System.out.printLn("Enter 2 for searching for an existing contact ");
      System.out.printLn("Enter 3 for listing contacts");
       System.out.printLn("Enter 4 to exit");

      System.out.printLn("Enter your choice ");
      int choice =  scanner.nextInt();
      scanner.nextLine();
      
      switch(choice){

        case 1 : System.out.printLn("Enter you Name : ");
                String Name = scanner.nxtLine();
                System.out.printLn("Enter you phone number : ");
                long Phone = scanner.nextInt();
                scanner.nextLine();
                System.out.printLn("Enter you email : ");
                String Email = scanner.nextline();
              //craeting new object for the Person class
                Person person1 = new person(Name , Phone , Email);
                person1.add_contact(); // addinf the details provided for the new  person 
                break;
                

                // searching for an existing contact
        case 2 : System.out.printLn("Enter the name you want to search : ");
                 String Searchname = scanner.nextLine();
                 Person person2 = new Person();
                 person2.search_contact();
                 break;

                 //listing contacts

        case 3 : Person person3 = new Person();
                 person3.listing();
                 break;

                 //the file with all the contact details is saved when alin exits

         case 4 : Person person4 =  new Person();
                  person4.contact_in_file();
                  break;   

      }

    }
    }

import alin.person;
import java.io.*;
import java.util.*;

public class Alincontact extends person{
    public void addtofile(){
        try{
            Filewriter mywriter("contacts.txt",true);
        mywriter.write(printdetails);
        Filewriter.close();
    }catch(Exception e){

    }
    public static void main(String[]args)
    {
        public static void welcome(){                //using static function to print welcome message
            System.out.println("---------------------------------------");
            System.out.println("welcome to your contact list");
        }
        Scanner scan= new Scanner(System.in);

    person[][] persondetails = new person[300][3];
        while(true):{
            System.out.println("enter your choice:");
            System.out.println("1.add new contact");
            System.out.println("2.search for existing contact");
            System.out.println("3.list of contacts:");

         int choice =scanner.nextInt();
        scan.nextLine();

        switch(choice){
            case 1:
            // to add new contact
            System.out.println("enter the name:");
            String Name = scan.nextline();
            System.out.println("enter the phoneno.:");
            String phone = scan.nextline();
            System.out.println("enter the emailid:");
            String email = scan.nextline();
            persondetails[][] = new person(String Name,String phone,String email);
            persondetails[][].addtofile(Name,phone,email);                  //after new contact gets added it gets added to the text file

            case 2:
            // to search for an existing contact and displaying their details
            System.out.println("enter the name you want to search:");
            String searchname = scan.nextLine();
            boolean found = false;
            for(int i =0;i<300;i++){
                if (persondetails[i].getName().equalsIgnorecase(searchname)){
                    persondetails[i].printdetails();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("contact not found");
            }
            break;

            case 3:                     //list of contacts
                System.out.println("List of contacts");
                for(i=0,i<300,i++){
                    persondetails[i].printdetails();
                }
        }
        

    }
  }
}}




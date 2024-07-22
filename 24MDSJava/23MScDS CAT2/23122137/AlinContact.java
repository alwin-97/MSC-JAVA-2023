import alin.*;
import java.util.*;
import java.io.*;
import java.File.io.*;

 public class AlinContact{

    public static void main(String[]args){
        System.out.println("......................................................................");
        System.out.println("Welcome Alin");
        System.out.println("......................................................................");
        Scanner scan = new Scanner(System.in);
        int choice;
        char ch;

        // menu-driven program
        do{
        
            System.out.println("............................................................................");
            System.out.println("Menu:");
            System.out.println("............................................................................");
            System.out.println("1. Add new contact");
            System.out.println("2. Search an existing contact");
            System.out.println("3. List of a contact");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice=Integer.parsent(scan.nextline());


            switch(choice){
                // Adding the new contacts
                case 1:
                    System.out.println("Enter the name:");
                    String name=scan.nextline();
                    System.out.println("Enter the phone number:");
                    long phone_no=Long.parseLong(scan.nextLine());
                    System.out.println("Enter the email:");
                    String email=scan.nextline();

                    try{
                        FileWriter f1=new Filewrite("detail.txt",true);
                        f1.write(name+","+phone_no+","+email+"\n");
                        f1.close();
                    }
                    catch(IOException e){
                        System.out.println("An error occured:"+e.getMessage());
                    }
                    break;

                // Searching an existing contact with the help of name
                case 2:
                    System.out.println("Enter the name of the person:");
                    String name1 = scan.nextline();
                    try{
                        FileReader file = new FileReader("detail.txt");
                        Scanner sc= new Scanner(file);
                        while(sc.hasNextLine()){
                            String line = sc.nextline();
                            String[] parts = line.split(",");
                            if(parts[0].equals(name1)){
                                System.out.println(line);
                                
                            }
                        }
                        sc.close();
                    }
                    catch(IOException e){
                        System.out.println("An error occured:"+e.getMessage());
                    }
                    break;

                // Viewing the list of contact
                case 3:
                    try{
                        FileReader file = new FileReader("detail.txt");
                        Scanner sc= new Scanner(file);
                        while(sc.hasNextLine()){
                            String line =sc.nextline();
                            System.out.println(line);
                        }
                        sc.close();
                    }
                    catch(IOException e){
                        System.out.println("An error occured:"+e.getMessage());
                    }
                    break;
                // Exiting
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice");
                

            }
            System.out.println("Do you want to continue(Y/N)");
            ch=scan.nextLine().charAt(0);

        }
        while(ch =='Y');
        
    }
 }
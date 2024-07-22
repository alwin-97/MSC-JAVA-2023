import alin.Person;         //importing Person class from alin package
import java.util.Scanner;   // importing the scanner class
import java.io.File;        // importing File class to read
import java.io.FileWriter;     //importing FileWriter class to Write

public class AlinContact {
    public static void main(String args[]){
        

        Person [] persondetails = new Person[100]; 

        int personCounter = 0;
         File fileread = new File("personDetail.txt");
         try{
            Scanner scan = new Scanner(fileread);
            while(scan.hasNextLine()){
                String [] line = scan.nextLine().split(",");
                int phone = Integer.parseInt(line[1]);
                persondetails[personCounter] = new Person(line[0],phone,line[1]);
                personCounter += 1;
                scan.close();
            }
         }catch(Exception e){
            System.out.println("An Error occured");
         }

         Scanner sc = new Scanner(System.in);   //initializing scanner class to take inputs

        //Creating a menu driven program
        while(true){
            System.out.println("Menu");
            System.out.println("1: Add New Contacts");
            System.out.println("2: Search Contact");
            System.out.println("3: List All the Contacts");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());  // input for choosing menu option

            // switch case for viewing options from menu driven
            switch(choice){
                case 1:
                    // System.out.println("Add Person Details.....!!!");
                    // System.out.print("Enter the Nmae of the person: ");
                    // String name = sc.nextLine();
                    // System.out.println("Enter Phone Number: ");
                    // int phone = Integer.parseInt(sc.nextLine());
                    // System.out.println("Enter person's Email: ");
                    // String email = sc.nextLine();

                    // Person per_Details = new Person(name,phone, email);

                    // per_Details.print_personDetails();
                    welcome();
                    addDetails(sc);
                    return;

                case 2:
                    System.out.println("Search Contact........!!");
                    System.out.println("Enter Name");
                    String name = sc.nextLine();
                    
                    Person per1 = null;
                    
                    for(int i=0; i<personCounter; i++){
                        if(persondetails[i].getName().equals(name)){
                            per1 = persondetails[i];
                        }
                        if(per1== null){
                            System.out.println("Person not Found");
                        }
                        else{
                            System.out.println("Name: " + per1.getName());
                            System.out.println("Phone Number: " + per1.getPhone());
                            System.out.println("Email: " + per1.getEmail());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Person Details.............");

                    for(int i=0; i<personCounter; i++){
                        System.out.println("\nPerson "+(i+1) + ":");
                        persondetails[i].print_personDetails();
                    }
                    break;

                case 4:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Input......!!");
            }
        }

    }

    public static void welcome(){
        System.out.println("Welcome Alin...!!");

    }
    static void addDetails(Scanner scan){   //Taking input for person details

        System.out.println("Add Person Details.....!!!");
        System.out.print("Enter the Nmae of the person: ");
        String name = scan.nextLine();
        System.out.println("Enter Phone Number: ");
        int phone = Integer.parseInt(scan.nextLine());
        System.out.println("Enter person's Email: ");
        String email = scan.nextLine();

        Person per_Details = new Person(name,phone, email);

        per_Details.print_personDetails();
    }


}

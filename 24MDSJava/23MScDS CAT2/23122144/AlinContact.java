import alin.Person;
import java.util.Scanner;

public class AlinContact {

    static Scanner scan = new Scanner(System.in);
    static char choice = 'n';
    static Person personDetails = new Person(); //  creating object of the class
    static Person[] perDets=new Person[100];//initializing the array

    public static void welcome() {
        System.out.println( "Welcome to the program Alin");
    }

    public static void main(String[] args) {

        do {
            // menu driven program
            welcome();
            System.out.println("1.Add new contact");
            System.out.println("2.Search contact");
            System.out.println("3.List contacts");
            System.out.println("4.Exit");
            System.out.println("choose your option");
            int option = Integer.parseInt(scan.nextLine());
            

            switch (option) {

                case 1:
                    System.out.println("Enter Name");
                    String Name = scan.nextLine();
                    System.out.println("Enter Phone number");
                    int Phone = Integer.parseInt(scan.nextLine()); //typecasting
                    System.out.println("Enter Email");
                    String Email = scan.nextLine();
                   
                    perDets[personDetails.personCounter]=new Person(Name,Phone,Email);// saving details to an array
                    
                    // personDetails.saveDetails(Name, Phone, Email);
                    personDetails.personCounter += 1;

                    break;
                case 2:
                    
                    System.out.println("Enter Name");
                    String name = scan.nextLine();

                    // for (int i =0; i<personDetails.personCounter;i++){
                        
                    //     if(name.equals(perDets[i].getName())){
                    //         System.out.println(perDets[i]);
                    //     }
                    // }
                    personDetails.searchPerson(name);
                    break;
                case 3:
                    personDetails.listContacts();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to continue?(y/n)");
            choice = scan.nextLine().charAt(0);
        } while (choice == 'y');
    }
}
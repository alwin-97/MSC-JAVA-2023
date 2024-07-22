import alin.Person; //importing the package alin and the class associated with it
import java.io.*;
import java.util.*;//importing other packages

public class AlinContact {
    
    static void welcome(){   //A static function to welcome the user
        System.out.println("Welcome to the program Alin");
    }

    static void save_to_file(String filename,String content){  //Function to save the details in the file
        try(FileWriter writer = new FileWriter(filename,true)){
            writer.write(content);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void display_contact(){
        System.out.println("Displaying the list of contacts");
                try{
                    File flobj = new File("contact.txt");
                    Scanner reader = new Scanner(flobj);

                    while(reader.hasNextLine()){
                        String data = reader.nextLine();
                        System.out.println(data);  //Displaying the list of contacts that are stored in a file
                    }
                    reader.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }

    public static void main(String []args){  //main function
    Scanner scan = new Scanner(System.in);
    Person []pers_det = new Person[20];
    Person pers = new Person();  //ccreating an object from the Person class inside the package alin
    System.out.println("*********************************");
    welcome();

    display_contact();

    while(true){
        System.out.println("***************************************");
        System.out.println("MENU OPTIONS");     //List of menu options
        System.out.println("1. Add new contact");
        System.out.println("2.Search for an existing contact");
        System.out.println("3.List of contacts");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int choice = Integer.parseInt(scan.nextLine());

        switch(choice){
            case 1:
                
                pers.user_input();   //Calling a function using the object of the class inside the package
                System.out.println("*******************************");
                System.out.println("Contact added successfully");
                System.out.println("*******************************");
                pers.print_details();
                String details = pers.get_details();
                save_to_file("contact.txt", details);
                

            break;

            case 2:     //Seaerching an element in the file
                System.out.println("Enter the name of the contact to be searched");
                String search = scan.nextLine();
                try{
                    File flobj = new File("contact.txt");
                    Scanner reader = new Scanner(flobj);
                    boolean found=false;
                    while(reader.hasNextLine()){
                        String data = reader.nextLine();
                        String [] arr = data.split(",");   //Splitting the data inside the file using the delimiter
                        if(arr[0].equalsIgnoreCase(search)){
                            found = true;
                            System.out.println("Contact successfully found!");
                            System.out.println("Name: "+arr[0]);
                            System.out.println("Phone: "+arr[1]);
                            System.out.print("Email: "+arr[2]+"\n");
                        }
                    }
                    
                    reader.close();
                    if(!found){   //Displayin a message if the element is not found
                        System.out.println("Details not found");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            break;

            case 3:
                System.out.println("Displaying the list of contacts");
                try{
                    File flobj = new File("contact.txt");
                    Scanner reader = new Scanner(flobj);

                    while(reader.hasNextLine()){
                        String data = reader.nextLine();
                        System.out.println(data);  //Displaying the list of contacts that are stored in a file
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            break;

            case 4:
            System.exit(0);//Exiting the menu
            System.out.println("Contacts succcessfully added to the file");
            break;

            default:
            System.out.println("Invalid option");

        }   
    }
}
}

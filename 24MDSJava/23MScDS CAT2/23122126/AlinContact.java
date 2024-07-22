import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// importing the class inside the package
import alin.Person;
public class AlinContact {
    // function for taking inputs from the user
    static String[] inputs(Scanner scan){
        System.out.println("enter the person name:");
        String name = scan.nextLine();
        System.out.println("enter the person phone number:");
        String phone = scan.nextLine();
        System.out.println("enter the person email id:");
        String email = scan.nextLine();
        String[] list = {name,phone,email};
        return list;


    }
    // function which storing the details into the file
    static void save(String filename,String row){
        try {
            FileWriter file = new FileWriter(filename,true);
            file.append(row+"\n");
            file.close();
        } catch (IOException e) {
            System.out.println("cant write into this file");
            e.printStackTrace();
        }
    }
    // function which welcomin gthe alin
    static void welcome(){
        System.out.println("WELCOME ALIN TO YOUR PERSONAL CONTACT BOOK");
        System.out.println("HERE YOU WILL HAVE THE PERSONS CONTACT DETAILS WHOENER YOU MET SINCE LAST MONTH");
    }

    
    public static void main(String[] args) {
        // ctrreating the list of objects.
        Scanner scan = new Scanner(System.in);
        Person[] p = new Person[300];
        int p_count = 0;
        // reading the file and storing the details of the person into the list of objects.
        try{
            File file = new File("details.txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String[] line = read.nextLine().split(",");
                p[p_count] = new Person(line[0], line[1], line[2], line[3]);
                p_count++;
                
            }
        }catch(Exception e){
            System.out.println("CANT READ THIS FILE!");
            e.printStackTrace();
        }
        welcome();
        // choices given to alin.
        while (true) {
            System.out.println("enter 1 for adding new contact:");
            System.out.println("enter 2 for searching for an existing contact");
            System.out.println("enter 3 for listing all the contacts:");
            System.out.println("enter 4 for exiting the program");
            int choice  = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    String[] list= inputs(scan);
                    p[p_count] = new Person(list[0], list[1], list[2]);
                    String row = p[p_count].getdetails();
                    save("details.txt", row);
                    p_count++;
                    System.out.println("contact added successful");
                    break;

                case 2:
                    System.out.println("enter the person name that you want to search for:");
                    String name = scan.nextLine();
                    int index = -1;
                    for(int i=0;i<p_count;i++){
                        if (p[i].getname().equals(name)){
                            index = i;
                            break;
                        }
                    }

                    if (index == -1){
                        System.out.println("person not fount!");
                    }
                    else{
                        p[index].print_details();
                    }
                    break;
                case 3:
                    for(int i=0;i<p_count;i++){
                        p[i].print_details();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
            
        }


    }
}

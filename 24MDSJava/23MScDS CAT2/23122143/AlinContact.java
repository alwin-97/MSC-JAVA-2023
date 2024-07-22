package alin;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class AlinContact {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);  // Scanner is used to get user inputs for the menu-driven programms.
        Person deArray = new Person();   // New Array in order to store the details of the persons.

        int options;
        while(true){ // Here, we have created a meu-driven programme in order to use the programme in better and smooth way.
            System.out.println("*******************");
            System.out.println("Welcome Alin to the Programme");
            System.out.println("*******************");
            System.out.println("OPTIONS :");
            System.out.println("1. Adding New Contact");
            System.out.println("--------------------");
            System.out.println("2. Search For An Existing Contact");
            System.out.println("-----------------------");
            System.out.println("3. Listing Contacts ");
            System.out.println("-- ------------------");
            System.out.println("4. EXIT ");
            System.out.println("-----------------------");
            System.out.println("Enter Your Options ");
            System.out.println("______________________");
            options = Integer.parseInt(scan.nextLine());
            
            switch ((options)) {// switch is the method which is used when we have multiple functions and we want to run them simulataneously.
                case 1:
                // ADDING THE DETAILS OF A PERSON WHO MET ALIN
                System.out.println("Enter The Name Of The Person");
                String Name = scan.nextLine();
                System.out.println("Enter The Phone Number Of The Person");
                int Phone = Integer.parseInt(scan.nextLine());
                System.out.println("Enter  Email ID Of The Person");
                String Email = scan.nextLine();
                System.out.println("Enter The Age Of The Person");
                String Age = scan.nextLine();
                try {
                    FileWriter file = new FileWriter("Person_Details.txt",true); // Here with the help of FileWriter class, i am creating a file and saving all the details to that file.
                    file.write("\n Person_ Details \n");
                    file.write(Name + "," + Phone + "," + Email + "," + Age);
                    file.close();
                    System.out.println("Person's Details is added succesfully to the file");
                } catch (Exception e) {
                    e.printStackTrace();
                } 
                    break;

                case 2:

                // Functionality of searching for an existing person and displaying the details of that person
                System.out.println("Enter Person Name"); // We will search the Alin's contacts on the basis of the person's name
                String Person_name = scan.nextLine();  
                boolean found = false; // If the person is not found, then it will give a boolean result that is false which means no person with that name is there.
                try {
                    Scanner readFile = new Scanner(new File("Person_Details.txt"));
                    while(readFile.hasNextLine()){
                        String line = readFile.nextLine();
                        String []pd = line.split(",");
                        if(pd[0].equalsIgnoreCase(Person_name)){
                            System.out.println("Name"+pd[0]);
                            System.out.println("Phone"+pd[1]);
                            System.out.println("Email"+pd[2]);
                            System.out.println("Age"+pd[3]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("The Person is not found.");
                    }
                    readFile.close();
            
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
                case 3:
                // To List all the Alin's Contacts and Print them.
                try{
                    File file = new File("Person_Details.txt");
                    Scanner Scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        String line = Scan.nextLine();
                        System.out.println(line);
                    }
                    scan.close();
                }
                catch(Exception E){
                    E.printStackTrace();
                }
                case 4:
                System.out.println("Thank You");
                default:
                    break;
            }
        }
    }   
}
class Person{    // our clas
    String Name;  //Data Members 
    int Phone;
    String Email;
    String Age;


    Person(){     // Constructor 
        this.Name = "";  // Encapsulation Method : We are Extracting only the necessary data from our class
        this.Phone = 0;   // Here, wer are using the setter method where we are setting up the values of the data members that is we are initializing them.
        this.Email = "";
        this.Age = "";
    }
    Person(String Name,int Phone,String Email,String Age){
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Age = Age;
    }
    public String getName(){  // Here we are using another encapsulation method which is getter method, we are exracting or getting the necessary data or the data that we wants from the class. 
        return this.Name;
    }
    public int getPhone(){
        return this.Phone;
    }
    public String getEmail(){
        return this.Email;
    }
    public String getAge(){
        return this.Age;
    }
    public void printPerson_Details(){
        System.out.println("Name : "+ this.Name + ", Phone : " + this.Phone + ", Email :" + this.Email + ",Age" + this.Age); // here we are printing the details of a person that we have stored in the class.

    }
}




package Alin;

import java.io.*;

// creating a class name Persn with data Members Name, PhoneNo, email
public class Person{
    String Name;
    long PhoneNo;
    String email;


/*A Constructor named person 1. default constructor , 2. parametric Constructor */
    public Person(){
        this.Name = " ";
        this.PhoneNo = 0;
        this.email = " ";
    }

    public Person(String Name, long PhoneNo, String email){
        this.Name = Name;
        this.PhoneNo = PhoneNo;
        this.email = email;
   }

   /* Function for printing the details of contact */
   public void printdetails(){
    System.out.println("Name:"+Name);
    System.out.println("PhoneNo:"+PhoneNo);
    System.out.println("email:"+email);
   }

/*function for creating a file and save the deatils to file */
   public void savetofile(){
    try(FileWriter writer = new FileWriter("AlinDetails.txt", true)){
        String data = String.format(Name , PhoneNo , email);
        // FileWriter file = new FileWriter("AlinDetails.txt");
        writer.write(data);
        writer.close();
    }

    catch(IOException e){
        System.out.println("Exception Error occured");
        e.printStackTrace();
    }
}

}







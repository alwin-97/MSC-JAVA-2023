package alin;

import java.io.*;
import java.util.Scanner;
import java.FileWrite;
import java.FileReader;

class Person{
    String Name;
    int Phone;
    String Email;
    
    Person(){
        this.Name=Name;
        this.Phone=Phone;
        this.Email=Email;
    }

    Person(String Name, int Phone, String Email){
         this.Name=Name;
         this.Phone=Phone;
         this.Email=Email;
        
    }
    public void printDetails(){
        System.out.println("Name:" + Name);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);

    }
    public void saveDetails(){
        // FileWriter filewriter=new FileWriter("ContactDetails.txt");
        try{
            FileWriter writer =new FileWriter("ContactDetails.txt");
        System.out.println("Name:" + Name);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        writer.write("Name: "+ Name+ ","+ "Phone: "+ Phone +","+ "Email: "+ Email);
        writer.close();
        }catch (IOException e){
            System.out.println("Error!");
        }
        // filewriter.close();
    }
}



package alin;

import java.io.*;
import java.util.*;

public class Person{
    public String name;
    public String phone;
    public String email;
    
    public Person(){
        this.name = "";
        this.phone = "";
        this.email = "";
    }

    public Person(String name,String phone,String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void user_input(){
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Enter the name of the contact");
        name = scan.nextLine();
        System.out.println("Enter the mobile number of the contact");
        phone = scan.nextLine();
        System.out.println("Enter the email id of the contact");
        email = scan.nextLine();
        
    }

    public String get_details(){
        return name+","+phone+","+email+"\n";
    }

    public void print_details(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phone);
        System.out.println("Email ID: "+email);
    }

}
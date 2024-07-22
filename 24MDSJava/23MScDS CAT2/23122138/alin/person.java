package alin;
import java.io.*;
import java.util.*;

// person class 
class person{
    private String Name;
    private int Phone;
    private String Email;

// Store the values in the members
    person(String Name,int Phone,String Email){
     this.Name = Name;
     this.Phone = Phone;
     this.Email = Email;
    }
// printing the personal details
    public void print_details(){
        System.out.println("Name: "+ this.Name);
        System.out.println("Phone: "+ this.Phone);
        System.out.println("Email: "+this.Email);
    }
}
package alin.Details;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
// creating class with name PERSON WHICH IS HAVING DATAMEMBERS NAME,PHONE,EMAILS
class Person{
    public static String name;
    public static String phone;
    public static String email;

    Person(){
        this.name="";
        this.phone="";
        this.email="";


    }
    // constructor in Person class
    Person(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }


// function to print person details
public String person__show_details(String name,String phone,String email){
    System.out.println("name of the person is:" + name);
    System.out.println("phone of the person is:" + phone);
    System.out.println("email of the person is:" + email);
     
    return(name);
    // // ?creating an array to store person_details
    // String[] det= new det("  ,  ");
    // return(det)

}
 class person_details{
    public String person_show_details(String name,String email, String phone){
        System.out.println("phone of the person is:" + phone);
    return(phone);
    }
 }
    public  void main(String[]args){
        
        // String line=person_show_details();
        // return line;
    
    }  
    }

 

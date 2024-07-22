package alin;

import java.io.*;
import java.util.*;


class person{
    public String Name;
    public String phone;
    public String email;
  


    person(){
        this.Name = "";
        this.phone = "";
        this.email = "";
        
    }

    person(String Name,String phone,String email){
        this.Name = Name;
        this.phone = phone;
        this.email = email;
        
    }

    public String printdetails(){
        System.out.println("details of the person");
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        System.out.println("Name:"+Name);
        String phone = scan.nextLine();
        System.out.println("phone:"+phone);
        String email = scan.nextLine();
        System.out.println("email:"+email);
    }

    public String getName(){
        return this.Name;
    }
}

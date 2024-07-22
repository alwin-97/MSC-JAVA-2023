package alin;

import java.io.*;
public class Person{
    private String name;
    private long phone_no;
    private String email;

    // default constructor
    Person(){
        this.name="";
        this.phone_no=0;
        this.email="";
    }

    // parameterize constructor
    Person(String name,long phone_no,String email){
        this.name=name;
        this.phone_no=phone_no;
        this.email=email;
    }

    // getter method
    public String getName(){
        return name;
    }

    public long getPhone_no(){
        return phone_no;
    }

    public String getEmail(){
        return email;
    }

    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Phone number:"+phone_no);
        System.out.println("Email:"+email);

    }
}

public static void main(String[]args){
     Scanner scan =new Scanner(System.in);
     System.out.println("enter the name:");
     String name=scan.nextline();
     System.out.println("Enter the phone number:");
     long phone_no=Long.parseLong(scan.nextLine());
     System.out.println("Enter the email:");
     String email=scan.nextline();

     Person person = new Person(name,phone_no,email);

     person.printDetails();

}


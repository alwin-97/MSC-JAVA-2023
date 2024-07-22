//package alin; //importing packaage alin

//importing other neccessary pckages to run the program
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//person class having data members(nme,phone and email)
public class Person{
    String name;
    int phoneno;
    String email;

    //using constructor
    public person(String name,int phoneno,String email)
    {
        this.name = name;
        this.phoneno = phoneno;
        this.email= email;
    }
    public void display(){
        //function to print the persons' details
        System.out.println("The persons' details are:");
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+phoneno);
        System.out.println("Email: "+email);
    }
    //taking user input of the persons' details
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = Scanner.nextLine();
        System.out.println("Enter phone number");
        int phoneno = Scanner.nextInt();
        System.out.println("Enter Email ID:");
        String email = Scanner.nextLine();
        Person person = new Person(name, phoneno, email);
        person.display();
    
    }
}


package alin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class person{
    private String name;
    private int phone;
    private String email;

    person(String name,int phone,String email){
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    // methods
    public void diplay(){
        System.out.println("this is name "+ name + "this is customer email"+email+ "this is cutomer phone number"+ phone);

    }
    //
    // read inputs
    public static person readInput(){
        Scanner scan = readInput(){
        System.out.print("Enter name");
        System.out.print("enter email");
        System.out.print("enter phone");
        return  new readInput(name,email,phone);
        
    }

}
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean exit = false;
    person person = null;
    System.out.println("\n menu");
    System.out.println("name");
    System.out.println("email");
    System.out.println("phone");
    
    
    while(!exit){
        System.out.println("\nmenu");
        System.out.println("Create customer contact details");
        System.out.println("enter the email");
        
        int choice = scan.nextInt();
    boolean exit = false;
    person persons =null;


    }

    switch(choice){
        case 1:
            System.out.println("Enter the customer name ");
            String name1= scan.next();
            
            break;
        case  2:
        if (person ! = null){
            person.display();
        }

        else:
            person.display();

            break;
        case 3:
            if
            scan.close();
            System.exit;
            break;
        case 4:
            name == scan;
        default:
            break;
            System.out.println("Welcome to error");


        


    }
    

}

}
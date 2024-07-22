// Importing required Java packages and File

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
// Created a class Transaction with attributes Date, Transaction_type, Amount and Description as Private variables rather than using it as public variables.

public class Transaction{

    private int Date;
    private String Transaction_type;
    private int Amount;
    private String Description;


// As it is a Private variable we have to use "this." function to access the variables or attributes inside the class.
// Implemented a constructor named Transaction as constructors should have the same name as the class and this is a Default constructor.
Transaction(){
    this.Date = "";
    this.Transaction_type = "";
    this.Amount = 0;
    this.Description = "";

}
// And here it is a Parametric or Parametrisized constructor as we are passing Parameters in to the this Constructors.

Transaction(int Date, String Transaction_type, int Amount, String Description) {
    this.Date = Date;
    this.Transaction_type = Transaction_type; 
    this.Amount = Amount;
    this.Description = Description;
}

// Implementing Getter Methods to get the attributes from the Private variable 


public int getDate(){
    return Date;
}

public String getTransaction_type(){
    return Transaction_type;
}

public int getAmount(){
    return Amount;
}

public String getDescription(){
    return Description;
}


public void Details {
    System.out.println("The Date of Transactoin is : "+this.Date);
    System.out.println("The type of Transaction: "+ this.Transaction_type);
    System.out.println("The Amount : "+this.Amount);
    System.out.println("The Description : "+this.Description);
}

// Here Inheritance process is happening as class Expense Manager extends Transaction because it is inheriting the attributes and values from the parent class Transaction.

class Expense_Manager extends Transaction{
    private int total_income;
    private double expense;
}

    public class Expense_Manager(int) {
        this.total_income = 0;
        this.expense = 0;

    }
// Here we used the function Super to call the attributes from the parent class. This is what we can say as Encapsulation.

    public void Expense_Manager(int Date, String Transaction_type,int Amount, String Description, int total_income, int expense){
        super.Details(Date,Transaction_type,Amount,Description);
        System.out.println("Total income is : "+this.total_income);
        System.out.println("Total Expense is : "+this.expense);

    }


    // Created a main  class named ShineExpense

public class ShineExpense{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ShineExpense exp = new ShineExpense();
        Expense_Manager [] Trans_arr = new Expense_Manager[10]; 

        int count;
        double total_income;
        double total_expense;



        do{
            System.out.println("---------------");
            System.out.println("Welcome to Transaction Details Menu");
            System.out.println("Enter the options below: ");
            System.out.println("1.Add Transaction");
            System.out.println("2.View Transaction");
            System.out.println("3.View Total Statistics");
            System.out.println("4.Exit");
            System.out.println("----------------");
            choice = Integer.parseInt(sc.nextLine());
        } switch(choice){
                case 1:
                public void AddTransaction(){
                    Scanner sc = new Scanner(System.in);
                    Transaction [] Trans = new Transaction();
                    Trans [] arr = new Expense_Manager();
                    System.out.println("Enter the Transaction Date: ");
                    String Date = sc.nextLine();
                    System.out.println("View the Transaction Details: ");
                    String Transaction_type = sc.nextLine();
                    System.out.println("Enter the Amount: ");
                    String Amount = sc.nextLine();
                    System.out.println("Enter the Description: ");
                    String Description = sc.nextLine();
                }

                case 2:
                public void ViewTransaction(){
                    System.out.println("View the Transactoin Details: ");
                    try{
                        for(i=0,i<count,i++):
                        Trans_arr[count].details();
                    }
                }

                case 3:

                case 4:


                try{
                    FileWriter File = new FileWriter("details.txt");
                    Scanner sc1 = new Scanner(File);
                    FileWrite.write = filew

                }
  
           

             

                }
            }

        }
    }
}

    




















    



    




}
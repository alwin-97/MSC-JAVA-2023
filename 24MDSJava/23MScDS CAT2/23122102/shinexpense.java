import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.ArrayList;
import java.io.list;

class Transaction{      //Super class transaction which stores date,transaction type,amount,description
    protected int date;    //date of type int
    protected String ttype;   //transaction type
    protected int amount;   //total amount
    protected String description;   //description of the transaction

    public Transaction(int date,String ttype,int amount,String description){   //calling constructor
        this.date = date;  //this keyword used to call the data members
        this.ttype = ttype;
        this.amount = amount;
        this.description = description;
    }
}

class expensemanager extends Transaction{   //Inheriting properties from super class Transaction                                             
    private int totalincome;    //containing private variables of its own class
    private int expense;

    public expensemanager(int date,String ttype,int amount,String description,int totalincome,int expense){
        super(date,ttype,amount,description);   //super keyword used to call variables from super class i.e Transaction
        this.totalincome = totalincome;
        this.expense = expense;
    }

    public void printDetails(){     //Function to prints all the details of the Transaction
        System.out.println("Transaction Details :- " + this);
    }

    public void saveTOFile(String filename){    //Creating a function for saving details to file
        try(PrintWriter details = new PrintWriter(new FileWriter(filename,append:true)))
    }catch(IOException e){
        System.err.println("Error!")    //handling errors and exceptions
        e.printstackTrace()
    }
}

class TransactionStatistics{        //transaction statistics class for calculating total,finding min,max etc.
    private list<amount>transaction=new ArrayList<>();    //defining array list for storing amount 
    public double printstatistics(){    //function for detailed statistics
        double transactionAmount=0;
        double min=double.MAX_VALUE;
        double max=double.MIN_VALUE;
        for(Transaction amount:transactions){
            total_amount=total_amount+transaction.amount;
            if(transaction.amount<min){
                min=transaction.amount;
            }
            if(transaction.amount>max){
                max=transaction.amount;
            }
        }
    }
    
}
public class shinexpense{       //main class named shine expense
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int ch;
        do{      //Menu Options for Adding details,viewing transactions and total statistics
            int choice=0;
            System.out.println("**Welcome to Transaction Manager**");
            System.out.println("1-> ADD a new Transaction");
            System.out.println("2-> View all transactions");
            System.out.println("3-> View total statistics");
            System.out.println("4-> Exit")
            choice=Integer.parseInt(scan.nextLine());
            switch(choice){     //switch case is used to switch between different cases
                case 1:
                    System.out.println("Enter date of Transaction:");
                    int date = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter Transaction type:");
                    String ttype = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter Transaction Amount:");
                    int amount = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter description of Transaction:");
                    String description = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter Total Income:");
                    int totalincome = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter Your Expense:");
                    int expense = Integer.parseInt(scan.nextLine();)
                    expensemanager expense = new expensemanager(date,ttype,amount,description,totalincome,expense);     //stroing details in expensemanager class by calling it
                    expense.saveTOFile(filename:"transactions.txt");    //saing details in a file with name transactions
                    System.out.println("Your details are saved successfully");
                    break;
                case 2:
                    System.out.println("Your Transactions are:-");
                    printDetails();     //printing details of the transactions
                    break;
                case 3:
                    TransactionStatistics.printstatistics();
                    TransactionStatistics.printdetails();
                    TransactionStatistics.saveTOFile(filename:"transactions.txt");
                    System.out.println("Your details are saved successfully");
                    break;
                default:
                    System.out.println("Error! Enter Correct choice")
            }while(choice!=4);
            scan.close();
        }
    }
}
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Transaction {                            //Class named Transaction

    int date;                                  //Attributes of different datatypes
    String transactiontype;
    int amount;
    String description;

    public Transaction(int date, String transactiontype, int amount, String description){

        this.date= date;                                 //Constructors 
        this.transactiontype= transactiontype;
        this.amount= amount;
        this.description= description;
    }

    public void printDetails(){
        System.out.println("Date:"+ date);
        System.out.println("Transaction type:" + transactiontype);
        System.out.println("Amount:"+ amount);
        System.out.println("Description:"+ description);
    }


}
class Expensemanager extends Transaction{           //Class Expensemanager that inherits Transaction class

    public Expensemanager(int date, String transactiontype, int amount, String description) {
        super(date, transactiontype, amount, description);    
        
    }



    


}
public class ShinExpense{

    private static final int MAX_TRANSACTION= 100;
    private static Transaction[] transactions= new Transaction[MAX_TRANSACTION];
    private static int count= 0;
    private static final Scanner scanner= new Scanner(System.in); 

    public static void main(String[] args){

    }
    static Scanner scan= new Scanner(System.in);
    int choice;

    do{

        System.out.println("Welcome to Transaction managment app Menu");
        System.out.println("1. Add new transaction");
        System.out.println("2. View Previous Transactions");
        System.out.println("3. Total Transactions");
        System.out.println("4. Exit");

        choice= Integer.parseInt(scan.nextLine());

        switch(choice){
            case 1: 
            addTransaction();
            break;

            case 2:
            viewTransaction();
            break;

            case 3:
            totalTransactions();
            break;

            case 4:
            System.out.println("Exiting");
            scan.close();
            System.exit(0);

            default:
            System.out.println("Invalid choice please try again.");
        
        }
    }
    while(choice!=5);

    try{
        File file= new File("input.txt");                       //Reading from a file
        Scanner scan= new  Scanner(file);
        System.out.println("Transaction history");
        while(scan.nextLine() != null){
            String line= scan.nextLine();
            System.out.println(line);

        }

        FileWriter write= new FileWriter("output.txt");

        write.close();

        System.out.println("Succcess");


        private static void addTransaction(){                   //addTransaction function
            if(count < MAX_TRANSACTION){
                System.out.println("Enter transaction description:");
                String description= scan.nextLine();
                
            }
        }

        private static void viewTransaction(){
            System.out.println("Transactions:");               // ViewTransaction function
            for (int i=0; i< count; i++){
                System.out.println(transactions[i]);
                
            }
        }

        private static void totalTransactions(){

        }



    }

}

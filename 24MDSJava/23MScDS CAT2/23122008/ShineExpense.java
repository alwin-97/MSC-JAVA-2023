import java.util.*;
import java.util.Date;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.io.*;

class Transaction{
    //superclass

    static Scanner sc=new Scanner(System.in);

    private String day;
    private String typeOfTransaction;
    private int amount;
    private String description;

    //default constructor
    Transaction(){
        this.day="";
        this.typeOfTransaction="";
        this.amount=0;
        this.description="";
    }

    Transaction(String day, String typeOfTransaction, int amount, String description){
        this.day=day;
        this.typeOfTransaction=typeOfTransaction;
        this.amount=amount;
        this.description=description;
    }


    public void viewAll(){
        try{
            File file=new File("transactions.txt");
            Scanner fileReader=new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        }
        catch(Exception exception){}
    }

    public void saveTransactionToFile(){
        try{
            FileWriter fileWriter=new FileWriter("transactions.txt",true);
            fileWriter.write("**********************************\n");
            fileWriter.write("Date: "+this.day+"\n");
            fileWriter.write("Type of transaction: "+this.typeOfTransaction+"\n");
            fileWriter.write("Amount: "+this.amount+"\n");
            fileWriter.write("Description: "+this.description+"\n");
            fileWriter.close();
        }
        catch(Exception exception){}
    }

    public int getAmount(){
        return this.amount;
    }

    public String getType(){
        return this.typeOfTransaction;
    }
}

class Expensemanager extends Transaction{
    //subclass
    private int income=0;
    private int expense=0;

    Expensemanager(){
        income=this.income;
        expense=this.expense;
    }

    Expensemanager(String day, String typeOfTransaction, int amount, String description){
        super(day,typeOfTransaction, amount, description);
    }

    public void Save(){
        super.saveTransactionToFile();
        calStats();
    }

    public void View(){
        super.viewAll();
    }

    public void calStats(){
        if(super.getType().equalsIgnoreCase("income")){
            income=income+super.getAmount();
            System.out.println("Total Income: "+this.income);
        }
        else if(super.getType().equalsIgnoreCase("expense")){
            expense=expense+super.getAmount();
            System.out.println("Total Expense: "+this.expense);
        }
        else{
            System.out.println("Error");
        }
    }

    public void viewStats(){
        System.out.println("Total Income: "+this.income);
        System.out.println("Total Expense: "+this.expense);
    }

}

public class ShineExpense{
    //mainclass
    static Scanner sc=new Scanner(System.in);

    static void print(String msg){
        System.out.print(msg);
    }

    static void println(String msg){
        System.out.println(msg);
    }

    static void addNewTransaction(){
        SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy");
        Date date=new Date();
        println("To add a new transaction kindly help me with the following details.");
        println("Enter the transaction type: income or expense");
        String typeOfTransaction=sc.nextLine();
        println("Enter the transaction amount: ");
        int amt=Integer.parseInt(sc.nextLine());
        println("Enter the description for the transaction in one line: ");
        String description=sc.nextLine();
        Expensemanager manage= new Expensemanager(formatter.format(date),typeOfTransaction,amt,description);
        manage.Save();
    }

    static void viewTransactions(){
        Expensemanager expenseManager=new Expensemanager();
        expenseManager.View();
    }


    public static void main(String args[]){
        boolean flag=true; //initialised as a condition to check to continue the do-while loop

        do{
        println("***************************************************");
        println("                   Hello Shine :)                  ");
        println("***************************************************");
        println("Welcome to your personalised Finance Tracker Portal");
        println("");
        println("What would you like to do today?");
        println("1. Add a new transaction.");
        println("2. View all transactions.");
        println("3. View total statistics.");
        println("4. Exit.");
        int choice=Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1:
                //case to add a new transaction
                addNewTransaction();
                break;
            case 2:
                //case to view all transactions
                viewTransactions();
                break;
            case 3:
                //case to view all stats such as min amount, max amount, avg expenditure
                Expensemanager expenseManager=new Expensemanager();
                expenseManager.viewStats();
                break;
            case 4:
                println("You have chosen to exit from the portal. Are you sure you want to exit? Enter Y to exit.");
                String exit=sc.nextLine();
                if(exit.equalsIgnoreCase("Y")){
                    flag=false;
                }
                else{
                    flag=true;
                }
                break;
            default:
                println("Invalid entry.");
                flag=false;
            }
        }
        while(flag==true);
    }
}
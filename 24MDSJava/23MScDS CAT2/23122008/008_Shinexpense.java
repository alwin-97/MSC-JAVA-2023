import java.util.*;
import java.util.Date;
import java.io.FileWriter;
import java.io.*;
import java.text.SimpleDateFormat;

class Transaction{
    //superclass

    static Scanner sc=new Scanner(System.in);

    private String day;
    private String typeOfTransaction;
    private int amount;
    private String description;
    private int totalInc=0;
    private int totalExp=0;

    //default constructor
    Transaction(){
        this.day="";
        this.typeOfTransaction="";
        this.amount=0;
        this.description="Null";
    }

    Transaction(String day, String typeOfTransaction, int amount, String description){
        this.day=sc.nextLine(day);
        this.typeOfTransaction=typeOfTransaction;
        this.amount=amount;
        this.description=description;
    }

    Transaction(int amount, String typeOfTransaction){
        this.typeOfTransaction=typeOfTransaction;
        this.amount=amount;
    }

    public void saveTransactionToFile(){
        try{
            FileWriter fileWriter=new FileWriter("transactions.txt",true);
            fileWriter.write("**********************************\n");
            fileWriter.write("Date: "+this.day+"\n");
            fileWriter.write("Type of transaction: "+this.typeOfTransaction+"\n");
            fileWriter.write("Amount: "+this.amount+"\n");
            fileWriter.write("Description: "+this.description+"\n");
            fileWriter.write("**********************************\n");
            fileWriter.close();
        }
        catch(Exception exception){}
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

    public int CalIncome(){
        if(this.typeOfTransaction.equals("income")){
            totalInc=totalInc+this.amount;
        }
        return totalInc;
    }

    public int CalExpense(){
        if(this.typeOfTransaction.equals("expense")){
            totalExp=totalExp+this.amount;
        }
        return totalExp;
    }
}

class Expensemanager extends Transaction{
    //subclass
    private int income;
    private int expense;

    Expensemanager(){
        income=0;
        expense=0;
    }

    Expensemanager(int amount, String typeOfTransaction){
        super(amount,typeOfTransaction);
    }

    public void viewStats(){
        income=super.CalIncome();
        expense=super.CalExpense();
        System.out.println("Total Income: "+income);
        System.out.println("Total Expense: "+expense);
    }
}

public class Shinexpense{
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
        Transaction transaction= new Transaction(formatter.format(date),typeOfTransaction,amt,description);
        transaction.saveTransactionToFile();
        Expensemanager manage=new Expensemanager(amt,typeOfTransaction);
    }

    static void viewTransactions(){
        Transaction transac =new Transaction();
        transac.viewAll();
    }


    public static void main(String args[]){
        boolean flag=true; //initialised as a condition to check to continue the do-while loop

        do{
        println("***************************************************");
        println("                   Hello Shine :)                  ");
        println("***************************************************");
        println("Welcome to your personalised Finance Tracker Portal");
        println();
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
            case 5:
                println("Invalid entry.");
                flag=false;
            }
        }
        while(flag==true);
    }
}
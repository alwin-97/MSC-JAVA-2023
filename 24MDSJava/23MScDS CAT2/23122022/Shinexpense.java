import java.io.*;
import java.util.Scanner;

class Transaction { // Defining a class transaction
    String date;
    String transaction_type;
    long amount;
    String description;

    public Transaction(String date, String transaction_type, long amount, String description) { // constructor
        this.date = date;
        this.transaction_type = transaction_type;
        this.amount = amount;
        this.description = description;
    }

    void printtransaction(){
        System.out.println(" date of transaction is :" + date);
        System.out.println(" type of transaction (by card/cash) is :" + transaction_type);
        System.out.println("amount made by transaction is  :" + amount);
        System.out.println(" description of transaction :" + transaction_type);
    }

    // public String getdate(){
    //     return date;
    // }

    // public String gettransaction_type(){
    //     return transaction_type;
    // }

    // public long getamount(){
    //     return amount;
    // }

    // public String getdescription(){
    //     return description;
    // }
}

class Expensemanager { // Inheritance of class Expensemanager with Transaction
    Transaction transaction;
    long income;
    long expense;

    public Expensemanager(String date, String transaction_type, long amount, String description, long income, long expense) { // constructor
        this.transaction = new Transaction(date, transaction_type, amount,description);
        this.income = income;
        this.expense = expense;
    }

    void printexpense(){
        transaction.printtransaction();
        System.out.println(" total income  :" + income);
        System.out.println(" total expense  :" + expense);
    }

    // public long getincome(){
    //     return income;
    // }

    // public long getexpense(){
    //     return expense;
    // }

    // public void viewtransaction() {

    // }

}

public class Shinexpense {  // Inheritance of class Shinexpense  with Expensemanager
   
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Transaction Management : ");
            System.out.println("1. Add a new transaction  ");
            System.out.println("2. View transaction  : ");
            System.out.println("3. View total statistics  : ");
            System.out.println("2. Exit  : ");
            System.out.println("Enter your Choice :");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice) {
                case 1:

                    Transaction transaction = addtransaction(scan);
                    // savetransactionfile();
                    break;
                
                case 2:
                    // readtransactionfile();
                    Expensemanager.printexpense();
                    break;

                case 3:
                    // total_statistics();
                    break;

                case 4:
                    System.out.println("Exiting......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input..");

            }


        }
    }


    // Adding a transaction
    private static Expensemanager  addtransaction(Scanner scan){
        System.out.println("Enter date of transaction :");
        String date = scan.nextLine();
        System.out.println("Enter type of transaction (by card/cash) :");
        String transaction_type = scan.nextLine();
        System.out.println("Enter amount made by transaction  :");
        long amount = scan.nextLong();
        System.out.println("Enter description of transaction :");
        String description = scan.nextLine();
        System.out.println("Enter income  :");
        long income = scan.nextLong();
        System.out.println("Enter expense  :");
        long expense = scan.nextLong();

        return new Expensemanager(date, transaction_type, amount, description, income, expense);

    }
    
    // Saving a transaction to a file
    private static void savetransactionfile(String date, String transaction_type, long amount, String description, long income, long expense) {
        try (FileReader reader = new FileReader("transaction.txt",true)){
            reader.read(date + "," + transaction_type + "," + amount + "," + description + "," + income + "," + expense + "\n" );
        } catch (Exception exception) {
            System.err.println("File not found");
        }
    }


    // Reading a file 
    private static void readtransactionfile(String date, String transaction_type, long amount, String description, long income, long expense) {
        try (FileWriter writer = new FileWriter("transaction.txt",true)){
            writer.write(date + "," + transaction_type + "," + amount + "," + description + "," + income + "," + expense + "\n" );
        } catch (Exception exception) {
            System.err.println("File not found");
        }
    }
    
    // Viewing a transaction
    private static void viewtransaction(Scanner scan){
        System.out.println(" date of transaction is :" + date);
        System.out.println(" type of transaction (by card/cash) is :" + transaction_type);
        System.out.println("amount made by transaction is  :" + amount);
        System.out.println(" description of transaction :");
        System.out.println(" total income  :" + income);
        System.out.println(" total expense  :" + expense);

    }

    private static void total_statistics() {
    }
}
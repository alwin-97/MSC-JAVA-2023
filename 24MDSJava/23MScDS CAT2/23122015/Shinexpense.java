import java.util.*;
import java.io.*;

class Transaction{ // Super class of Expensemanager

    private String date;
    private String transtype;
    private double amount;
    private String desc;

    public Transaction(){ //default constructor
        this.date = "";
        this.transtype = "";
        this.amount = 0.0;
        this.desc = "";
    }

    public Transaction(String date, String transtype, double amount, String desc){ //parameterised constructor
        this.date = date;
        this.transtype = transtype;
        this.amount = amount;
        this.desc = desc;
    }

    // Setter methods
    public String getDate(){ 
        return this.date;
    }

    public String getTranstype(){
        return this.transtype;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getDesc(){
        return this.desc;
    }
    
    public void displayDetails(){
        System.out.print("Date: " + this.date + "\t" + "Transaction Type: " + this.transtype + "\t " + 
                        "Amount: " + this.amount + "\t" + "Description: " + this.desc);
        System.out.println();
    }

}

class Expensemanager extends Transaction{ // sub class of Transaction

    private double totalincome;
    private double expense;

    public Expensemanager(){ //default constructor
        this.totalincome = 0.0;
        this.expense = 0.0;
    }

    //parameterised constructor

    public Expensemanager(String date, String transtype, double amount, String desc,double totalincome, double income){
        super(date,transtype,amount,desc); // calling the super class constructor
        this.totalincome = totalincome;
        this.expense = income;
    }

    // Setter Methods
    public double getIncome(){
        return this.totalincome;
    }

    public double getExpense(){
        return this.expense;
    }

    public void displayExpDetails(){
        super.displayDetails(); // calling the super class function
        System.out.print("Total Income: " + this.totalincome + "\t" + "Expense: " + this.expense); 
        System.out.println();
    }

}

// Main class implementation
class Shinexpense{

    static int count;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Expensemanager> expenses = new ArrayList<>();
    static double totalexpense; // array list to store transactions dynamically


    public static void getInput(){ // function to get user inputs

        String date,transtype,desc;
        double amount,totalincome,expense;

        System.out.print("Enter the transaction date(DD-MM-YYYY): ");
        date = scan.nextLine();
        System.out.print("Enter the Transaction Type: ");
        transtype = scan.nextLine();
        System.out.print("Enter the amount: ");
        amount = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the Description: ");
        desc = scan.nextLine();
        System.out.print("Enter the income: ");
        totalincome = Double.parseDouble(scan.nextLine());
        System.out.print("Enter the expense: ");
        expense = Double.parseDouble(scan.nextLine());
        // adding to array list and invoking the sub class constructor
        expenses.add(new Expensemanager(date,transtype,amount,desc,totalincome,expense)); 
    }

    // function using Getter Methods to display details
    public static double printDetails(){
        totalexpense = 0.0;
        System.out.println("Details are: ");
        for(Expensemanager expensemanager : expenses){
            System.out.print("Date: " + expensemanager.getDate() + "\t" + "Transaction Type: " + expensemanager.getTranstype() +
                           "\t" + "Amount: " + expensemanager.getAmount() + "\t" + "Description: " + expensemanager.getDesc() +
                           "\t" + "Total Income: " + expensemanager.getIncome() + "\t" + "Expense: " + expensemanager.getExpense() + "\n");
            totalexpense = totalexpense + expensemanager.getExpense();
        }
        return totalexpense;
    }

    // function to display statistics
    public static void printStatistics(int count,double totalexpense){
        System.out.println("Statistic Details are: ");
        System.out.println("Total Transcations: " + (expenses.size()+count));
        System.out.println("Total Expenditure: "+totalexpense);
    }

    public static void main(String args[]){
        char ch;
        // to load the data saved into file
        try{
            File file = new File("ExpenseDetails.txt");
            count = 0;
            if(file.exists()){
                Scanner fileReader = new Scanner(file);
                while(fileReader.hasNextLine()){
                    count = count +1;
               System.out.println(fileReader.nextLine());
                }
            fileReader.close();
            }
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        
        do{
            int choice =0;
            System.out.println("1. Add a transaction.");
            System.out.println("2. View the transaction.");
            System.out.println("3. View Total Statistics. ");
            System.out.println("4. Exit.");
            System.out.print(" Enter a choice (1-4): ");
            choice = Integer.parseInt(scan.nextLine());

            switch(choice){
                case 1: getInput();
                        break;
                
                case 2: printDetails();
                        break;
                
                case 3: printStatistics(count,totalexpense);
                        break;

                case 4: try{
                    FileWriter filewriter = new FileWriter("ExpenseDetails.txt",true);
                    for(Expensemanager expensemanager : expenses){
                        filewriter.write("Date: " + expensemanager.getDate() + "\t" + "Transaction Type: " + expensemanager.getTranstype() +
                                       "\t" + "Amount: " + expensemanager.getAmount() + "\t" + "Description: " + expensemanager.getDesc() +
                                       "\t" + "Total Income: " + expensemanager.getIncome() + "\t" + "Expense: " + expensemanager.getExpense() + "\n");
                    }
                    filewriter.close();
                }catch(Exception e){
                    System.out.print(e.getMessage());
                }
                    System.exit(0);
                    break;
                default: System.out.print("Invalid choice!!");
            }
            System.out.print(" Do you want to continue: ");
            ch = scan.nextLine().charAt(0);
        }while((ch=='Y') || (ch == 'y'));
    }
}
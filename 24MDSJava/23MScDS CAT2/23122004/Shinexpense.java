import java.io.*; //importing  necessary libraries.
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;


class Transaction{

    private String date; //variables that can be assigned outside the transaction class.
    private String transactionType;
    private int amount;
    private String description;

    Transaction(){ //default constructor.
        this.date = "";
        this.transactionType = "";
        this.amount = 0;
        this.description = "";
    }

    Transaction(String date, String transactionType, String description, int amount){ //parametrized constructor.
        this.date = date;
        this.transactionType = transactionType;
        this.description = description;
        this.amount = amount;
    }

    public String getDate(){ //getter method.
        return this.date;
    }

    public String getTransactionType(){
        return this.transactionType;
    }

    public String getDescription(){
        return this.description;
    }

    public int getAmount(){
        return this.amount;
    }

    public  String PrintStringDetails(){
        return this.date + "," + this.transactionType + "," + this.description + "," + this.amount;
    }

}

class ExpenseManager extends Transaction{
    private int totalIncome;
    private int expense;

    ExpenseManager(){ //default constructor.
        this.totalIncome = 0;
        this.expense = 0;
    }

    ExpenseManager(int totalIncome, int expense){ //parametrized constructor
        this.totalIncome = totalIncome;
        this.expense = expense;
    }
    
    public int getTotalIncome(){ //getter method.
        return this.totalIncome;
    }

    public int getExpense(){
        return this.expense;
    }

    public  String printIntDetails(){
        return this.totalIncome+ "," + this.expense;
    }
}

public class Shinexpense{

    static Scanner scanner = new Scanner(System.in);

    static int options(){ //showing the menu driven
        System.out.println("Menu");
        System.out.println("1. Adding a new transactions");
        System.out.println("2. Viewing the transactions");
        System.out.println("3. Viewing the total statistics");
        System.out.println("4. Exiting the programme");
        System.out.println("What option woul you like to choose?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int choice;
        while(true){
            choice = options(); //shows options.
            switch(choice){
                case 1:
                    //adding new transaction.
                    System.out.println("Enter the date of transaction(dd/mm/yyyy)"); //user input details.
                    String date = scanner.nextLine();
                    System.out.println("Transaction type(card/cash)?");
                    String tran_type = scanner.nextLine();
                    System.out.println("Amount?");
                    int amt = Integer.parseInt(scanner.nextLine());
                    System.out.println("Description");
                    String desc = scanner.nextLine();

                    try{
                        FileWriter writes = new FileWriter("Transaction.txt",true); //writing to a file.
                        writes.write(date + "," + tran_type + "," + desc+ "," + amt + "\n"); //appending.
                        writes.close();
                    }
                    catch(IOException e){
                        System.out.println("Something went wrong while adding transactions");
                        e.printStackTrace(); //shows in which line the error is.
                    }
                    
                    break;

                case 2:
                    //viewing the transactions.
                    try{
                        
                        File file = new File("Transaction.txt"); 
                        Scanner readFile = new Scanner(file); //reading he file.
                        while(readFile.hasNextLine()){ //checking whether the file has next line.
                            System.out.println(readFile.nextLine());
                        }
                        readFile.close(); //closing the readFile.

                    }
                    catch(IOException e){
                        System.out.println("Something went wrong while viewing details");
                        e.printStackTrace(); //to print where the error is located.
                    }
                    
                    

                    break;

                    case 3:
                        //total statistics.
                        try{
                            File file = new File("Transaction.txt");
                            Scanner readFile = new Scanner(file);
                            int tot_amt =0; //assigning initally total amount as 0.
                            while(readFile.hasNextLine()){
                                String []datas = readFile.nextLine().split(",");
                                tot_amt += Integer.parseInt(datas[3]); //adding the amt which is at 3rd index of the file to tot_amt.
                            }
                        System.out.println("Grand total amt: "+tot_amt); //printing total amount.
                        readFile.close(); //closing the readFile.
                        }
                        catch(IOException e){
                            System.out.println("Something went wrong while calculating total amount");
                            e.printStackTrace();
                        }

                    //adding a new expense to file.

                    System.out.println("Total income");
                    int tot_income = Integer.parseInt(scanner.nextLine()); //user input income
                    System.out.println("Total Expense");
                    int exp = Integer.parseInt(scanner.nextLine()); //user input expense.

                    try{
                        FileWriter writes = new FileWriter("Expense.txt",true); //writing to a file.
                        writes.write(tot_income + "," + exp + "\n"); //appending to a file.
                        writes.close();

                        try{
                                File file = new File("Expense.txt");
                                Scanner readFile = new Scanner(file);
                                int tot_in =0; //assigning initally total amount as 0.
                                int tot_ex = 0;
                                while(readFile.hasNextLine()){
                                    String []data= readFile.nextLine().split(",");
                                    tot_ex += Integer.parseInt(data[0]); 
                                    tot_in += Integer.parseInt(data[1]); //adding the amt which is at 3rd index of the file to tot_amt.
                                }
                            System.out.println("total income: "+tot_in); //printing total income
                            System.out.println("total expense: "+tot_ex); //printing total expense
                            readFile.close(); //closing the readFile.
                            }
                            catch(IOException e){
                                System.out.println("Something went wrong while calculating total amount");
                                e.printStackTrace();
                            }
                    }
                    catch(IOException e){
                    System.out.println("Something went wrong while adding transactions");
                    e.printStackTrace(); //shows where the error is.
                    }

                        break;

                    case 4:
                        System.out.println("----Exiting----");
                        System.exit(0); //exiting the programme.
                        break;

                        default:
                            System.out.println("Invalid option");
                        break;
            }

            }
        }
 

    }



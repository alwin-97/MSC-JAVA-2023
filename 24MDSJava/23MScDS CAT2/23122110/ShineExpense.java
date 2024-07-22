import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShineExpense{
// Using Constructor to initialize Global variables
public static class Transaction {
    private String Date;
    private String Transaction_Type;
    private float Amount;
    private String Description;
    private float total_income;
    private float expense;


    Transaction(){
        this.Date=Date;
        this.Amount=Amount;
        this.Transaction_Type=Transaction_Type;
        this.Description=Description;
        this.expense=expense;
        this.total_income=total_income;
    }


   
}
// Inheriting to make use of Transaction Class
    public class Expensemanager extends Transaction{
        
        private String Date;
        private String Transaction_Type;
        private float Amount;
        private String Description;
        private float total_income;
        private float expense;
    
        //with the help of super keyword fetching data from there
        Expensemanager(String Date, String Transaction_Type, String Description) {
            super();}
            public void TransactionDetails(){
            try (Scanner scan = new Scanner(System.in)) {
                int numTrans = Integer.parseInt(scan.nextLine());
                for(int i=0;i < numTrans; i++){
                    System.out.println("Enter the Date");
                    this.Date=scan.nextLine();
                    System.out.println("Enter the Transaction Type");
                    this.Transaction_Type=scan.nextLine();
                    System.out.println("Enter the Description");
                    this.Description=scan.nextLine();
                    scan.close();
                }
            } catch (NumberFormatException e) {
                System.out.println("Error Occured");
                e.printStackTrace();
            }
        }
        //defining a function to Add the Transactions
        public void AddTransaction(){
            Scanner scan = new Scanner(System.in);
            int numTrans = Integer.parseInt(scan.nextLine());
            for(int i=0;i < numTrans; i++){
                System.out.println("Enter the Amount");
                this.Amount=Float.parseFloat(scan.nextLine());
                System.out.println("Total Income");
                this.total_income=Float.parseFloat(scan.nextLine());
                System.out.println("Total Expense ");
                this.expense=Float.parseFloat(scan.nextLine());
            }
            scan.close();
        }
        public void viewTransactions(){
            System.out.println("Show the Number of Transactions Made :");
        }

        public void TotalStatistics(){
            System.out.println("Total Amount Received :" + (this.Amount+=Amount));
            System.out.println("Total Income :" + (this.total_income+=Amount));
            System.out.println("Total Expense :" + (this.expense+=expense));
        }
        
        public void Filewriting(){
            try{
                FileWriter myFile = new FileWriter("Transactions.txt",true);
                myFile.write("Transactional Details\n");
                myFile.write("Total Amount Recieved :" + (this.Amount));
                myFile.write("Total Income  :" + (this.total_income));
                myFile.write("Total Income  :" + (this.expense));
                myFile.close();
            }catch(IOException e){
                System.out.println("An Error Occured");
                e.printStackTrace();
            }
        }
        public void ReadFile(){
            try{
            FileReader myRead = new FileReader("transactions.txt");
            Scanner myReader= new Scanner(myRead);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
        }
    }
    private static final int choice = 0;
    public static void main(String[] args) {
            Transaction tr = new Transaction();
            Scanner scan = new Scanner(System.in);
            do{
                System.out.println("-----------------------------");
                System.out.println("    SHINE EXPENSE TRACKER    ");
                System.out.println("-----------------------------");
                System.out.println("1. Add Your Transcation Details");
                System.out.println("2. Add New Transaction");
                System.out.println("3. View Transactions");
                System.out.println("4. Total Statistics");
                System.out.println("5. Updated Database");
                System.out.println("6. Old Database");
                System.out.println("7. Exit");
                System.out.println("\n\nEnter your Choice to Continue");
                int choice = Integer.parseInt(scan.nextLine());
                switch (choice) {
                    case 1:
                    ((ShineExpense.Expensemanager) tr).TransactionDetails();
                        break;
                    case 2:
                        ((ShineExpense.Expensemanager) tr).AddTransaction();
                        break;
                    case 3:
                        ((ShineExpense.Expensemanager) tr).viewTransactions();
                        break;
                    case 4:
                        ((ShineExpense.Expensemanager) tr).TotalStatistics();
                        break;
                    case 5:
                        ((ShineExpense.Expensemanager) tr).Filewriting();
                        break;
                    case 6:
                        ((ShineExpense.Expensemanager) tr).ReadFile();
                    default:
                        break;
                }
            }while(choice!=7);
        }
    }

  



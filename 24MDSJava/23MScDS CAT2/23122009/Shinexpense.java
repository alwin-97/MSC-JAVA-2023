import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class Transaction{
    private String date;
    private String transactiontype;
    private int Amount;
    private String description;
    public Transaction(String date, String transactiontype, int Amount , String description){
        this.date=date;
        this.transactiontype=transactiontype;
        this.Amount=Amount;
        this.description=description;
    }
    public void printDetails(){
        System.out.println("Date"+date);
        System.out.println("transaction type"+transactiontype);
        System.out.println("Amount"+Amount);
        System.out.println("Description"+description);
    }
}//extending the first class with the second one
class ExpenseManager extends Transaction{
    private int totalincome;
    private int expense;
    public ExpenseManager(String date, String transactiontype, int Amount , String description,int totalincome,int expense){
        super (date,transactiontype,Amount,description);
        this.totalincome=totalincome;
        this.expense=expense;
    }
@Override //overriding details from class
public void printDetails(){
    super.printDetails();
    System.out.println("Total Income"+totalincome);
    System.out.println("Expenses"+expense);
}

}
// class Shinexpense extends Transaction{
//     private int newtransactions;
//     private String viewtransactions;
//     private String total;
//     public Shinexpense(String date, String transactiontype, int Amount , String description, int newtransactions,String viewtransactions,String total){
//         super ( date, transactiontype,Amount,description);
//         this.newtransactions=newtransactions;
//         this.viewtransactions=(date + transactiontype + Amount + expense + newtransactions);
//         this.total=(Amount + expense);
//     }
// @Override
// public void printDetails(){
//     super.printDetails();
//     System.out.println("New Transaction"+ newtransactions);
//     System.out.println("transactions are"+ viewtransactions);
//     System.out.println("Total is "+ total);


// }
// }

//Intializing the main class
public class Shinexpense{
    // private static final String FILE_PATH="cac.csv";
    public static void main (String[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter details of transaction:");
        System.out.print("date:");
        String Transactiondate=scanner.nextLine();
        System.out.print("transaction type:");
        String Transactiontransactiontype=scanner.nextLine();
        System.out.print("Amount:");
        int TransactionAmount=scanner.nextInt();
        System.out.print("description:");
        String Transactiondescription=scanner.nextLine();
    
    Transaction transaction=new Transaction(Transactiondate,Transactiontransactiontype,TransactionAmount,Transactiondescription);

    System.out.println("Enter details For Expense manager:");
    System.out.print("Total Income:");
    int ExpenseManagertotalincome=scanner.nextInt();
    System.out.print("Expenses:");
    int ExpenseManagerexpense=scanner.nextInt();
    // ExpenseManager expensemanager = new ExpenseManager(ExpenseManagertotalincome,ExpenseManagerexpense);

    System.out.println("Transaction Details");
    transaction.printDetails();
    // System.out.println("Expense Detail");
    // expensemanager.printDetails();
    // try{
    //     FileWriter writer = new FileWriter(FILE_PATH,true);
    //     writer.write(Transactiondate","+","Transactiontransactiontype);
    //     writer.close();
    //     System.out.println("Transaction Details saved to "+ FILE_PATH);
    // } catch(IOException e){
    //     eprintStacktrace();
    // }
    
    scanner.close();

    }
}
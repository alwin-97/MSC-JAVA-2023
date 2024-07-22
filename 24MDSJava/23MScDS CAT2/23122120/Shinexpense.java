import java.util.*;
import java.io.*;
import java.time.LocalDate;

class Transaction{
    String date;
    String type_transaction;
    String amount;
    String description;

    Transaction(String date,String transaction,String amount,String description){
        this.date=date;
        this.type_transaction=transaction;
        this.amount=amount;
        this.description=description;
    }
    void printdetails(){
        System.out.println("date:"+date);
        System.out.println("transaction:"+type_transaction);
        System.out.println("amount:"+amount);
        System.out.println("description:"+description);
    }
}
class Expensmanager extends Transaction{
    int Total_income;
    int expense;

    Expensmanager(String date, String transaction,String amount,String description,int Total_income,int expense){
        super(date,transaction,amount,description);
        this.Total_income = Total_income;
        this.expense = expense;
    }
   
    void printdetails(){
        super.printdetails();
        System.out.println("Total_Income:"+Total_income);
        System.out.println("expense:"+expense);
    }
}
public class Shinexpense{
public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("1.Adding new Transaction");
    System.out.println("2.Viewing the transaction");
    System.out.println("enter the option");
    int type = Integer.parseInt(scanner.nextLine());
    if(type==1){
        System.out.println("Enter Transaction details");
        System.out.println("Ente date (dd/mm/yyyy)");
        String transaction_date=scanner.nextLine();
        System.out.println("Enter Transaction Type");
        String transaction_type= scanner.nextLine();
        System.out.println("Enter the Amount");
        String transaction_amount=scanner.nextLine();
        System.out.println("Enter the description");
        String transaction_description=scanner.nextLine();
        Transaction transaction=new Transaction(transaction_date, transaction_type,transaction_amount,transaction_description);
        System.out.println("Transaction details:");
        transaction.printdetails();
        saveToFile("transaction.txt",transaction);
    }
    else if(type ==2){
        System.out.println("View transaction");
        System.out.println("Enter the income");
        String total_income = scanner.nextLine();
        System.out.println("Enter the expense");
        String expense = scanner.nextLine();
        /*Expensmanager expensmanager = new Expensmanager(total_income, expense);
        System.out.println("Transaction details:");
        expensmanager.printdetails();
        saveToFile("expense.txt",expensmanager);*/

    }scanner.close();
}
private static void saveToFile(String fileName,Transaction transaction){
    try(FileWriter writer= new FileWriter(fileName,true)){
        writer.write(transaction.date+"\t"+transaction.type_transaction+"\t"+transaction.amount+"\t"+transaction.description);
        writer.close();
    }catch(IOException e){
        System.out.println("error writing to file");
        e.printStackTrace();
    }
}
}

    /*char ch ='N';
    do{
      System.out.println("1.Adding new Transaction");
        System.out.println("2.Viewing the transaction");
        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice)
        {
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            default:
            break;
        }
    }while(ch=='Y'|| ch=='y');*/
   
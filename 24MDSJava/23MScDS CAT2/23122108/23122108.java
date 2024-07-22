
// importing packages

import java.util.*;
import java.io.fileWriter;
import java.DateFormat;
import java.text.sample DateFormat;
import java.util.Scanner;

//  defining superclass


class transacion{
   
    private String amt_type;
    private String description;

    public transaction(){
       
        this.amt_type = "unknown";
        this.description = "unknown";


    }
    public transacion(datemethod date, String amt_type, String description){
        this.date = date;
        this.amt_type = amt_type;
        this.description = description;
    }
    public String get Date(){
        return this.date = date;
        }
 public String get Amt_Type(){
        return this.amt_type = amt_type;
        }
         public String get Description(){
        return this.description = description;
        }
}


// defind sub class and inheritance from superclass
class expensemanager extends transaction{
    private int total_income;
    private int expense;

    public movie(){
        super();
        this.total_income = 0;
        this.expense = 0;
    }
    public expensemanager(datemethod date,String amt_type, String description, int total_income, int expense ){
        super(date,amt_type,description);
         this.total_income = total_income;
        this.expense = expense;
    }
      public int get TotalIncome(){
        return this.total_income = total_income;
        }
         public int get Expence(){
        return this.expense = expense;
        }

        public void set TotalIncome(int totalIncome){
            this.total_income = total_income;
        }
         public void set Expence(int expense){
            this.expence = expence;
        }
}

// main class

public class shineexpence{

// saving the transaction 

    static public void save_to_File_transaction_data(String amt_type, String description, int expense , int total_income){
        try{
            DateFormat dateformat = new simpledateFormat("yyyy/mm/dd");
            Date date = new Date();
            FileWriter myWriter = newfileWriter("shineexpense.txt" , true)
            myWriter.write(date + "," + amt_type +","+ description +","+ expense+ ","+ total_income+"\n")
            my_writer.close();
            System.out.println("succesfully done");
            }catch(Exception){
                System.out.println("Error occured");
            }
    }
    static public void save_to_File_transaction_data(String amt_type, String description, int expense)

    // viewing the transaction
     static public void view_to_File_transaction_data(String amt_type, String description, int expense){
        try{
            DateFormat dateformat = new simpledateFormat("yyyy/mm/dd");
            Date date = new Date();
            FileViewer myViewer = newmyViewer("shineexpense.txt" , true)
            myViewer.view(date + "," + amt_type +","+ description +","+ expense,"\n")
            my_viewer.close();
            System.out.println("succesfully done");
            }catch( IOException){
                System.out.println("Error occured");
            }
    }
    static public void view_to_total_statics(String amt_type, String description, int total_income)
    
    
    static public void view_to_File_transaction_data(String amt_type, String description, int total_income){
        try{
            DateFormat dateformat = new simpledateFormat("yyyy/mm/dd");
            Date date = new Date();
            FileViewer myViewer = newmyViewer("shineexpense.txt" , true)
            myViewer.view(date + "," + amt_type +","+ description +","+ total_income,"\n")
            my_viewer.close();
            System.out.println("succesfully done");
            }catch( IOException){
                System.out.println("Error occured");
            }
    }
    static public void view_to_File_transaction_data(String amt_type, String description, int expense)
    
    
       public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        transacion my_transaction = new transaction():

     boolean exit = false;
     while(!exit){

        System.out.println("Enter transaction detail");
        System.out.println("1- amount_type");
        System.out.println("2- expence");
        System.out.println("3 - exit");
        System.out.println("enter your choice");
        int choice = Integer.parseInt(scan.nextLine());




        switch(choice){
            case1:
            String method = my_transaction.methodexpence();
            if(mmethod.toLowerCase().equal("expensemanager")) {
                System.out.println("type of amount");
     String  ExpensemanagerAmountType = scan.nextLine();

      System.out.println("description of expense");
     String  ExpensemanagerDescription = scan.nextLine();
System.out.println("expense");
     String  ExpensemanagerExpence= scan.nextInt();
     System.out.println("description of expense");
     String  ExpensemanagerTotal_income = scan.nextInt();

     save_to_File_transaction_data(amt_type,description,expence)

    }else{
        System.out.println("invalid ");
       
    }
        break;

        case2:
        System.out.println("enter detail");
        mytransaction.getTransa

    
case3:
System.out.println("exitting")
    break:
    
Expensemanager expensemanager = new Expensemanager(expensemanagerAmountType,expensemanagerDescription,expensemanagerExpence,expensemanagerTotal_income);

System.out.println("\n expensemanager detail");

expensemanager.printDetail();
Scanner.close();


 }

}
       }
       }


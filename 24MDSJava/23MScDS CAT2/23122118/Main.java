import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Transactions
{
    String Date;
    String transaction_type;
    float Amount;
    String Description;
    Transactions()  // constructor for Transactions class
    {
        this.Date = "";
        this.transaction_type = "";
        this.Amount = 0.0f;
        this.Description = "";
    }
   
    public void addTransactions(String date, String transaction_type , float Amount , String description){
        this.Date = date;
        this.transaction_type = transaction_type;
        this.Amount = Amount;
        this.Description = description;

    }
    public void getDate() //getting the date
    {
        System.out.println(this.Date);
        
    }
    public void gettype() //getting the type either cash or card
    {
        System.out.println(this.transaction_type);
    }
    public void getAmount() //getting the amount
    {
        System.out.println(this.Amount);
    }
    public void getdesc() //getting the description
    {
        System.out.println(this.Description);
    }

}
class Expensemanager extends Transactions //inheriting the properties of transactions class
{
    
    float Total_Income;
    float Expense;

    Expensemanager() // constructor for expensemanagerclass;

    {
        this.Total_Income = 0.0f;
        this.Expense = 0.0f;
    } 
    public void addExpensemanager(float total_income,float expense)
    {
        this.Total_Income = total_income;
        this.Expense = expense;
    }
    public void getTotalIncome() //getting the total income
    {
        System.out.println(this.Total_Income);
    }  
    public void getExpenditure() //getting the total expenditure
    {
        System.out.println(this.Expense);
    }
}
class Shinexpense extends Expensemanager
{
        public void trans(){
        Scanner scan = new Scanner(System.in);
        Transactions trans = new Transactions(); //creating the object
        boolean exit = false;
        while(!exit)
        {
            System.out.println("Enter the choice");
            System.out.println("1.Adding a new Transaction");
            System.out.println("2.Viewing the transaction");
            System.out.println("3.Viewing the total Statistics");
            System.out.println("4.exit");
            System.out.println("Enter the choice");
            String choice = scan.nextLine();
            scan.nextLine();
            switch(choice)
            {
                case "1":
                    System.out.println("Enter the date");
                    String date = scan.nextLine();
                    System.out.println("Enter transaction type");
                    String type = scan.nextLine();
                    System.out.println("Enter the amount");
                    float amt = scan.nextFloat();
                    System.out.println("Enter the description");
                    String desc = scan.nextLine();
                    trans.addTransactions(date,type,amt,desc);
                    try{
                    FileWriter filewriter = new FileWriter("details.txt"); //writing the file details
                    filewriter.write("Date"+"\t"+"type"+"\t"+"Amount"+"\t"+"Description"+"\n");
                    filewriter.write(date+"\t"+type+"\t"+amt+"\t"+desc);
                    filewriter.close();
                    }
                    catch(IOException e)
                    {
                        System.out.println(e.getMessage());
                    }


                    break;
                case "2":
                    System.out.println("Date:");
                    trans.getDate();
                    System.out.println("Transaction Type");
                    trans.gettype();
                    System.out.println("Amount ");
                    trans.getAmount();
                    System.out.println("Description");
                    trans.getdesc();
                    break;
                case "3":
                    System.out.println("Total income");
                    getTotalIncome();
                    System.out.println("expense");
                    getExpenditure();
                case "4":
                    exit = true;
                    break;
                default:

                    System.out.print("Invalid choice");
            }


    }
}
}

class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        try{
            File file = new File("details.txt"); // reading thr file details
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine())
            {
                String temp = fileReader.nextLine();
                System.out.println(temp);
            }
            fileReader.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        Expensemanager expenses = new Expensemanager();
        System .out.println("Enter the Total expense");
        float total_expense = scan.nextFloat();
        System.out.println("Enter the total income");
        float income = scan.nextFloat();
        expenses.addExpensemanager(income,total_expense);
        Shinexpense shine = new Shinexpense();
        shine.trans();
    }
}
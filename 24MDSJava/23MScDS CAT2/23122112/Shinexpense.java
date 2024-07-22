import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import expense.ExpenseManager;
// class named Shineexpense 
public class Shinexpense{
    private static int totalSales = 0;
    private static double totalSalesAmount = 0.0;
    private static final String TRANSACTION_FILE_PATH="expense_details.txt";
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(x:"<<<<<<<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(x:"Accept expense");
            System.out.println(x:"Display expense");
            System.out.println(x:"Displaying Total No of expense");
            System.out.println(x:"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<EXITTING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.print(s:"Enter no of choice");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    Acceptexpense();
                    break;
                case 2:
                    displayexpense();
                    break;
                case 3:
                    displayTotalNoofexpense();
                    break;
                case 4:
                    System.out.println(x:"EXITTINGGGGGGGGG");
                    break;
                default:
                    System.out.println(x:"INVALID CHOICE");
            }         
        }
    }
    private static void Acceptexpense(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print(s:"Enter item name:");
            String itemName = scanner.nextLine();
            System.out.print(s:"Enter Unit Price:");
            double unitPrice = scanner.nextDouble();
            System.out.print(s:"Enter quatity:");
            int quantity = scanner.nextInt();
            double totalIncome = unitPrice*quantity;
            String expenseFileNAme = "Expenses_"+ newDate().gettime()+ 
            FileWriter expenseFileWriter = new FileWritter(".txt";expenseFileName);
            expenseFileWritter.write("ItemName"+ itemName +"\n");
            expenseFileWritter.write("UnitPrice"+ unitPrice +"\n");
            expenseFileWritter.write("Quantity"+ quantity +"\n");
            expenseFileWritter.write("Total Income"+ totalIncome +"\n");
            expenseFileWritter.close();
            FileWriter transactionFilewriter = new FileWriter(TRANSACTION_FILE_PATH,append : true);
            transactionFileWriter.write(str:"Transaction Details:\n");
            transactionFileWriter.write("Transaction Dates:"+ newDate() +"\n");
            transactionFileWriter.write("Amount:"+totalIncome+ "\n");
            Expense expense = new expense(transNo:1,newDate(),totalIncome);
            transactionFileWriter.write(expense.toString()+"\n");
            transactionFileWriter.write(str: "\n");
            transactionFileWriter.close();
            System.out.println("Recored Successfully" +expenseFileName);
            totalIncome++;
            totalIncomeAmount+=totalIncome;
        
        }catch(IOException e){
            System.out.println("error occured : " +e.getMessage());

        }
    }
    private static void displayTotalNoofexpense(){
        System.out.println("total no of income : " +totalIncome);
    
    }
    private static void displaytotalIncomeAmount(){
        System.out.println("total no of income amount :" +totalIncomeAmount);
    }
}
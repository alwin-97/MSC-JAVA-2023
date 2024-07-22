import java.util.*;
import java.io.*;

public class Shinexpenses1{
    privat static int totalTracsaction = 0;
    double totalspend = 0.0;
    private static final String Expense_File = "expense.csv";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("WELCOME TO EXPENSE TRACKER");
        System.out.println("1.ExpenseManager");
        System.out.println("2 saveCustomerDetails");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1:
                 ExpenseManager(scanner);
                 break;
            case 2:
            break;
            case :
            break;
            case :
            break;
            case :
            break;

        }
    }
    
    private static void ExpenseManager(Scanner scanner)
    {
        System.out.println(" ENTER TYPE OF SPEND :");
        String spend =scanner.nextLine();
        System.out.println(" AMOUNT SPEND :");
        double amount= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("  :");
    

        Expense expense = new Expense(String spend,double amount,double totalAmount){
        appendToFile(expense.toString());
            expense.printdetails();
            System.out.println();
            syso

        }
}
pri
    public static void appendToFile(String details){
        try(FileWriter writer = new FileWriter(fileName,true));
        bu
    }
}
 class Expense{
    private double totalAmount;
    protected String spend;
    protected double amount;
    public Expense(String spend,double amount,double totalAmount){
        this.spend=spend;
        this.amount=amount;
        this.totalAmount= 0.0;

    }
    public void printdetails(){
        System.out.println("spend:" +spend);
        System.out.println("amount:" +amount);
        System.out.println("amount:" +totalAmount);
        for(String amount:amounts){

        }

    }
 }
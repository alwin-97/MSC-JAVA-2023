//Falak Ansari
//23122106

import java.util.*;
import java.io.*;

class Transaction { // Creating class Transaction
    private int TransDate; // with all the variable and datatype
    private String TransType;
    private int Amount;
    private String Descrip;

    Transaction() { // creation of constructors oftransaction
        this.TransDate = 0;
        this.TransType = "";
        this.Amount = 0;
        this.Descrip = "";
    }

    Transaction(int TransDate, String TransType, int Amount, String Descrip) // with all the datatype
    {
        this.TransDate = TransDate;
        this.TransType = TransType;
        this.Amount = Amount;
        this.Descrip = Descrip;
    }

    public void PrinttDetails() { // creating fucntion printdetails to print all the details
        System.out.println("Transction Date" + TransDate);
        System.out.println("Type of Transaction" + TransType);
        System.out.println("Amount" + Amount);
        System.out.println("Discription" + Descrip);

    }

    public int getTransDate() { // geting the data of the date
        return TransDate;
    }

    public String getTranstype() { // getting the type of transaction
        return TransType;
    }

    public int getAmount() { // getting the amount details
        return Amount;
    }

    public String getDescrip() { // getting the description of the transcation
        return Descrip;
    }
}

class Expensemanager extends Transaction { // Creating class Expensemanager
    private int TotalIncome; // with all the variable and datatype
    private int Expense;

    Expensemanager() { // creation of constructors of Expensemanager
        this.TotalIncome = 0;
        this.Expense = 0;

    }

    Expensemanager(int TransDate, String TransType, int Amount, String Descrip, int TotalIncome, int Expense) // with
                                                                                                              // all the
                                                                                                              // datatype
    {
        super(TransDate, TransType, Amount, Descrip);
        this.TotalIncome = TotalIncome;
        this.Expense = Expense;
    }

    public void PrinttDetails() { // creating fucntion printdetails to print all the details
        super.PrinttDetails(); // using super to call the Transaction class details
        System.out.println("Total Amount" + TotalIncome);
        System.out.println("Expense" + Expense);

    }

    public int getTotalIncome() { // geting the total income
        return TotalIncome;
    }

    public int getExpense() { // getting the total Expense
        return Expense;
    }

}

public class Shinexpense { // Creating the main class Shineexpense

    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in); // using the scanncer class
        int choice;
        do { // using do while loop for menu driven fuction
            System.out.println("Select option");
            System.out.println("1.Adding Transaction");
            System.out.println("2. Viewing Transaction");
            System.out.println("3. viewing Total Staistics");
            System.out.println("4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) { // entering the cghioce to be perfromed
                case 1:
                    System.out.println("Enter the Transaction Date");
                    int date = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the Transaction type");
                    String TransType = scanner.nextLine();
                    System.out.println("Enter the Transaction Amount");
                    int Amount = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the Transaction Description");
                    String Descrip = scanner.nextLine();
                    try {
                        FileWriter fileWriter = new FileWriter("Expense.txt", true);// creating file expense.txt to
                                                                                    // store the details
                        fileWriter.write(date + "," + TransType + "," + Amount + "," + Descrip);
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("Error in writing the file ");

                    }
                    break;
                case 2:

                    break;
                case 4:
                    System.out.println("Existing Programm");
                default:
                    System.out.println("Wrong Choice Entered");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}

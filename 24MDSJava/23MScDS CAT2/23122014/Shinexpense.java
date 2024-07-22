import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

// Here this is the main class Transaction which stores the mentioned details and this is the class which is inherited to other classes.

class Transaction {
    String Date;
    String Transaction_Type;
    String Amount;
    String Description;

    // Default Constructor
    Transaction() {
        this.Date = "";
        this.Transaction_Type = " ";
        this.Amount = " ";
        this.Description = " ";
    }

    // Parameterized Constructor
    Transaction(String Date, String Transaction_Type, String Amount, String Description) {
        this.Date = Date;
        this.Transaction_Type = Transaction_Type;
        this.Amount = Amount;
        this.Description = Description;
    }

    public void toDisplayTrans() {
        System.out.println(this.Date + " , " + this.Transaction_Type + " , " + this.Amount + " , " + this.Description);
    }

    public String TransactionDetails() {
        String trans_line = this.Date + " , " + this.Transaction_Type + " , " + this.Amount + " , " + this.Description;
        return trans_line;
    }
}

// Expense Manager Class that inherits the properties of the transacation class
// and those properties are used by using the key word extends and the fuctions
// mentioned are called using the super keyword.

class ExpenseManagerclass extends Transaction {
    String totalIncome;
    String total_expense;
    int total_counter;
    int expense_counter;

    ExpenseManagerclass() {
        this.totalIncome = " ";
        this.total_expense = " ";
        this.total_counter = 0;
        this.expense_counter = 0;
    }

    ExpenseManagerclass(String Date, String Transaction_Type, String Amount, String Description) {
        super(Date, Transaction_Type, Amount, Description);
        this.totalIncome = totalIncome();
        this.total_expense = total_expense();
    }

    public String totalIncome(){
        
        if (this.Transaction_Type.equals("Income")){
            this.total_counter+= Integer.parseInt(Amount);
        }
        String total = String.valueOf(this.total_counter);
        return total;

    }
    public String total_expense(){
        String expense = "";
        if (this.Transaction_Type.equals("Expense")){
            this.expense_counter+= Integer.parseInt(Amount);
            expense = String.valueOf(this.expense_counter);
        }
        
        return expense;

    }


    public String ExpenseManagerclassDisplay() {
        String transline = super.TransactionDetails();
        String ExpenseManagerclass_Line = transline + " , " + this.totalIncome + " , " + this.total_expense;
        return ExpenseManagerclass_Line;
    }

}

public class Shinexpense {
    public static void main(String[] args) {
        int option = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Adding a New Transaction");
            System.out.println("2. Viewing the Transactions");
            System.out.println("3. Viewing the Total Statistics");
            System.out.println("4. Exits the Program");
            System.out.println("Enter the Option You WOuld Like to Choose:");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:

                    // Here the case 1 executes about the Transaction Details Saving with the File.
                    System.out.println("Enter the Date: ");
                    String Date = sc.nextLine();
                    System.out.println("Enter the Transaction type: ");
                    String Transaction_Type = sc.nextLine();
                    System.out.println("Enter the Amount: ");
                    String Amount = sc.nextLine();
                    System.out.println("Enter the Description: ");
                    String Description = sc.nextLine();
                    Transaction myobj1 = new Transaction();

                    // System.out.println("Enter the Total Income: ");
                    // String totaIncome = sc.nextLine();
                    // System.out.println("Enter the Expense: ");
                    // String expense = sc.nextLine();
                    // Creating the Object and Calling the class for displaying appending them into
                    // the File
                    ExpenseManagerclass expensemanager = new ExpenseManagerclass(Date, Transaction_Type, Amount,
                            Description);
                    String details = expensemanager.ExpenseManagerclassDisplay();
                    try {
                        FileWriter filewrite = new FileWriter("Expense Manager.txt", true);
                        filewrite.write(details + "\n");
                        filewrite.close();
                    } catch (Exception exception) {
                        System.out.println("File not Found, Error Ocuured");
                    }

                    break;

                case 2:
                    try {
                        // From the File the details are extracted and Displayed.

                        File file = new File("Expense Manager.txt");
                        Scanner scan = new Scanner(file);
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            String[] linesplit = line.split(" , ");
                            System.out.println(line);
                        }
                        scan.close();

                    } catch (Exception exception) {
                        System.out.println("File not Found, Error Ocuured");
                    }
                    break;

                case 3:

                    try {
                        // From the File the details are extracted and Displayed. Here we are finding the Statistics.

                        File file = new File("Expense Manager.txt");
                        Scanner scan = new Scanner(file);
                        int totalIncome_counter = 0;
                        int expense_counter = 0;
                        int Amount_counter = 0;
                        int income_trans_counter = 0;
                        int expense_trans_counter = 0;
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            String[] linesplit = line.split(" , ");
                            totalIncome_counter += Integer.parseInt(linesplit[4]);
                            expense_counter += Integer.parseInt(linesplit[5]);
                            Amount_counter += Integer.parseInt(linesplit[2]);
                            if(linesplit[1].equals("Expense")){
                                expense_trans_counter+=Integer.parseInt(linesplit[2]);

                            }
                            if(linesplit[1].equals("Income")){
                                income_trans_counter+=Integer.parseInt(linesplit[2]);
                            }
                            
                        }
                        System.out.println("*********************************************************************");
                        System.out.println("Summary Statistics of Your Expenses");
                        System.out.println("The Total Statistics:");
                        // System.out.println("The Total Income: "+totalIncome_counter);
                        // System.out.println("The Expense Income: "+expense_counter);
                        System.out.println("The Amount that have made during the whole Transaction: "+Amount_counter);
                        System.out.println("The Transaction made via Expense: "+expense_trans_counter);
                        System.out.println("The Transaction made via Income: "+income_trans_counter);
                        System.out.println("*********************************************************************");
                        scan.close();

                    } catch (Exception exception) {
                        System.out.println("File not Found, Error Ocuured");
                    }
                    break;

                case 4:
                System.out.println("Exits the Program...");
                    break;

                default:
                    System.out.println("Invalid Option Selected...");
            }

        } while (option != 4);
    }
}

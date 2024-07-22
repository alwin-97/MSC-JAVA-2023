
// nessary packages are being using in this Program
import java.util.Scanner;
import java.io.*;

class Transactons {
    // here all the necessary variable Declared for the Class Transacion
    private String date;
    private String transaction_type;
    private Double amount;
    private String description;

    // this is Default Constructor
    public Transactons() {
        this.date = "UNKNOWN";
        this.transaction_type = "UNKNOWN";
        this.amount = 200.00;
        this.description = "UNKNOWN";
    }

    public Transactons(String date, String transaction_type, Double amount, String description) {
        this.date = date;
        this.transaction_type = transaction_type;
        this.amount = amount;
        this.description = description;
    }

    // Getter and Setter Method

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransaction_type() {
        return this.transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

// here the Expensemanager class inherit the Transactons class
class Expensemanager extends Transactons {
    private Double total_income;
    private String expense;

    // Creating Deafault Constructor
    public Expensemanager() {
        super();
        this.total_income = 2000.99;
        this.expense = "UNKNOWN";
    }

    public Expensemanager(String date, String transaction_type, Double amount, String description, Double total_income,
            String expense) {
        super(date, transaction_type, amount, description);
        this.total_income = total_income;
        this.expense = expense;
    }
    // Getter and Setter Method

    public Double getTotal_income() {
        return this.total_income;
    }

    public void setTotal_income(Double total_income) {
        this.total_income = total_income;
    }

    public String getExpense() {
        return this.expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

}

public class Java_CLI {
    static void loading_data() {
        try {
            File transaction = new File("transaction.txt");
            Scanner transaction_data = new Scanner(transaction);
            while (transaction_data.hasNextLine()) {
                String data = transaction_data.nextLine();
                String[] split_data = data.split(","); // Splited the day by comma seperated
                System.out.println("\n---------------------------");
                System.out.println("Date: " + split_data[0]);
                System.out.println("Type of Transaction: " + split_data[1]);
                System.out.println("Amount: " + split_data[2]);
                System.out.println("Description: " + split_data[3]);
                System.out.println("Total Income: " + split_data[4]);
                System.out.println("Expense: " + split_data[5]);
                System.out.println("---------------------------\n");
            }

            transaction_data.close();

        } catch (IOException e) {
            System.out.println("Something Error in the File " + e.getMessage());

        }
    }

    // statistic Analysis
    static void static_analysis() {
        try {

            // reading the file
            File transaction = new File("transaction.txt");
            Scanner transaction_data = new Scanner(transaction);
            int total_tansaction = 0;
            Double total_amt = 0.00;
            Double to_income = 0.00;
            // Checking the re is Next line
            while (transaction_data.hasNextLine()) {
                total_tansaction++;
                String data = transaction_data.nextLine();
                String[] split_data = data.split(",");
                total_amt += Double.parseDouble(split_data[2].toString());
                to_income += Double.parseDouble(split_data[4].toString());

            }
            // Showing all the Necessary Calculation For Statical Analysis
            System.out.println("Total Number of Expense: " + total_tansaction);
            System.out.println("Total Amount Spend in a Expense: " + total_amt);
            Double netIncome = to_income - total_amt;
            System.out.println("Net Income: " + netIncome);

            transaction_data.close();

        } catch (IOException e) {
            System.out.println("Something Error in the File " + e.getMessage());

        }
    }

    // for saving the file in the database with all the Necessary detail
    static void saved_in_transaction_file(String date, String transaction_type, Double amount, String description,
            Double total_income, String expense) {
        try {
            FileWriter myWriter = new FileWriter("transaction.txt", true); // this to declare where we have to save the
                                                                           // file
            myWriter.write(date + ',' + transaction_type + ',' + amount + ',' + description + ',' + total_income + ','
                    + expense + '\n');
            myWriter.close();
            System.out.println("Successfully Saved in a File!!");

        } catch (IOException e) {
            System.out.println("Something Error in the File " + e.getMessage());

        }

    }

    // this is main function which execute
    public static void main(String[] args) {
        // Loading the transaction detail to the file before the user exit
        loading_data();

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n Menu");
            System.out.println("1. Adding a New Transaction");
            System.out.println("2. Viewing a Transaction");
            System.out.println("3. Viewing A total Statistic");
            System.out.println("0. Exitting!!!");
            System.out.print("Enter the Choice: ");
            choice = Integer.parseInt(scan.nextLine());
            // default constructor callled
            Expensemanager expenseman = new Expensemanager();
            // Using Switch case for when ever the user enter their choice performing
            // different different functionality
            switch (choice) {
                case 1:
                    // taking the user input
                    System.out.print("Enter the Date: ");
                    String date = scan.nextLine();
                    expenseman.setDate(date);
                    System.out.print("Enter the Type of Transaction(`cash/credit`): ");
                    String transaction_type = scan.nextLine();
                    expenseman.setTransaction_type(transaction_type);
                    System.out.print("Enter the Transaction Amount: ");
                    Double amount = Double.parseDouble(scan.nextLine());
                    expenseman.setAmount(amount);
                    System.out.print("Enter the Transaction description: ");
                    String description = scan.nextLine();
                    expenseman.setDescription(description);
                    System.out.print("Enter the Total Income: ");
                    Double total_income = Double.parseDouble(scan.nextLine());
                    expenseman.setTotal_income(total_income);
                    System.out.print("Enter the Expense: ");
                    String expense = scan.nextLine();
                    expenseman.setExpense(expense);
                    // Class Call passing all the paramerete which saved in a Object
                    Expensemanager expensemanager = new Expensemanager(date, transaction_type, amount, description,
                            total_income, expense);
                    saved_in_transaction_file(expensemanager.getDate(), expensemanager.getTransaction_type(),
                            expensemanager.getAmount(), expensemanager.getDescription(),
                            expensemanager.getTotal_income(), expensemanager.getExpense());
                    break;
                case 2:
                    // Viewing all the Transaction From the Database
                    loading_data();
                    break;
                case 3:
                    System.out.println("\n Statistics Analysis: ");
                    static_analysis();
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }

        } while (choice != 0);

        scan.close();

    }
}
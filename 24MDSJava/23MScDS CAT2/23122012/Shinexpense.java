
/**
 * Shinexpense
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

class Transaction {

    private String transType;
    private int Amount;
    private String description;
    private int date;

    public Transaction(String transType, int Amount, String description, int date) {

        this.transType = transType;
        this.Amount = Amount;
        this.description = description;
        this.date = date;

    }

    public void printDetails() {
        System.out.println("Transaction type:" + transType);
        System.out.println("Amount:" + Amount);
        System.out.println("Transaction description:" + description);
        System.out.println("Date:" + date);

    }
}

class ExpenseManager extends Transaction {
    private int income;
    private int expense;

    public ExpenseManager(String transType, int Amount, String description, int date, int income, int expense) {
        super(transType, Amount, description, date);
        this.income = income;
        this.expense = expense;

    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Income:" + income);
        System.out.println("Expenses:" + expense);

    }
}

public class Shinexpense {
    private static final String EXPENSE_FILE = "expense.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to ShineXpense:");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a Transaction");
            System.out.println("2. View Transaction");
            System.out.println("3. Calculate Statistics");
            System.out.println("4.Exit");
            System.out.println("enter choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    addTrasaction();
                    break;

                case 2:
                    viewTrasaction();
                    break;

                case 3:

                    calculateStaistics();
                    break;

                case 4:

                    System.out.println("Exiting program!....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again...");
                    break;
            }

        }

    }

    private static void addTrasaction() {

        try (FileWriter writer = new FileWriter(EXPENSE_FILE, true)) {
            System.out.println("Enter Transaction type:");
            String transType = scanner.nextLine();
            System.out.println("Enter Transaction Amount:");
            int Amount = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Transaction description:");
            String description = scanner.nextLine();
            System.out.println("Enter Date:");
            int date = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your Income:");
            int income = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your expenses:");
            int expenses = scanner.nextInt();
            scanner.nextLine();

            ExpenseManager expenseManager = new ExpenseManager(transType, Amount, description, date, income, expenses);
            writer.write(
                    transType + "," + Amount + "," + description + "," + date + "," + income + "," + expenses + ",");
            System.out.println("\n Expense details added successfully!");

        } catch (IOException e) {
            System.out.println("error writing to file!" + e.getMessage());

        }

    }

    private static void viewTrasaction() {
        try (Scanner fileScanner = new Scanner(new FileReader(EXPENSE_FILE))) {
            System.out.println("added transactions");
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");
                ExpenseManager expenseManager = new ExpenseManager(parts[0], Integer.parseInt(parts[1]), parts[2],
                        Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]));
                expenseManager.printDetails();

            }

        } catch (IOException e) {
            System.out.println("error writing to file!" + e.getMessage());
        }

    }

    private static void calculateStaistics() {
        System.out.println("Transaction Statistics;");
        System.out.println("Total income: + ExpenseManager.getTotalIncome() ");
        System.out.println("Total Expenses: + ExpenseManager.getTotal() ");

    }

}
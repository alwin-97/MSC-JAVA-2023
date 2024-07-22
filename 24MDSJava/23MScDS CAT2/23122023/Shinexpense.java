import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

class Transaction {
    private String Date;
    private String Transaction_type;
    private int Amount;
    private String Description;

    Transaction() {
        this.Date = "";
        this.Transaction_type = "";
        this.Amount = 0;
        this.Description = "";
    }

    Transaction(String Date, String Transaction_type, int Amount, String Description) {
        this.Date = Date;
        this.Transaction_type = Transaction_type;
        this.Amount = Amount;
        this.Description = Description;
    }

    public String read_details() {
        String line = this.Date + " , " + this.Transaction_type + " , " + this.Amount + " , " + Description;
        return line;
    }
}

class ExpenseManager extends Transaction {
    private int Total_income = 0;
    private int expense = 0;
    private int stats;

    ExpenseManager() {
        this.Total_income = 0;
        this.expense = 0;
        this.stats = 0;
    }

    ExpenseManager(int Total_income, int expense, String Date, String Transaction_type, int Amount,
            String Description) {
        super(Date, Transaction_type, Amount, Description);
        this.Total_income = Total_income;
        this.expense = expense;
        this.stats = return_statistics();
    }

    public String return_line() {
        String trans_line = super.read_details();
        String exp_line = trans_line + " , " + Total_income + " , " + expense;
        return exp_line;
    }

    public int return_statistics() {
        int statistics = this.Total_income - expense;
        return statistics;
    }

    public int get_stats() {
        return this.stats;
    }

    public int get_expense() {
        return this.expense;
    }

    public int return_income() {
        return this.Total_income;
    }
}

public class Shinexpense extends ExpenseManager {
    public static void main(String[] args) {

        int counter = 0;

        String[][] file_line = new String[100][];
        try {
            File file = new File("Shine_Expense_Manager.txt");
            Scanner sc1 = new Scanner(file);
            if (sc1.hasNextLine()) {
                while (sc1.hasNextLine()) {
                    String line1 = sc1.nextLine();
                    String[] line_split = line1.split(" , ");
                    file_line[counter] = line_split;
                    counter++;
                }
            }
            counter = 0;
            sc1.close();
        } catch (Exception exception) {
            System.out.println("Something went wrong! Try again!");
        }

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int income = 0;
        int exp = 0;
        String transaction_line = "";
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("           Welconme to Shine expense Tracker.             ");
            System.out.println("        Please enter the option from the below list       ");
            System.out.println("1. Add a Transaction.");
            System.out.println("2. View Transaction.");
            System.out.println("3. View total Statistics.");
            System.out.println("4. Exit.");
            System.out.println("----------------------------------------------------------");
            System.out.print("Please enter the choice : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("==================================================");
                    System.out.print("Enter the Date of the transaction : ");
                    String date = sc.nextLine();
                    System.out.println("==================================================");
                    System.out.print("Enter the Transaction type : ");
                    String transaction_type = sc.nextLine();
                    System.out.println("==================================================");
                    System.out.print("Enter the Amount of transatcion : ");
                    int amount = Integer.parseInt(sc.nextLine());
                    System.out.println("==================================================");
                    System.out.print("Enter the Description of transatcion : ");
                    String description = sc.nextLine();
                    System.out.println("==================================================");
                    System.out.print("Enter the Total income : ");
                    int Total_income = Integer.parseInt(sc.nextLine());
                    System.out.println("==================================================");
                    System.out.print("Enter the expense  : ");
                    int expense = Integer.parseInt(sc.nextLine());
                    System.out.println("==================================================");
                    ExpenseManager expmn = new ExpenseManager(Total_income, expense, date, transaction_type, amount,
                            description);
                    transaction_line = expmn.return_line();
                    income = expmn.return_income();
                    exp = expmn.get_expense();
                    System.out.println("Transaction updates successfully!");
                    break;

                case 2:
                    for (String[] arr1 : file_line) {
                        for (String i : arr1) {
                            System.out.println("------------------------------------------");
                            System.out.println(i);
                            System.out.println("------------------------------------------");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Total Income : " + income);
                    System.out.println("Total Expense : " + exp);
                    int stat = income - exp;
                    System.out.println("Remaining Balance : " + stat);
                    break;

                case 4:
                    try {
                        FileWriter filew = new FileWriter("Shine_Expense_Manager.txt", true);
                        filew.write(transaction_line +"\n");
                        filew.close();
                    } catch (Exception exception) {
                        System.out.println("Something went wromg! Please try again!");
                    }
                    System.out.println("Thankyou!");
                    break;

            }
        } while (choice != 4);
    }
}
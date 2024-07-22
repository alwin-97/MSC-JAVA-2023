import Transactions.Transaction;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Transactions.Expensemanager;

public class Shinexpense {

    static void welcome() {
        System.out.println("Welcome to your Expense Manager JAVA Application!!");
        System.out.println("Application build for Mr.Shine");
        System.out.println("Application build by Aadith");
        System.out.println("Have a good time using your expense tracker");
    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            char cont = ' ';

            Transaction[] myTransaction = new Transaction[100];
            int trans_count = 0;
            Expensemanager[] myExpense = new Expensemanager[100];
            int exp_count = 0;

            File transactionfile = new File("Transactions.txt");
            FileWriter transwriter = new FileWriter(transactionfile, true);

            File expensFile = new File("Expenses.txt");
            FileWriter expwriter = new FileWriter(expensFile, true);

            transwriter.write("Date" + "\t" + "Amount" + "\t" + "Type" + "\t" + "Description" + "\n");
            expwriter.write("Date" + "\t" + "Amount" + "\t" + "Type");

            welcome();

            do {
                System.out.println("1. Add a transaction detail.");
                System.out.println("2. View all transactions.");
                System.out.println("3. View report.");
                System.out.println("4. Exit");

                int opt = scan.nextInt();
                scan.nextLine();

                switch (opt) {
                    case 1:
                        char trans_cont = ' ';
                        do {
                            System.out.println("Please enter transaction date (in the format DDMMYYYY) : "); // Collecting
                            // required
                            // info
                            String date = scan.nextLine();
                            System.out.println("Please enter transaction type : ");
                            String type = scan.nextLine();
                            System.out.println("Please enter transaction amount : ");
                            Long amount = scan.nextLong();
                            scan.nextLine();
                            System.out.println("Please enter transaction description: ");
                            String desc = scan.nextLine();

                            myTransaction[trans_count] = new Transaction(date, type, amount, desc);
                            transwriter.write(myTransaction[trans_count].getTransDetails() + "\n"); // Writing
                                                                                                    // transaction
                            // details into
                            // transaction file.

                            String expDate = myTransaction[trans_count].getDate(); // Extracting expense details
                            long expamount = myTransaction[trans_count].getAmount();
                            String exptype = myTransaction[trans_count].getTransType();

                            myExpense[exp_count] = new Expensemanager(expDate, expamount, exptype);
                            expwriter.write(myExpense[exp_count].getExpenseDetails() + "\n"); // Writing expemse details into
                            // expense file.

                            trans_count++;
                            exp_count++;

                            System.out.println("Do you want to enter more transactions? Y or N");
                            trans_cont = scan.next().charAt(0);
                            scan.nextLine();
                        } while (trans_cont == 'Y' || trans_cont == 'y');
                        break;

                    case 2:
                        Scanner transreader = new Scanner(transactionfile);
                        while (transreader.hasNextLine()) {
                            String data = transreader.nextLine();
                            System.out.println(data);
                        }

                    case 3:
                        long total_income = 0;
                        long total_expense = 0;
                        Scanner expreader = new Scanner(expensFile);

                        while (expreader.hasNextLine()) {
                            String data = expreader.nextLine();
                            String[] parts = data.split("\t");
                            if (parts[2].equals("Income")) {
                                total_income += Long.parseLong(parts[1]);
                            } else if (parts[2].equals("Expense")) {
                                total_expense += Long.parseLong(parts[1]);
                            }
                        }

                        System.out.println("The total income is : " + total_income);
                        System.out.println("The total expense is : " + total_expense);
                        break;

                    case 4:
                        System.out.println("Program ended successfully......");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option.");
                        break;
                }
                System.out.println("Do you want to view the menu again? Y or N");
                cont = scan.next().charAt(0);

            } while (cont == 'Y' || cont == 'y');
            scan.close();
            transwriter.close();
            expwriter.close();

        } catch (Exception e) {
            System.out.println("An unepected error occcured!");
            e.printStackTrace();
        }
    }
}

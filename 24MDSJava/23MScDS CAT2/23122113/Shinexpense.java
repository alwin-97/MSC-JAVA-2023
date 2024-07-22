import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Shinexpense {
    private static final long Income = 0;
    private static final long Expense = 0;

    public static <ExpenseManager> void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Expensemanager[] expensemanager = new Expensemanager[100];// Here we created an array expensemanager in the
                                                                      // EXpenseManager datatype
            int Expense_count = 0;// We set count as zero(initial)

            File expensemanager_file = new File("Expense.txt");// Created a file named "Expense.txt" where we need to
                                                               // store transaction details
            FileWriter expense_writer = new FileWriter(expensemanager_file, true);// Here we are writing in the txt file
                                                                                  // created
            Scanner expense_reader = new Scanner(expensemanager_file);// This is the code for scanning

            // We initialized cont as empty char
            char cont = ' ';

            // Creating a menu driven function for calling different methods
            do {
                System.out.println("Welcome to Shinexpense Tracker!");
                System.out.println("Menu Options: ");
                System.out.println("1.Add Transaction Details");
                System.out.println("2.View Transactions");
                System.out.println("3.View Total Statistics");
                System.out.println("4.Exit");

                System.out.println("Please Select an Option: ");

                Scanner scan;

                // int ch = Integer.parseInt(scan.nextLine());

                int opt = input.nextInt();
                input.nextLine();

                switch (opt) {
                    case 1:
                        System.out.println("Enter date of transaction[DD/MM/YY format]: ");
                        String date = input.nextLine();
                        System.out.println("Enter the type of transaction[Cash or Card]: ");
                        String Transaction_type = input.nextLine();
                        System.out.println("Enter the amount for transaction: ");
                        Long Amount = input.nextLong();
                        input.nextLine();
                        System.out.println("Please give a brief description: ");
                        String Description = input.nextLine();

                        expensemanager[Expense_count] = new Expensemanager(date, Transaction_type, Amount, Description,
                                Income, Expense);
                        expense_writer
                                .write(expensemanager[Expense_count].PrintDetails() + "\n");
                        expense_writer.close();
                        Expense_count++;
                        break;

                    case 2:

                    
                        System.out.println("Here is your transaction details saved in text file");
                        while (expense_reader.hasNext()) {
                            String data = expense_reader.nextLine();
                            System.out.println(data);
                        }

                        break;

                    case 3:

                        System.out.println("Here is the Statistics of the Transaction:");


                        break;

                    case 4:
                        System.exit(opt);
                    default:
                        System.out.println("Please enter valid option");

                }
                System.out.println("Do you want to continue?(Y or N)");
                cont = input.next().charAt(opt);

            } while (cont == 'Y' || cont == 'y');
            
            input.close();

        } catch (Exception e) {
            System.out.println("An unexpected error occured");
            e.printStackTrace();
        }
    }
}
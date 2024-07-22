package CAT-2;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class shinexpense {
    private ExpenseManager manager;
    private final String filename ="transaction.txt" ;



public shinexpense() {
    this.manager = new ExpenseManager();
    loadTransactions();


}

public void menu() {
    Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.println("\n Menu");
         System.out.println("1.Add Transaction");
          System.out.println("2. View Transaction");
           System.out.println("3. View  Statistics");
            System.out.println("4.Exit");
             System.out.print("Choose an Option :");
             string choice = scanner.nextLine();

             switch(choice) {
                case "1":
                    addTransaction(scanner);
                    break;
                case "2":
                    manager.viewTransactions();
                    break;
                case "3":
                    manager.totalstatistics();
                    break;
                case "4":
                    saveTransactions();
                    System.out.println("Transaction saved,Exiting the program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice,Try again");

             }
    }

    private void addTransaction(Scanner scanner){
        try{
            System.out.println("Enter the date");
            String dateStr = scanner.nextLine();
            LocalDate date = LocalDate.parse(datestr,DateTimeFormatter.ISO_DATE);

            System.out.println("Enter transaction type(Income/Expense)");
            String Transaction_Type = scanner.nextLine();

            System.out.println("Enter the amount");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter description");
            String description = scanner.nextLine();

            Transaction transaction = new Transaction(date,Transaction_Type,amount,description);
            manager.addTransaction(transaction);
            System.out.println("Transaction added");

        }
        catch(Exception e){
            System.out.println("Invalid input , Try again");

        }

        private void saveTransactions() {
            try(objectOutputStream oos = new objectOutputStream(new FileOutputStream("transactions.txt"))){
            oos.writeObject(manager);
        } catch (IOException e) {
            System.out.println("Error saving transactions"+ e.getMessage());
        }


        }
    }

    public static void main(String[] args) {
        shinexpense app = new shinexpense();
        app.menu();
    }

    
}
import java.io.*;
import java.util.Scanner;
import java.File.Reader;
import java.File.Writer;
//Main class transactions
        class transaction{
            private String date;
            private String transactionType;
            private int amount;
            private String description;

            public transaction(String date, String transactionType,int amount, String description){
                this.date = date;
                this.transactionType = transactionType;
                this.amount = amount;
                this.description = description;
            }
//Function to Display transaction details
            public void printTransDeets(){
                System.out.println("Date" + date);
                System.out.println("transactionType" + transactionType);
                System.out.println("amount" + amount);
                System.out.println("description" + description);
            }
        }
//Calculation of the total transactions
        class Expensemanager extends transaction{
            private int totalIncome;
            private int totalExpense;

            public void printExpenseDeets(){
                super.printExpenseDeets();
                System.out.println("Total Income" + totalIncome);
                System.out.println("totalExpense" + totalExpense);
            }
        }

        public class addTransaction(){
            try(
                FileWriter writer = new FileWriter(Transactions_FILE, true)){
                System.out.println("Enter the Date:");
                String date = scanner.nextline();
                System.out.println("Enter the Transaction type(Cash, UPI or card):" );
                String transactionType = scanner.nextline();
                System.out.println("Enter the Amount:" );
                int amount = scanner.nextline();
                System.out.println("Enter the description:" );
                String description = scanner.nextline();

                Transaction transaction = new transaction(date, transactionType, amount, description );
                writer.write(date+","+transactionType+","+amount+","+description);
                System.out.println("Transaction added successfully" );
                }
                catch(IOException e);{
                   System.out.println("Errror in writing to file" +e.getmessage());
                }
            }

    public class ShineExp{
        private static final String Transactions_FILE= "transactions.txt";
        private static final String Expenses_FILE= "Expenses.txt";
        private static  Scanner scanner = new Scanner (System.in);
        
        public static void main(String[]args){
          //Menu
          while (true){
            System.out.println("______________________WELCOME SHINE!!!______________________");
            System.out.println("_________________LETS MANAGE YOUR EXPENSES__________________");
            System.out.println("1.Add a new tranasction");
            System.out.println("2.View tranasction");
            System.out.println("3.View Total Statistics");
            System.out.println("4.Exit");
            System.out.println("_______________CHOOSE AN OPTION TO CONTINUE_________________");

            System.out.println("Enter your choice::");
                int choice  =  scanner.nxtInt();
                scanner.nextLine();
                 switch(choice){
                    case 1:
                        addTransaction();
                        break;
                    
                    case 2:
                        printTransDeets();
                        break;

                    case 3:
                        printExpenseDeets();
                        //viewdeets();
                        break;

                    case 4:
                        break;

                    deafult: System.out.println("Invalid choice");
                 }
          }
          

            // public static void addTransaction(){
            // try(
            //     FileWriter writer = new FileWriter(Transactions_FILE, true)){
            //     System.out.println("Enter the Date:");
            //     String date = scanner.nextline();
            //     System.out.println("Enter the Transaction type(Cash, UPI or card):" );
            //     String transactionType = scanner.nextline();
            //     System.out.println("Enter the Amount:" );
            //     int amount = scanner.nextline();
            //     System.out.println("Enter the description:" );
            //     String description = scanner.nextline();

            //     Transaction transaction = new transaction(date, transactionType, amount, description );
            //     writer.write(date+","+transactionType+","+amount+","+description);
            //     System.out.println("Transaction added successfully" );
            //     }
            //     catch(IOException e){
            //        System.out.println("Errror in writing to file" +e.getmessage());
            //     }
            // }
            
            // private static void viewDeets(){
            //     System.out.println(" 1 .View Expenses");
            //     System.out.println(" 2 .View Transactions");
            //     System.out.println("Enter your choice::");
            //     int choice  =  scanner.nxtInt();
            //     scanner.nextLine();
            //      switch(choice){
            //         case 1:
            //             System.out.println(" Expense total : here");
            //             break;
                    
            //         case 2:
            //             System.out.println(" Transaction total : here");
            //      }

            // }
      }
    }  
    





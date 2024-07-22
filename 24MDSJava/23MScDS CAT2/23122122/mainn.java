// import libaries
import java.io.*;
import java.util.*;

// Transaction class
class Transaction {
    int date;
    String transactionType;
    int amt;
    String description;

    public void printDetails(){
    System.out.println("Date: " + date);
    System.out.println("Transaction Type: " + transactionType);
    System.out.println("Amount: " + amt);
    System.out.println("Description: " + description);
    }
}

// Expense Manager Class
/*class Expensemanager extends Transactions{
    int totalIncome;
    int expense;
    Expensemamager(int data, String transactionType, int amt, String description)
    super(int data, String transactionType, int amt, String description);
        this.totalIncome = totalIncome;
        this.expense = expense;
}*/

// Main Class
public class mainn{
    private static final String TRANS_FILE = "trans.csv"; //Transaction details saves here
    private static final String EXPENSE_FILE = "exp.csv"; //Expense Manager details saves here

    private static Expensemanager[] exp = new Expensemanager[10]; //array limited to 10
    private static in expcount = 0;

    private static Transaction[] trans = new Transaction[10]; // array limited to 10
    private static in transcount = 0;
    
    public static void main(String[] args){
        // load files for both Transaction and expense manager details
        loadtransFromFile();
        loadexpFromFile();

        Scanner scanner = new Scanner(System.in);

        // Menu-Drive 
        while(!exit){
            System.out.println("\n Menu");
            System.out.println("1. Add Transactions");
            System.out.println("2. View Transactions");
            System.out.println("3. Total Statistics");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                addTrans(scanner);
                break;
                case 2:
                viewTrans(scanner);
                break;
                case 3:
                totalStats(scanner);
                break;
                case 4:
                exit = True;
                break;
                default:
                System.out.println("Invalid input");
            }
        }

        // save file for both Transactions and expense Manager
        savetransToFile();
        saveexptoFile();

        scanner.close();
        System.out.println("Application closed");
    }

        // To add transaction details
        private static void addTrans(Scanner scanner) {
            System.out.println("\n Enter Date: ");
            int date = scanner.nextInt();

            scanner.nextLine();
            System.out.println("\n Enter Transaction type: ");
            String transactionType = scanner.nextLine;

            System.out.println("\n Enter Amount: ");
            int amt = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n Enter Description: ");
            String description = scanner.nextLine;

            // resize the array, if needed.
            if (transcount >= trans.length){
                resizeTransArray();
            }

            trans[transcount++] = newtrans(data, transactionType, amt, description);
            System.out.println("TransactionDetails Added");
        }

        // To view the transaction details
        private static void viewTrans(){
            System.out.println("\n Transactions Details: ");
            for(int i=0; i<transcount; i++){
                trans[i].printDetails();
                System.out.println();
            }

        }
        
        // Function to save files for Transactions
        private static void savetransToFile(){
            try(FileWriter writer = new FileWriter(TRANS_FILE)){
                for(int i=0; i<transcount; i++){
                    writer.write(String.join(",", Integer.toString(trans[i].date), trans[i].transactionType, Integer.toString(trans[i].amt), trans[i].description)+ "\n");
                }
                System.out.println("TransactionsDetails Saved to file");
            }catch (IOExpection e) {
                System.out.println("Error" + e.getmessage());
            }
        }

        // function to load the files for Transactions
        private static void loadtransFromFile(){
            try(Scanner fileScanner = new Scanner (new file(TRANS_FILE))){
                while(fileScanner.hasNextLine()){
                    String line = fileScanner.nextLine();
                    String[] data = line.split(",");
                    int date = Integer.parseInt(data[0]);
                    String transactionType = data[1];
                    int amt = Integer.parseInt(data[2]);
                    String description = data[3];

                    if(transcount >= trans.length){
                        resizeTransArray();
                    }

                    trans[transcount++] = new trans(data, transactionType, amt, description);
                    
                }

                System.out.println("Transactions loaded from file");
            }
            catch(IOExpection e){
                System.out.println("Error" + e.getmessage());
            }
        }

        // Resize the array code
        private static void resizeTransArray(){
            trans[] newtransArray = newtrans[trans.length*2];
            trans = newtransArray; 
        }

    
}
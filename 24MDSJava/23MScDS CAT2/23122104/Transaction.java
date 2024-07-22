import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Transaction{
    

    private static String tdate;
    private static String transaction_type;
    protected static int amount;
    private static String description;

    Transaction(){
        Transaction.tdate = "";
        Transaction.transaction_type = "";
        Transaction.amount = 0;
        Transaction.description = "";

    }

    @SuppressWarnings("static-access")
    public Transaction(String tdate, String transaction_type, int amount, String description){
        this.tdate = tdate;
        this.transaction_type = transaction_type;
        this.amount = amount;
        this.description = description;

    }

    //viewing transaction
    public static int viewTransaction() {
        System.out.println("Date: " + tdate);
        System.out.println("Transaction Type: " + transaction_type);
        System.out.println("Amount: " + amount);
        System.out.println("Description: " + description);
        return amount;
    }


class Expensemanager extends Transaction{
    @SuppressWarnings("static-access")
    public int total_statistics(){
        return this.amount*this.amount;
    }

}
    

class Shinexpense {
    @SuppressWarnings("static-access")
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //int times;
        int choice;

    while (true) {
        
    
        System.out.println("1. Adding a new transaction");
        System.out.println("2. Viewing the transaction");
        System.out.println("3. Viewing total statistics");
        System.out.println("4. Exit");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice){

            //adding new transaction
            case 1:
            // System.out.println("How many transactions do you want to record?: ");
            // int times = Integer.parseInt(sc.nextLine())

            System.out.println("Enter the date of transaction: ");
            String tdate = sc.nextLine();

            System.out.println("Enter the type of transaction: ");
            String transaction_type = sc.nextLine();

            System.out.println("Enter the Amount: ");
            int amount = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the Description: ");
            String description = sc.nextLine();


            Transaction str = new Transaction();
            str = new Transaction(tdate, transaction_type, amount, description);

            try {
                FileWriter mytranstbl = new FileWriter("expense.txt", true);
                mytranstbl.write(str.viewTransaction());
                mytranstbl.write("\n");
                mytranstbl.close();
            } catch (IOException e){
                System.err.println("Error occured");
                e.printStackTrace();
            }

            break;


            //viewing the transaction
            case 2:
            viewTransaction();

            break;


            case 3:
            total_statistics();
            
            break;

            case 4:
            System.out.println("Exiting!!!");

            break;


            default:
            System.out.println("Invalid choice");
            break;

        }   }  

    }

    private void total_statistics() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'total_statistics'");
    }
        }
    }


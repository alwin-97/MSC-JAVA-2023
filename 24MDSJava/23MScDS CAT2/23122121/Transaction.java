
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Transaction {
    private static int cashTransNo = 0;
    private static int cardTransNo = 0;
    private static int saleNumber = 1;
    private static double titalsales = 0;

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. make card Transaction: ");
            System.out.println("2. make cash Transaction: ");
            System.out.println("3. Add sales: ");
            System.out.println("4. Display total sales: ");
            System.out.println("5. read and display card Payments: ");
            System.out.println("6. read and Display cash Payments: ");
            System.out.println("7. Exit... ");
            System.out.print("8. Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    makeCardTransaction(scanner);
                    break;
                case 2:
                    makeCashTransaction(scanner);
                    break;
                case 3:
                    addsales(scanner);
                    break;
                case 4:
                    Displaytotalsales();
                    break;
                case 5:
                    readandDisplaycardpayments();
                    break;
                case 6:
                    readandDisplaycashpayments();
                    break;
                case 7:
                    System.out.println("Exiting..");
                    System.exit(0);
                    default:
                    System.err.println("inavalid content please try again: ");
                    break;
                
            }
     
        }
    }

    private static void makeCardTransaction(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter transaction date: ; ");
        String transDate = scanner.nextLine();
        System.out.print("Enter amount to be paid: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("enter card owner name: ");
        String cardownerName = scanner.nextLine();

        String encryptedCardNumber = cardDetailEncrypt(cardNumber);
        savecardTransactionToFile(++cardTransNo, transDate, amount, encryptedCardNumber, cardownerName);
        System.out.println("card transaction saved successfully");
    }


   
    private static void makeCashTransaction(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter transaction date: ; ");
        String transDate = scanner.nextLine();
        System.out.print("Enter ampont to be paid: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter customer name: ");
        String cashownerName = scanner.nextLine();

        saveCashTransactionToFile(++cardTransNo, transDate, amount, cashownerName);
        System.out.println("cash transaction saved successfully");
    }
    private static void saveCashTransactionToFile(int transNo, String transDate, double amount, String customerName) {
        try (FileWriter writer = new FileWriter("cash_transaction.txt", true) {
            writer.write(transNo + "," + transDate + "," + amount + "," + customerName + "\n");
            
        } catch (Exception exception) {
            System.err.println("file not found: ");
        }
        
        private static void addsales(Scanner scanner) {
            try {
                scanner.nextLine();
                System.out.print("enter customer name: ");
                String transDate = scanner.nextLine();
                System.out.print("Enter item purchased: ");
                String item = scanner.nextLine();
                System.out.print("Enter sales  per unit: ");
                double salesPerUnit = scanner.nextDouble();

                System.out.print("Enter quantity sold: ");
                int quantitysold = scanner.nextInt();
                double sales = salesPerUnit * quantitysold;


            } catch (Exception e) {
                
            }
        }


    

    private static void Displaytotalsales() {
        
        throw new UnsupportedOperationException("Unimplemented method 'Displaytotalsales'");
    }

    private static void readandDisplaycashpayments() {
        // 
        throw new UnsupportedOperationException("Unimplemented method 'readandDisplaycashpayments'");
    }

    private static void readandDisplaycardpayments() {
        // TODO Auto-
        throw new UnsupportedOperationException("Unimplemented method 'readandDisplaycardpayments'");
    }
    private static void savecardTransactionToFile(int i, String transDate, double amount, String encryptedCardNumber,
    String cardownerName) {
throw new UnsupportedOperationException("Unimplemented method 'savecardTransactionToFile'");
}


private static String cardDetailEncrypt(String cardNumber) {
// TODO Auto-generated method stub
throw new UnsupportedOperationException("Unimplemented method 'cardDetailEncrypt'");
}
    }



    




/*class transaction{
    protected String title;
    protected int publisher;
    protected int date;

    public transaction( String title, int publisher, int date ) {
        this.title = title;
        this.publisher = publisher;
        this.date = date;

    }

    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("publisher: " + publisher);
        System.out.println("Date: " + date);

    }

}

class TransactionType extends transaction {
    private String transactiontype;
    private String Card;
    private String Cash;
    private int amount;
    public TransactionType( String title, int publisher, int date, String transactiontype, String Card, String cash, int amount) {
        super (title, transactiontype, amount);
        this. = transactiontype;

    }
    

    

}/* */

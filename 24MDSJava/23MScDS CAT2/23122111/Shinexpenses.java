import java.util.*;
import java.io.*;

public class Shinexpenses{
    private static final String Expense_Folder = "expenmse/";
    private static int totalTracsaction = 0;
    private static double totalspend = 0.0;
    private static double totalspend = 0.0;
    private static double totalspend = 0.0;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File folder = new File(Expense_Folder);
        if(!folder.exists()){
            folder.mkdirs();
        }

        //menudriven part:
        while(true){
            System.out.println("WELCOME TO EXPENSE TRACKER");
            System.out.println("1.ExpenseManager");
            System.out.println("2 viewStatistics");
            System.out.println("exit");
            System.out.println("ENTER YOUR CHOICE");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                     ExpenseManager(scanner);
                     break;
                case 2:
                   viewStatistics();
                break;
                case 3:
                System.out.println("EXIT");
                break;
            

            }
        }
    }

    private static void ExpenseManager(Scanner scanner){
        String customerName = getCustomerName(scanner);
        int[] paymentMethod = getTranscationDetails(scanner);
      
        String typeoftransaction = getTrasactionDetails(scanner);
        double totalAmount = getTotalAmount(paymentMethod);
        String customerFileName = saveCustomerDetails(customerName,paymentMethod,orderDetails,totalAmount);

        System.out.println("transaction" + customerFileName);
    };
  

   

    private static String getCustomerName(Scanner scanner){
        System.out.println(" ENTER CUSTOMER NAME :");
        return scanner.nextLine();
        
    }
    private static String getDate(Scanner scanner){
        System.out.println(" ENTER DATE(YYYY-MM-DD):");
        return scanner.nextLine();
        
    }
    private static int[] getTranscationDetails(Scanner scanner)
    {

       
        System.out.println(" Credit/Debit");
        System.out.println(" 1. CREDITED");
        System.out.println(" 2. DEBITED");
       ;

        int[] quantites = new int[2];
        for (int i = 0;i<quantites.length;i++){
            quantites[i]=scanner.nextInt();
            scanner.nextLine();
           
        }
        return quantites;

    }
   private static gettotalRevenue(double[] prices) {
        double totalAmount =0.0;
        for(int i;i< quantites.length;i++){
            totalAmount+= quantites[i]*prices[i];
        }
        return totalAmount;

    }
    private  clacculateTotalAMOUNT(INT[]quantites,DOUBLE[]PRICES){
        double totalAmount =0.0;
        for(int i;i< quantites.length;i++){
            totalAmount+= quantites[i]* prices[i];
        }
        return totalAmount;
    }
    private static String saveCustomerDetails (double[]getTotalAmount,int[] paymentMethod, int[] orderDetails){

        String fileName = Expense_Folder+System.currentTimeMillis()+".txt";
         try(BufferedWriter writer = new BufferedWriter(newFileWriter(fileName))){
        writer.write("PAYMENT METHOD"+paymentMethod +"\n");
        writer.write("PAYMENT METHOD"+getTotalAmount +"\n");
        writer.write("PAYMENT METHOD"+orderDetails +"\n");
        for(int i =0;i<orderDetails.length;i++){
            writer.write ("item"+(i+1)+"quantity" + orderDetails[i]+"\n");
        }
        }catch(IOException e){
            e.printStackTrace();
        }
        return fileName;

   }

    private static Writer newFileWriter(String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newFileWriter'");
    }
private static void viewStatistics(){
    System.out.println("total transaction"+ totalTracsaction);
    System.out.println("total transaction"+ totalRevune);
} 
    
}
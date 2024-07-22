import java.util.*;
import java.io.*;




//-------------------------------------------------------------------------------------------------------//
class Transaction{
    static String date;
    static String transactionType;
    static String amount;
    static String description;
    public Scanner scan = new Scanner(System.in);
    public int transactioncount; 
    // public String[][] track = new String[100][100];

    Transaction(){
        this.date = "";
        this.transactionType = "";
        this.amount = "";
        this.description = "";
    }
    Transaction(String date,String transactionType, String amount, String description){
        this.date = date;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;

    }

    // public void addtransaction(){
    //     //for(int i = 0;i<transactioncount;i++){
    //         // System.out.println("Adding a Transaction......");
    //         // System.out.println("|---------------------------------------------------|");
    //         // System.out.println("Enter date in DD-MM-YYYY format - ");
    //         // track[0][0] = scan.nextLine();
    //         // System.out.println("Enter the transaction type - ");
    //         // track[0][1] = scan.nextLine();
    //         // System.out.println("Enter amount - ");
    //         // track[0][2] = scan.nextLine();
    //         // System.out.println("Enter description - ");
    //         // track[0][3] = scan.nextLine();


    //     //}       

    // }
    // public void viewTransaction(){
    //     System.out.println("|   SL.No   DATE    TransactionType Amount  Description |");
        
    //     for(int i = 0;i<transactioncount;i++){
    //         String date = track[i][0];
    //         String transactionType = track[i][1];
    //         String amount = track[i][2];
    //         String description = track[i][3];
    //         int Slno = i+1;

    //         System.out.println("|\t"+Slno+"\t"+date+"\t"+transactionType+"\t"+amount+"\t"+description+"\t"+"|");

    //        System.out.println("Total no of transaction - "+transactioncount);
    //     }
        
    // }
    
}
//-------------------------------------------------------------------------------------------------------//

class ExpenseManager extends Transaction{
    public String datee;
    private String totalIncome;
    private String expense;
    public double average;
    static int count;
    static int expensecount;
    static int sum;
    //static int num;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public String[] icex = new String[100];

    ExpenseManager(String totalIncome, String expense){
        super(date,transactionType,amount,description);
        this.totalIncome = totalIncome;
        this.expense = expense;

    }
    public void incomexpenses(){
        System.out.println("Enter date in DD-MM-YYYY format - ");
        icex[0] = scan.nextLine();
        System.out.println("Add Income - ");
        icex[1] = scan.nextLine();

        System.out.println("Add Expense for this month - ");
        icex[2] = scan.nextLine();
        expensecount++;
    }
    // public void statistics(){
    //     int income = Integer.parseInt(icex[0]);
    //     int expense = Integer.parseInt(icex[1]);
        

    //     System.out.println("Statistical Analysis");
    //     System.out.println("|   SlNo    Average    Minimum    Maximum    |");
    //     for(int i=0;i<expensecount;i++){
    //         int slno = i+1;
    //         int sum = expense ++ ;
    //         double average = sum/expensecount;

    //         if(expense<min){
    //             min = expense;
                
    //         }else if(expense>max){
    //             max = expense;
    //         }
    //         System.out.println("|    "+slno+"    "+average+"    "+min+"    "+max+"    |");               

    //     }
    // }



}
//-------------------------------------------------------------------------------------------------------//
public class ShineExpense{
    public save_to_file(filename){
        try{
                        FileWriter filewriter = new FileWriter(filename,true);
                        filewriter.write(int income = Integer.parseInt(icex[0]);
                                        int expense = Integer.parseInt(icex[1]);
        

                                        System.out.println("Statistical Analysis");
                                         System.out.println("|   SlNo    Average    Minimum    Maximum    |");
                                        for(int i=0;i<expensecount;i++){
                                            int slno = i+1;
                                            int sum = expense ++ ;
                                             double average = sum/expensecount;

                                            if(expense<min){
                                                min = expense;
                
                                            }else if(expense>max){
                                                max = expense;
                                            }
                                            System.out.println("|    "+slno+"    "+average+"    "+min+"    "+max+"    |");               

                                        });
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }

    }
    public static void main(String[] args){
        String[][] track = new String[100][100];
        Scanner scan = new Scanner(System.in);
        //String date = LocalDate;
        int choice;
        Transaction trans = new Transaction();
        //ExpenseManager manager = new ExpenseManager();

        do{
            System.out.println("Welcome to Daily Financial Tracker");
            System.out.println("---------------------------------------------------");
            //System.out.println("Date - "+date);
            System.out.println("1. Add a transaction ");
            System.out.println("2. View the Transacition");
            System.out.println("3. View Statistics");
            System.out.println("4. Save the transaction details to file");
            System.out.println("5. View the file");
            System.out.println("6. Exit");
            System.out.println("---------------------------------------------------");

            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch(choice){
                case 1: 
                    System.out.println("Adding a Transaction......");
                     System.out.println("|---------------------------------------------------|");
                     System.out.println("Enter date in DD-MM-YYYY format - ");
                     track[0][0] = scan.nextLine();
                     System.out.println("Enter the transaction type - ");
                     track[0][1] = scan.nextLine();
                     System.out.println("Enter amount - ");
                     track[0][2] = scan.nextLine();
                     System.out.println("Enter description - ");
                     track[0][3] = scan.nextLine();
                    break;
                case 2:
                    System.out.println("|   SL.No   DATE    TransactionType Amount  Description |");
        
                    for(int i = 0;i<transactioncount;i++){
                        String date = track[i][0];
                        String transactionType = track[i][1];
                        String amount = track[i][2];
                        String description = track[i][3];
                       int Slno = i+1;

                        System.out.println("|\t"+Slno+"\t"+date+"\t"+transactionType+"\t"+amount+"\t"+description+"\t"+"|");

                    System.out.println("Total no of transaction - "+transactioncount);
                    }
                    
                    break;
                case 3:
                    int income = Integer.parseInt(icex[0]);
                    int expense = Integer.parseInt(icex[1]);
        

                    System.out.println("Statistical Analysis");
                    System.out.println("|   SlNo    Average    Minimum    Maximum    |");
                      for(int i=0;i<expensecount;i++){
                        int slno = i+1;
                        int sum = expense ++ ;
                        double average = sum/expensecount;

                        if(expense<min){
                            min = expense;
                
                        }else if(expense>max){
                              max = expense;
                        }
                        System.out.println("|    "+slno+"    "+average+"    "+min+"    "+max+"    |");               

                    }
                    break;
                case 4:
                    save_to_file("transaction_details.txt");
                    break;
                case 5:
                    try{
                        File file = new File("transaction_details.txt");
                        Scanner fileReader = new Scanner(file);

                        while(fileReader.hasNextLine()){
                            String data = fileReader.nextLine();
                            System.out.println(data);
                        }
                        fileReader.close();

                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...........");
                    break;
                default:
                    System.out.println("Invalid choice");
            }     
            



        }while (choice !=6);
            scan.close();
        
    }
    
}

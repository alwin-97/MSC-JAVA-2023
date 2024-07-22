import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

    // class Transaction to store attributes
class Transaction {
    public String date;
    public String transctiontype;
    public int amount;
    public String description;

    // initialising the constructor
    Transaction() {
        this.date = "";
        this.transctiontype = "";
        this.amount = 0;
        this.description = "";
    }

    // parametrised constructor
    Transaction(String date, String transctiontype, int amount, String description) {

        this.date = date;
        this.transctiontype = transctiontype;
        this.amount = amount;
        this.description = description;

    }

    // to call the items with return
    public String Transactiondetails() {
        return "Date:" + this.date + " " + "Transaction Type:" + this.transctiontype + " " + "Amount:" + this.amount
                + " " + "Description:" + this.description;
    }
}

// class Expensemanager that inherits the Transaction class
class Expensemanager extends Transaction {
    public float totalincome;
    public float expense;

    // initialising the constructor
    Expensemanager() {
        this.totalincome = 0.0f;
        this.expense = 0.0f;
    }

    // parametrised constructor
    Expensemanager(float totalincome, float expense) {
        this.totalincome = totalincome;
        this.expense = expense;
    }

     // to call the items with return
    public String Expmanagedtl() {
        return "Toatl Income:" + this.totalincome + " " + "Expense:" + this.expense;
    }

        // calc toatl statistic function
    // public float toatlstatistics(){
    //     return "Toatl Income:" + this.totalincome + " " + "Expense:" + this.expense;

    // }

}

public class ShineExpense {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Choice = 0;

        try{
                // creating txt file to store data
            File transactiontbl = new File("transactiondetails.txt");
            if(transactiontbl.createNewFile()){
                System.out.println("File Created"+transactiontbl);
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }


        // Menu Drive 
        while (true) {

            System.out.println(" ==========================");
            System.out.println("|    FINANCIAL TRACKER    |");
            System.out.println(" ==========================");
            System.out.println("1. Adding Transaction");
            System.out.println("2. Viewing Transactions");
            System.out.println("3. Viewing Total Statistics");
            System.out.println("4. Exit");
            System.out.println("___________________________");
            System.out.print("Enter your Choice: ");
            Choice = Integer.parseInt(scan.nextLine());

            switch (Choice) {

                case 1:
                    // user entering Details
                    System.out.print("Number of Transactions: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for(int i=1; i<=n; i++ ){

                        System.out.println("Enter the date");
                        String date = scan.nextLine();

                        System.out.println("Enter the Transaction type");
                        String transctiontype = scan.nextLine();

                        System.out.println("Enter the Income");
                        int amount = Integer.parseInt(scan.nextLine());

                        System.out.println("Enter the Description");
                        String description = scan.nextLine();

                        Transaction trans = new Transaction();
                        trans = new Transaction(date, transctiontype, amount, description);

                        try {
                            
                                // appending the details to the created txt file/ adding transactions here
                            FileWriter transwrite = new FileWriter("transactiondetails.txt",true);
                            transwrite.write(trans.Transactiondetails());
                            transwrite.write("\n");
                            transwrite.close();

                        } catch (Exception e) {
                            System.out.println("eror occured");
                            e.printStackTrace();
                        }
                        System.out.println("Details Entered Succefully");



                    }

                    break;

                    case 2:
                        try{

                                // implementation of viewing transactiondetails in the txt file 
                            File transactiontbl  = new File("transactiondetails.txt");
                            Scanner transs = new Scanner(transactiontbl );
                            while (transs.hasNextLine()) {
                                String data = transs.nextLine();
                                System.out.println(data);
                                
                            }
                            transs.close();

                        } catch (Exception e) {
                            System.out.println("eror occured");
                            e.printStackTrace();
                        }
                        break;
                    
                    case 3:
                    // implemenation of toatl statistic


                    // try{
                    //     File stattbl = new File("Statistics.txt");
                    //     if(stattbl.createNewFile()){
                    //         System.out.println("Created"+ stattbl);
                    //     }else{
                    //         System.out.println("already exist");
                    //     }
                    // } catch (Exception e) {
                    //     System.out.println("eror occured");
                    //     e.printStackTrace();
                    // }

                    // try{ 
                    //     File transactiontbl = new File("transactiondetails.txt");
                    //     FileWriter mystattbl = new FileWriter("Statistics.txt");

                    //     Scanner mystatreader = new Scanner(transactiontbl);
                    //     while (mystatreader.hasNextLine()) {
                    //         String data = mystatreader.nextLine();
                    //         System.out.println(data);
                    //         String[]  hlo = data.split(" ");
                    //         Transaction hihlo = new Transaction(hlo[0],hlo[1],Integer.parseInt(hlo[2]));
                    //         hihlo.toatlstatistics();

                    //     }

                    // }catch (Exception e) {
                    //     System.out.println("eror occured");
                    //     e.printStackTrace();

                        System.out.println("Technical issue working on it !!!!!!");
                        break;

                    case 4:
                            //  to exit from the program
                        System.out.println("Exiting..");
                        System.exit(0);

                     default:
                        System.out.println("Wrong Choice!!!");
                        break;
            }

        }
    }
}
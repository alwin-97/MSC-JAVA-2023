import java.util.*;
import java.io.*;

// ------ class ---------
class Transaction{
    private String date;
    private String type;
    private Float amount;
    private String desc;

    // ---------- Constructors ------------
    public Transaction(String date,String type,Float amount,String desc){
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.desc = desc;
    }

    // --------- Methods --------------
    public String getDate(){
        return date;
    }

    public String getType(){
        return type;
    }

    public Float getAmount(){
        return amount;
    }

    public String getDesc(){
        return desc;
    }
}

// --------- sub class (Inheritance) ------------

class Expensemanager extends Transaction {
    private Float income;
    private Float exp;

    public Expensemanager(Float income,Float exp) {
        super(date,type,amount,desc);
        computeincome();
        computeexp();

    }
}


// ----------- Main Class ---------------
class Shinexpense{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // ------------- Choices ---------------
        while(true){
            System.out.println("\n1. Add a new Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. View Total Statistics");
            System.out.println("4. Exit");

            System.out.println("\nSelect a choice :");

            int choice = Integer.parseInt(scan.nextLine());

            switch(choice) {
            
                case 1:
                    // ----------------- User Inputs -----------------------

                    System.out.println("--------------ADD DETAILS-------------\n");

                    System.out.println("Transaction Date :");
                    String date = scan.nextLine();

                    System.out.println("Transaction type :");
                    String type = scan.nextLine();

                    System.out.println("Transaction Amount :");
                    float amount = Float.parseFloat(scan.nextLine());

                    System.out.println("Description on Transaction :");
                    String desc = scan.nextLine();

                    // --------------- Adding details to file --------------------

                    try(
                        FileWriter tran = new FileWriter("Transactions.csv",true)){
                        tran.write(date + "," + type + "," + amount + "," + desc + "\n");
                        } catch(Exception e) {
                        System.out.println("Error occured !!!");
                    }
                    
                    break;

                case 2:
                    // ----------------- Reading details from file ------------------

                    System.out.println("-----------View Transaction-------------\n");
                    
                    try{
                        File file = new File("Transactions.csv");
                        Scanner filereader = new Scanner(file);
                        while (filereader.hasNextLine()){
                            System.out.println(filereader.nextLine());
                        }
                        filereader.close();
                    } catch(Exception e) {
                        System.out.println("Error occured....!!!");
                    }
                    break;

                case 3:
                    System.out.println("----------------Total Statistics----------------\n");


                    break;

                case 4:
                    // ---------------- Exiting from Program ----------------------

                    System.out.println("============E.X.I.T.E.D============");
                    System.exit(0);
            }
        }        
    }

}
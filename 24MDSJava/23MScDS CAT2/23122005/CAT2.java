//for the given question we will start from importing teh necessorry packages
import java.io.*; 
import java.util.*;

//here there will be three classes , base class, inhetiance class and main class where Transactions is a base class which will store all the basic data 

class Transactions{
    String date;
    String transType;
    double amount;
    String description;

    // creating getter and setter
    public Transactions(String date,String transType, double amount, String description){
        this.date=date;
        this.transType=transType;
        this.amount=amount;
        this.description=description;
    } // printing thje details
    public void printDetails(){
        System.out.println("Date: "+date);
        System.out.println("TransType: "+transType);
        System.out.println("Amount: "+amount);
        System.out.println("Description: "+description);
    }


}
// here the expenseManager is a inehritance class which will inheritate the values from the base class transactions

class expenseManager extends Transactions{
    int income;
    int expenses;
    ArrayList<String>trans;

    public expenseManager(String date,String transType, double amount, String description,int income, int expenses,ArrayList<String>trans){
        super(date,transType,amount,description);
        this.income=income;
        this.expenses=expenses;
        this.trans=trans;

    }

    public int getIncome(){
        return income;   // creating some use defined functions for later use
    }

    public int getExpenses(){
        return expenses;
    }

    public void printDetails(){   //prining the details again where we use super for inheritating the values from the base class
        super.printDetails();
        System.out.println("Total Income: "+income);
        System.out.println("Total Expenses: "+expenses);

    }



}

// the CAT2 is teh main class here which will be taking in[puts and printing the results form the other classws]
class CAT2 {
    private static final String Transactions_FILE="trans.csv";
    private ArrayList<Trans>transs;

    
    public CAT2(){
        transs=new ArrayList<>();

    }
    public void addTrans(String date,String transType, double amount, String description,int income, int expense,ArrayList<String>trans){
        transs.add(new Trans(date,transType,amount,description,income,expense,trans));
    }

    public void saveTranstoFile(){
        try (PrintWriter writer=new PrintWriter(
            new FileWriter(Transactions_FILE)  //defining a function to save teh transactions to the file 

        )){
            for(Trans transs:transs){
                writer.println(transs.getIncome()+transs.getExpenses());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void viewTrans(){  // frgining a function to view the transaction
        System.out.println(Transactions_FILE);
    }
        

    public void loaddata(){
        try(ObjectInputStream ois=new ObjectInputStream(new fileInputStream(Transactions_FILE))){
            transactions=(List<Transactions)ois.readObject();
        }
        catch (InvalidObjectException|ClassNotFoundException){
            transactions=new ArrayList<>();
        }
    }


    public static void main(String []args){

        CAT2 cat=new CAT2();
        
        Scanner scanner=new Scanner(System.in);
        int choice;          // prining teh menu

        do{ System.out.println("Welcome to the Expense Tracker.");
            System.out.println("=================================== ");
            System.out.println("1.Add Tranactions. ");
            System.out.println("2. View Transactions.");
            System.out.println("3.Add the data to the file. ");
            System.out.println("4.Print Statistics. ");
            System.out.println("5.load the data");
         
            System.out.println("6.Exits the program.");
            choice=scanner.nextInt();

            switch (choice) {                  // assigninig a variable choice for tasks to be done
  
            case 1:
       
            System.out.println("Please Enter the Date of the Transactions: ");
            String date=scanner.nextLine();
            System.out.println("please Enter the amount: ");
            double amount=scanner.next();
            System.out.println("Please Enter the Description: ");
            String description=scanner.nextLine();
            cat.addTrans();                       
                    
                    break;
                
            case 2:
            cat.viewTrans();
            break;

            case 3:
            cat.saveTranstoFile();
            break;


            case 4:
            cat.printDetails();
            break;

            case 5:
            cat.loaddata();
        
            break;

            case 6:
            System.out.println("Exiting.....");

            break;



            
                default:
                    break;
            }
        }while (choice!=5);
        scanner.close();   // ending the program
        
        
        
    
}
}
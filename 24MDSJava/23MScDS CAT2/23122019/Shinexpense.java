import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.time.LocalDate;

class Transaction{
    private LocalDate trans_date;
    private String trans_type;
    private Float trans_amount;
    private String description;

    Transaction(){//default constructor
        this.trans_amount=(float) 0;
        this.description="None";
        this.trans_date=LocalDate.now();
        this.trans_type="None";
    }
    Transaction(LocalDate date,String type,Float amt, String desc){
        this.trans_date=date;
        this.trans_type=type;
        this.trans_amount=amt;
        this.description=desc;
    }
    public LocalDate getdate(){
        return this.trans_date;
    }
    public String[] getDetails(){
        String[] ret_arr={this.trans_type,String.valueOf(this.trans_amount),this.description};
        return ret_arr;
    }
}

class Expensemanager extends Transaction{
    private Float total_income=(float) 0;
    private Float total_expense=(float) 0;
    private int counter=0;
    private Transaction[] manager=new Transaction[1000];
    
        
        
    //default constructor
    Expensemanager(){
        
        try{
            File file=new File("transaction.csv");
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String[] lineArr=line.split(",");
                this.manager[this.counter]=new Transaction(LocalDate.parse(lineArr[0]),lineArr[1],Float.parseFloat(lineArr[2]),lineArr[3]);
                add_income_expense(lineArr[1], Float.parseFloat(lineArr[2]));
                this.counter+=1;

            }
            reader.close();

        }
        catch(Exception e){
            e.getMessage();
        }

    }

    public void addTrans(LocalDate date,String type,Float amt, String desc ){
        this.manager[counter]=new Transaction(date,type,amt,desc);
        add_income_expense(type, amt);
        this.counter+=1;

    }
    public void add_income_expense(String type,float amt){
        if(type.equals("expense")){
            this.total_expense+=amt;
        }
        else{
            this.total_income+=amt;
        }
    }
    
    public Float getIncome(){
        return this.total_income;
    }

    public Float getExpense(){
        return this.total_expense;
    }

    public Transaction[] getTransactions(){
        return this.manager;
    }
    public int getcounter(){
        return this.counter;
    }

}

public class Shinexpense {
   

    public static String[] getTransactionInput(Scanner scan){
        System.out.print("Type of transaction (expense/income): ");
        String type=scan.nextLine().toLowerCase().trim();
        System.out.print("Transaction amount: ");

        String amt=scan.nextLine().trim();
        System.out.print("Description: ");
        String desc=scan.nextLine().trim();
        String[] arr={type,amt,desc};
        return arr;

    }
    public static void saveToFile(Transaction[] manager,int counts){
        try{

            FileWriter writer=new FileWriter("transaction.csv",true);
            
            for(int i=0;i<counts;i++){
                String[] details=manager[i+1].getDetails();
                LocalDate date=manager[i+1].getdate();
                writer.write(date+","+details[0]+","+details[1]+","+details[2]+"\n");
                
        }
        }catch(Exception e){
            e.getMessage();
        }
        
    }
    static void viewTransactions(Transaction[] manager,int counter){

        for(int i=0;i<counter;i++){
            String[] details=manager[i].getDetails();
            LocalDate date=manager[i].getdate();
            System.out.println(date+","+details[0]+","+details[1]+","+details[2]);

    }
}
    public static void main(String[] args){

        //load from file
        Expensemanager manage=new Expensemanager();
        
        char to_continue='y';
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1. Add new transaction");
            System.out.println("2. View transactions");
            System.out.println("3. Get total statistics");
            System.out.println("4. Exit");

            System.out.println("Enter your choice");
            int choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                    LocalDate date=LocalDate.now();  //gets date
                    String[] inputArr=getTransactionInput(scan);
                    manage.addTrans(date,inputArr[0],Float.parseFloat(inputArr[1]),inputArr[2]);
                    break;
                case 2:
                    int count=manage.getcounter(); //count to iterate thru array

                    viewTransactions(manage.getTransactions(),count);
                    break;
                case 3:
                    System.out.println("Total Income: "+manage.getIncome()); //initialise
                    System.out.println("Total expense: "+manage.getExpense());
                    break;
                case 4:
                //save to file
                    int counts=manage.getcounter();
                    saveToFile(manage.getTransactions(),counts);
                    to_continue='n';
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }


        } while(to_continue=='y');
        scan.close();
        

    }
}

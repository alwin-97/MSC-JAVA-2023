import java.util.*;
import java.io.*;
public class ShineExpense{
public static void main(String[] arg){ //main class which conatin the main method
     Scanner scan=new Scanner(System.in);
     Transaction[] transactions=new Transaction[30];//calling object of the class transaction 
     ExpenseManager[] expenseManagers=new ExpenseManager[30];//calling object of the class expensemanager
     int tr_count=0;
     int ex_count=0;
     int line_count=0;
     String[] detils=new String[30];
    //  try{            //reading the transcation.txt file when the program starts
    //     File Fileread=new File("Transaction.txt");
    //     Scanner read =new Scanner(Fileread);
    //     while(read.hasNextLine()){
    //         String lines=read.nextLine();
    //         detils=lines.split(",");
    //         transactions[tr_count]=new Transaction(detils[0],detils[1],Integer.parseInt(detils[2]),detils[3]);
    //         expenseManagers[line_count]=new ExpenseManager(detils[0],detils[1],Integer.parseInt(detils[2]),detils[3],Integer.parseInt(detils[4]),Integer.parseInt(detils[5]));
    //         line_count++;
    //     }
    //  }catch(Exception ex){
    //     System.out.println("file reading error");

    //  }
     
     while(true){      //while loop for menu driven programing
        try{            //reading the transcation.txt file when the program starts
            File Fileread=new File("Transaction.txt");//reading the transcation.txt file when the program starts and uppending to transaction and expensedetils consturctor
            Scanner read =new Scanner(Fileread);
            while(read.hasNextLine()){
                String lines=read.nextLine();
                detils=lines.split(",");
                transactions[tr_count]=new Transaction(detils[0],detils[1],Integer.parseInt(detils[2]),detils[3]);
                expenseManagers[line_count]=new ExpenseManager(detils[0],detils[1],Integer.parseInt(detils[2]),detils[3],Integer.parseInt(detils[4]),Integer.parseInt(detils[5]));
                line_count++;
            }
         }catch(Exception ex){
            System.out.println("file reading error");
         }
    
        System.out.println("*************MENU****************");//menu driven option
        System.out.println("1.ADD NEW TRANSACTION ");
        System.out.println("2.VIEW THE TRANSACTION ");
        System.out.println("3.VIEW THE TOTAL STATISTCS ");
        System.out.println("4.EXIT ");
        System.out.println("********************************");
        System.out.println("");
        System.out.print("ENTER YOUR CHOICE :");
        int choice=Integer.parseInt(scan.nextLine());//taking the choice
        switch(choice){   //using switch for diffrent cases of menu
            case 1:
            try{     //writting input to file
               
            FileWriter file=new FileWriter("Transaction.txt",true); //creating a file object for writting
            
            System.out.print("ENTER DATE :");
            String date=scan.nextLine();
            System.out.print("ENTER TRANSACTION TYPE :");
            String Trans_type=scan.nextLine();
            System.out.print("ENTER AMOUT :");
            int amount=Integer.parseInt(scan.nextLine());
            System.out.print("ENTER DESCRIPTION :");
            String description=scan.nextLine();
            System.out.print("ENTER TOTAL INCOME :");
            int income=Integer.parseInt(scan.nextLine());
            System.out.print("ENTER EXPENSE :");
            int expense=Integer.parseInt(scan.nextLine());
            transactions[tr_count]=new Transaction(date,Trans_type,amount,description); //passing values to transaction constructor
            expenseManagers[ex_count]=new ExpenseManager(date, Trans_type, amount, description, income, expense);//passing values to ExpenseMnager constructor


            file.write(date+",");  //writting values to transaction.txt
            file.write(Trans_type+",");
            file.write(amount+",");
            file.write(description+",");
            file.write(income+",");
            file.write(expense+"\n");
             file.close();
             tr_count++;
             ex_count++;
            }catch(Exception ex){
                System.out.println("exception error");
               
            }
            
            break;
            case 2:

            for(int i=0;i<line_count;i++){     //printing all the all transaction detils
                System.out.println();
                System.out.println("DATE :"+transactions[tr_count].tr_Date());
                System.out.println("TRANSACTION TYPE :"+transactions[tr_count].tr_type());
                System.out.println("AMOUNT :"+transactions[tr_count].tr_amount());
                System.out.println("DESCRIPTION :"+transactions[tr_count].tr_description());
                System.out.println("INCOME :"+expenseManagers[ex_count].tr_income());
                System.out.println("INCOME :"+expenseManagers[ex_count].tr_expense());
            
            
            }
            break;
            case 3:
            int total_expense=0;         //finding the total income and total expense and printing the values
            int total_income=0;
            for(int i=0;i<line_count;i++){
                total_income+=expenseManagers[ex_count].tr_income();
                total_expense+=expenseManagers[ex_count].tr_expense();
            }
            System.out.println("TOTAL INCOME :"+"\t"+total_income);
            System.out.println("TOTAL EXPENSE :"+"\t"+total_expense);
            
            break;
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("input error ");
            break;
            
        }



     }
 





}
}
class Transaction{       //this class take data,transaction type,amout,description using constructor from the main program
    private String date;
    private String Trans_type;
    private int amount;
    private String description;
    Transaction(){

    }
    Transaction(String date,String Trans_type,int amount,String description){ //consturctor which take data,transaction type,amout,description
        this.date=date;
        this.Trans_type=Trans_type;
        this.amount=amount;
        this.description=description;
    }

    public String tr_Date(){ //function returning date
        return this.date;
    }
    public String tr_type(){ //function returning trnasaction type
        return this.Trans_type;
    }
    public int tr_amount(){ //function returning amout
        return this.amount;
    }
    public String tr_description(){ //function returning description
        return this.description;
    }

}
class ExpenseManager extends Transaction{ //class which extended from transcation ,it has income and expense detill also
    private int income;
    private int expense;
    ExpenseManager(String date,String Trans_type,int amount,String description,int income,int expense){ //consturctor which store all transcation detil,income and expense
          super(date,Trans_type,amount,description);
          this.income=income;
          this.expense=expense;
    }
    public int tr_expense(){ //function which return expense
        return this.expense;
    }
    public int tr_income(){ //function which return income
        return this.income;
    }

    
}
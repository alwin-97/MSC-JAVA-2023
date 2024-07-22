import java.io.*; //imported the java input and output libraries to the program
import java.util.Scanner; //imported the scanner from utilities of JAVA to scan the details enterd by Mr.Shine..
public static int[] total_transactions; //total transactions in array datatypd as integer value to store total transactions per day
public static String Date; //date of the day which is transaction is happend
public static String Transaction_type; //type of the transaction online or offline 
public static int Amount; //amount of the transaction 
public static String Description; //Descroption of the transaction
public class Transaction(){ //class called Transaction
    String this.Date; //passed the attribute date
    String this.Transaction_type; //passed the attribute transaction_type
    String this.Amount; //passed the attribute amount
    String this.Description; ////passed the attribute description
    String this.total_transactions; ////passed the attribute total_transactions

}
public static void main String[args()]{ //the main function of the code
    String Date; //declared a variable date as string
    String Transaction_type; //declared a variable transaction_type as string
    int Amount; ////declared a variable amount as integer
    String Description; //declared a variable description as string
    int total_transactions; //declared a variable date as an integer to store total transactions done
    int choice; //declared a variable for the choice of Mr.Shine to what to do??...
    int flag = 0;
    Scan.sc=new Scanner(System.in); //scanner open before do while loop to scan the Mr.Shine's inputs
    // MENU FOR SELECTING OPTIONS 
    do{
        System.out.println("================================================================");
        System.out.println(" SHINE'S DAILY EXPENSE TRACKER - CLI"); //title of the program
        System.out.println("SELECT ONE OF THE CHOICES BELOW MR.SHINE : ");
        System.out.println("1.FOR ADDING NEW TRANSACTION");
        System.out.println("2.FOR SAVING THE DETAILS TO A NEW FILE");
        System.out.println("3.FOR VIEWING THE TRANSACTIONS YOU HAVE MADE");
        System.out.println("4.FOR VIEWING THE TOTAL STATISTICS OF THE EXPENSES");
        System.out.println("5.EXIT THE PROGRAM");
        choice.Integer parseInt(sc.NextLine()); //for scan the choice Mr.Shine haf made.
        case 1 : //for ading new transactions happend...
            System.out.println("ADD YOUR NEW TRANSACTION HERE : ");
            System.out.println("=================================");
            System.out.println("TODAY'S DATE : "); //date of the transaction
            Date = sc.NextLine(); //storing the vaoloue to Date
            System.out.println("TOTAL NUMBER OF TRANSACTIONS TODAY : "); //total number of transaction done in the day.
            total_transactions = Integer.parseInt(sc.NextLine());

            for(int i = 0;i<total_transactions;i++){ //for-loop, for enter the details about the transactions according to the total number of transactions made... 
                System.out.println("WHAT IS THE TRANSACTION FOR ? : ");
                Transaction_type = Integer.parseInt(sc.NextLine()); //accepting the value as passing as integer form string into the variable declared.
                System.out.println("Amount of the Transaction : ");
                Amount = Integer.parseInt(sc.NextLine()); //accepting and converting the value to integer value and storing the value to "Amount".
                System.out.println("DESCRIPTION ABOUT THE TRANSACTION : ");
                Description = sc.NextLine();
            } 
            break;
        case 2 : //for writing the details to a new text file called "shineexpense.txt"
            try{ //try catch is used for preventing outgoing of coompiler if any error occured or identiifying that there is an error occured.
                FileWriter filew = new FileWriter("shineexpense.txt");
                for(int i = 0 ; i < total_transactions ; i++){ 
                    filew.write(date + "," + total_transactions + "," + <br> + Transaction_type + "," + Amount + "," + Description); //it will store the details in this format
                }
                filew.close();
                System.out.println("THE DETAILS HAS BEEN STORED TO NEW FILE...");
            } catch{
                System.out.println("Something went wrong Mr.Shine please feel free to contact service provider.."); //here, it will print this message if any error has occured inside the try. Actually this method is a trial and error method.
            }
            break; 
        case 3 : // to show the transactions added that happend in daily..here, the transactions are showing according to the specific date given by Mr.Shine...
                System.out.println("TRANSACTION HISTORY...");
                System.out.println("========================");
                System.out.println("Tell me a Date which you want to know the details about ? : ");
                String key_date=sc.NextLine();
                try{
                    File file= new File("shineexpense.txt"); //loading the transaction details into a variable called "file" in the program...
                    Scanner details = new Scanner(file); //declared the scanner to read the datas in the variable file and store it into another variable "details".
                    while(details.hasNextLine()){ //while loop is used to read and split the content with "," this seperator".
                        String line = details NextLine(); //stored the datas in details into line variable datatyped as String. 
                        String() split_line = line.split(","); //splitted the datas using "," seperator, then it will show like "date","amount","transaction_type","description".                    }
                        if(split_line[0].equals(key_date)){ //the splitted data is transformed into seperated words using the seperator "," , here we check the 0th index of the data is equal to the data that given by Mr.Shine to see the daily expense... her ethe 0th index of the data is "date" if this date is equal to the "key_date"
                            System.out.println(line); //then the line that have the datas with the respected date will printed...
                        }
                    }
                    details.close(); //the scanner is closed after useage
                } catch{
                    System.out.println("Something went wrong Mr.Shine please feel free to contact service provider..");
                }
                break;
            case 4 : //the statistical view of the daily expenses of Mr.Shine to see and decide where to adjust the expenses in daily life... 
                System.out.println("THE STATISTICAL VIEW OF THE DAILY EXPENSES");
                System.out.println("===========================================");
                try{
                    int income = 0; //declaring the variable income
                    int expense = 0; //declaring the variable expense
                    int total_expense = 0;
                    float statistics = 0;
                    System.out.println("Tell me Mr.Shine what is your income of this month ? : ");
                    income.Integer parseInt(sc.NextLine()); //read the user input answer for income 
                    File file2= new File("shineexpense.txt"); //loading the transaction details into a variable called "file" in the program...
                    Scanner exdetails = new Scanner(file2); //declared the scanner to read the datas in the variable file and store it into another variable "exdetails".
                    while(exdetails.hasNextLine()){ //while loop is used to read and split the content with "," this seperator".
                        String line2 = exdetails NextLine(); //stored the datas in details into line variable datatyped as String. 
                        String() split_line2 = line.split(","); //splitted the datas using "," seperator, then it will show like "date","amount","transaction_type","description".                    }
                        // if(split_line[0].equals(key_date)){ //the splitted data is transformed into seperated words using the seperator "," , here we check the 0th index of the data is equal to the data that given by Mr.Shine to see the daily expense... her ethe 0th index of the data is "date" if this date is equal to the "key_date"
                        //     System.out.println(line);
                        expense = String() split_line2[3]; //s[plitted the datas to differentiate the datas and to read the amount in the data...
                        total_expense = sum(expense); //stored the sum of the expenses happend in the variable total_expense
                        statistcs =  total_expense/income; //finding the statistical approach of the expense happend with the income of Mr.Shine...
                        System.out.println("The expense happend in with the income"+ income "is : " + statistcs); //printed the statistics
                    }
                    exdetails.close(); //closed the scanner
                } catch {
                    System.out.println("Something went wrong Mr.Shine please feel free to contact service provider..");
                }
                break;
            case 5 : 
                 System.out.println("EXITING THE PROGRAM...!! \n THANKYOU MR.SHINE VISIT AGAIN :)");
                exit(); //to exit the program for Mr.Shine
                break;
    }
}



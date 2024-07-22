// 23122024
//Nilanjana Dey


import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

class Transactions
{
    protected String Date;
    protected String trans_type;
    protected double amt;
    protected String description;

    Transactions() //default constructor
    {
        this.Date="dd-mm-yyyy";
        this.trans_type="null";
        this.amt=0.0;
        this.description="";


    }

    Transactions(String Date,String trans_type,double amt, String description) //parameterized constructor
    {
        this.Date=Date;
        this.trans_type=trans_type;
        this.amt=amt;
        this.description=description;
    }

    public void details(){     //printing the details

        System.out.println("The date of transaction is : "+this.Date);
        System.out.println("The type of transaction is : "+this.trans_type);
        System.out.println("The Amount is : "+this.amt);
        System.out.println("Description of the transaction is : "+this.description);
    }


}


class Expensemanager extends Transactions{   //creation of subclass

    private double total_income;
    private double expense;
   
    


    Expensemanager() // default constructor
    {
        super();
        this.total_income=0.0;
        this.expense=0.0;

    }

    Expensemanager(String Date,String trans_type,double amt, String description,double total_income,double expense)
    {
        super(Date,trans_type,amt, description); //sending the parameters to the superclass constructor using super keyword
        this.total_income=total_income;
        this.expense=expense;
        
    }

    public void printdetails(){

        super.details(); //printing the details from superclass as well as subclass

        System.out.println("Total income is "+ this.total_income);
        System.out.println("Total expense is "+ this.expense);
    }

    String to_print(){  //returning the values in row format to store them in the file

        return this.Date+"\t\t"+this.trans_type+"\t\t"+this.amt+"\t\t"+this.description+"\t\t\t";
    }

}


public class Shineexpense {

    public static void main(String []args){


        // loading file about transaction details

        try{
            Scanner transFileReader=new Scanner(new File("trans_details.txt"));
            while(transFileReader.hasNextLine())
            {
                System.out.println(transFileReader.nextLine());
            }
            transFileReader.close();
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }
        //-------------------------------------




        Scanner ob=new Scanner(System.in);


        Expensemanager []trans_arr=new Expensemanager[100]; // creating the array of objects for the Expensemanager class


        int count=0;
        double total_income=0;
        double total_expense=0;


        trans_arr[count]=new Expensemanager();

        //creating a text file to write the headings
        try{
            FileWriter fileWriter=new FileWriter("trans_details.txt",true);
            fileWriter.write("Transaction_Date   Trans_Type   Trans_AMOUNT    Description                                            ");
            fileWriter.close();
        }

        catch(Exception e){

            System.out.println(e.getMessage());
        }


        // creating an infinite loop to run the menu driven program

        while(true){

            System.out.println("Enter the choice");
            
            int choice=Integer.parseInt(ob.nextLine());

             
            System.out.println("Choose any option from the given menu......................");
            System.out.println("1. Add new Transaction ");
            System.out.println("2. View the transaction");
            System.out.println("3. View total statistics ");
            System.out.println("4. Storing the transaction details in a file and exiting the program......");


            System.out.println("/n");
            System.out.println("------------------------------------------------------------");

            



            switch(choice){


                case 1:

                        System.out.println("Add transaction details................");

                        
            
                        System.out.println("Enter the Transaction Date ");
                        String trans_date=ob.nextLine();
            
                        System.out.println("Enter the Transaction type");
                        String type=ob.nextLine();
            
                        System.out.println("Enter the Transaction Amount");
                        double amt=Double.parseDouble(ob.nextLine());
            
                        System.out.println("Enter the Description of transaction");
                        String describe=ob.nextLine();

                        if (type== "income")
                        {
                            total_income=total_income+amt;
                           
                            trans_arr[count++]=new Expensemanager(trans_date,type,amt,describe,total_income,0);
                        }

                        else{

                            total_expense=total_expense+amt;
                            trans_arr[count++]=new Expensemanager(trans_date,type,amt,describe,0,total_expense);
                        }
                        
                        
                        break;


                case 2:  

                
                        System.out.println("View the transaction details");
                        try{
                        
                        for(int i=0;i< count;i++)
                        {
                            trans_arr[count].printdetails(); // calling the printdetails function of the Expensemanager class
                        }
                    }
                    catch(Exception e){

                        System.out.println(e.getMessage());
                    }
                        
                        break;

                case 3:

                        System.out.println("View the total statistics");
                        
                        System.out.println("The total monthly income is :"+ total_income);
                        System.out.println("The total monthly expense is :"+ total_expense);

                        System.out.println("Average daily income is : "+ total_income/30);

                        System.out.println("Average daily expense is : "+ total_expense/30);

                        System.out.println("Average  income is : "+ total_income/12);




                        break;

                case 4:

                        System.out.println(" Store transaction details in a file ");

                        try{
                            FileWriter fileopen=new FileWriter("trans_details.txt");

                            for(int j=0;j<= count;j++){

                                String row=trans_arr[j].to_print();
                                fileopen.write(row);
                                fileopen.close();

                            }

                            
                        }

                        catch(Exception e){

                            System.out.println(e.getMessage());
                        }


                        System.exit(0);
                        ob.close();
                        break;
  
                default:

                        System.out.println("Invalid choice");
                        break;

            }
        }


     
        }
    }
    

  

    

   

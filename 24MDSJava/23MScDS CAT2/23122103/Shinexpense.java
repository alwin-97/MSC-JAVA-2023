//Reg_no:23122103

import java.util.*;
import java.io.*;
//created a main class named Shinexpenses
public class Shinexpense{
     //main method
    public static void main(String[] args){
        int count=0;                            //initially set the value of count as zero
        Scanner scan = new Scanner(System.in);
       
        Transactions[] trans = new Transactions[40];        //calling the object in the constructor
        Expensemanager[] exp = new Expensemanager[40];
        
      
        // menu driven using while loop
        while(true){
        System.out.println("1. Add new transcation ");
        System.out.println("2. View transcation ");
        System.out.println("3. Total Statistics ");
        System.out.println("4. Exit ");
        System.out.println("Enter your choice:  ");
        int choice = Integer.parseInt(scan.nextLine());                 //user input here
        switch(choice){
            case 1: // Adding new transcation details
            System.out.println("...TRANSCATION DETAILS ALREADY DONE...");
            try{
                    File file = new File("Details.txt");
                    FileWriter filewriter = new FileWriter(file,true);  
                    Scanner read = new Scanner(file);                   //reading the already stored file
                    while(read.hasNextLine()){
                        String lines = read.nextLine();             //reading the file in line by line
                        System.out.println(lines);
                    }
                    read.close();
                    filewriter.close();
                }catch(Exception e){
                    System.out.println("An Error Occured");
                }
                System.out.println("1. Add new transcation ");
                int date =2024;
                System.out.println("transcationType(Card/Cash):  ");
                // if(transcationType.equals("Card") || transcationType.equals("Cash")){
                String transcationType=scan.nextLine();
                // }
                // else{
                //     System.out.println("please enter the valid type ");
                // }
                 System.out.println("Amount: ");
                int Amt = Integer.parseInt(scan.nextLine());
                System.out.println("description: ");
                String description=scan.nextLine();
                for(int i=0;i<count;i++){
                    trans[count]=new Transactions(date,transcationType,Amt,description);
                    count++;
                    // System.out.println(date+transcationType+Amt+description);
                        }
                    
                try{
                    File file = new File("Details.txt");                    //created a filenamed Details.txt
                    FileWriter filewriter = new FileWriter(file,true);      //true in the sense it append each user input without removing the previous one
                    filewriter.write("Date: "+date+" Transcation type: "+transcationType+" Amount: "+Amt+" Description: "+description+"\n"); //passing user input to the file
                    filewriter.close();
                }catch(Exception e){
                    System.out.println("An Error Occured");
                }
                break;
            case 2: //view transcations
                System.out.println("2. View transcation ");
                int total=0;
                for(int i=0;i<count;i++){
                    System.out.println(trans[i].Add());     //not working properly so move to file and read the values that entered by user
                        }
                try{
                    File file = new File("Details.txt");
                    FileWriter filewriter = new FileWriter(file,true);  
                    Scanner read = new Scanner(file);                   //reading the already stored file
                    while(read.hasNextLine()){
                        String lines = read.nextLine();             //reading the file in line by line
                        System.out.println(lines);
                    }
                    read.close();
                    filewriter.close();
                }catch(Exception e){
                    System.out.println("An Error Occured");
                }
                       
                break;
            case 3:// total statistics using two files
                System.out.println("3. total Statistics ");
                System.out.println("Expenses: ");

                try{// used to show the expenses in by the user
                    File file = new File("Details.txt");
                    FileWriter filewriter = new FileWriter(file,true);
                    Scanner read = new Scanner(file);
                    String[] details = new String[10];
                    int [] grand = new int[10];
                    while(read.hasNextLine()){
                        String lines = read.nextLine();
                        details=lines.split(" ");                       //splitting the user input in the file and store it to a new array named details
                        System.out.println((details[6]));
                        
                        
                    }
                    read.close();
                    filewriter.close();
                }catch(Exception e){
                    System.out.println("An Error Occured");
                }
                System.out.println("TotalAmount: ");
                int sum=0;
                try{            
                    File file = new File("Details.txt");                                        // this file is used to find the totalamounts 
                    FileWriter filewriter = new FileWriter(file,true);
                    Scanner read = new Scanner(file);
                    String[] details = new String[10];
                    int [] grand = new int[1];
                    while(read.hasNextLine()){
                        String lines = read.nextLine();
                        details=lines.split(" ");
                        // System.out.println((details[6]));
                        // int[] grans = Integer.parseInt(details[6]);
                        
                        for (int i =0;i<grand.length;i++){
                            grand[i]=Integer.parseInt(details[6]);
                            sum+=grand[i];
                        } 
                                         
                    }
                     System.out.println(sum); 
                    read.close();
                    filewriter.close();
                }catch(Exception e){
                    System.out.println("An Error Occured");
                }
                break;
            case 4:
                System.out.println("4. Exiting... ");
                System.exit(0);
                break;
            default:
                break;
        }
        }
    }
}
// created a class named Transactions contains attributes date,transcation type ,amount and description
class Transactions{                     
    int date;
    String transcationType;
    int Amt;
    String description;
    Transactions(){                         //constructor
        this.date=0;
        this.transcationType=" ";
        this.Amt=0;
        this.description=" ";

    }
    Transactions(int date,String transcationType,int Amt,String description){       //contructor overloaded with passing parameters
            this.date=date;
            this.transcationType=transcationType;
            this.Amt=Amt;
            this.description=description;
    }
    public String Add(){                //defined a function named Add to store items from the user
        return "date: "+this.date+" "+"Transcation type: "+this.transcationType+" "+"Amount: "+this.Amt+" "+"description: "+this.description;
    }

}
//created another class named Expensemanager that inherit the transcation class and stores the total income and expenses  
class Expensemanager extends Transactions{
    int Totalincome;
    int expense;
    Expensemanager(int date,String transcationType,int Amt, String description){
        super( date, transcationType, Amt,  description);
        this.Totalincome=Totalincome;
        this.expense=expense;
    }
    public int total(){ //function named total to return total income and expenses
        return this.Totalincome+this.expense;
    }
}
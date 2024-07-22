import java.io.*;
import java.util.*;
import java.time.LocalDate;

class  Transaction{
    LocalDate dte=LocalDate.now();
    String date=String.valueOf(dte);
    String type="";
    Float amt=0.0f;
    String description="";
    String det;

    // creation of constructors
    Transaction(){
        this.date="";
        this.type="";
        this.amt=0.0f;
        this.description="";
    }

    Transaction(String date,String type,Float amt,String description){
        this.date=date;
        this.type=type;
        this.amt=amt;
        this.description=description;
    }

    // function to add transaction details
    String addDet(String date,String type,Float amt,String description){
        det=date+"\t"+type+"\t"+amt+"\t"+description;
        return det;
    }

}

// inheritance of the class
class ExpenseManager extends Transaction{
    Float income=0.0f;
    Float expense=0.0f;
    String[] details=new String[6];
    String addDet(String date,String type,Float amt,String description){
        super.addDet(date,type,amt,description);
        // System.out.println("abc"+det);
        return det;
    }

    // function for calculating total expense and income
    String totStat(String x,String y,String z){
        if(x=="credited"){
            income=income+Float.parseFloat(y);
        }
        else{
            expense=expense+Float.parseFloat(y);
        }
        String tr=String.valueOf(expense)+","+String.valueOf(income);
        return tr;

    }

    // String printTot()
}


// main class
public class Shinexpense {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ExpenseManager expman=new ExpenseManager();
        char ch='n';
        String type="";
        String description;
        String det;
        String tr;
        Float amt=0.0f;
        String[] details=new String[6];
        File file=new File("transdet.txt");
        try {
            Scanner reader=new Scanner(file);
        // menu driven program
            do{
                System.out.println("1. Adding new transaction\n2. Viewing the transaction\n3. Viewing the total statistics");
                System.out.println("Enter the choice:");
                int choice=Integer.parseInt(scan.nextLine());
                switch(choice){
                    case 1:
                    // adding details 
                    LocalDate dte=LocalDate.now();
                    String date=String.valueOf(dte);
                    System.out.println("Enter the type of transaction(1. Credited/ 2. Debited):");
                    int tpe=Integer.parseInt(scan.nextLine());
                    if(tpe==1){
                        type="Credited";
                    }
                    else if(tpe==2){
                        type="Debited";
                    }
                    else{
                        System.out.println("Wrong type");
                    }
                    System.out.println("Enter the amount:");
                    amt=Float.parseFloat(scan.nextLine());
                    System.out.println("Enter the description:");
                    description=scan.nextLine();
                    det=expman.addDet(date,type,amt,description);
                    while(reader.hasNextLine()){
                        String str=reader.nextLine();
                        // System.out.println(str);
                        details=str.split("\t");


                    }
                    tr=expman.totStat(details[1],details[2],details[3]);
                    try{
                        FileWriter writer=new FileWriter("transdet.txt",true);
                        writer.write(det+"\n");
                        writer.close();
                        
                    }
                    catch(Exception e){
                        System.out.println("Error occured");
                    }
                    try{
                        
                        FileWriter tot=new FileWriter("totstat.txt");
                        tot.write(tr);
                        tot.close();
                        
                    }
                    catch(Exception e){
                        System.out.println("Error occured");
                    }
                    

                        break;
                    
                    case 2:
                    // viewing details
                        while(reader.hasNextLine()){
                            String str=reader.nextLine();
                            System.out.println(str);
                        }
                        break;
                    
                    case 3:
                        // expman.totStat(details[1],details[2],details[3]);

                    case 4:
                        System.exit(0);
                    
                }
        
            System.out.println("Do you want to continue(y,n)?");
            ch=scan.nextLine().charAt(0);
        }while(ch=='y'||ch=='Y');
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    try{
        File tottrans=new File("totstat.txt");
        Scanner reader1=new Scanner(tottrans);
        String[] st=new String[2];
        while(reader1.hasNextLine()){
            String str1=reader1.nextLine();
            st=str1.split(",");
            System.out.println("Total Expense:"+st[0]+"\nTotal Income:"+st[1]);
        }
    }
    catch(Exception e){
        System.out.println("Error");
    }
    }
    
}

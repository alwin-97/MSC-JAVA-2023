import java.io.File; //Libraries
import java.io.FileWriter;
import java.util.Scanner;
public class Transaction{
    public static void main(String[] args) {
        String Date="1stApril"; //inputting date
        String Transaction_type="Cash"; //inputing Transaction Type
        String Description="Food Expense"; //inputing Description
        int Amount=2000; //inputting amount

        String Date1="1stApril";//inputting date
        String Transaction_type1="Cash";//inputing Transaction Type
        String Description1="Books";//inputing Description
        int Amount1=500; //inputting amount
        
        String Date2="1stApril";//inputting date
        String Transaction_type2="Card";//inputing Transaction Type
        String Description2="Bills";//inputing Description
        int Amount2=5000;//inputting amount
        
        String Date3="1stApril"; //inputting date
        String Transaction_type3="Cash";//inputing Transaction Type
        String Description3="Advertisement";//inputing Description
        int Amount_3=3000;//inputting amount
        
        String Date4="1stApril";//inputting date
        String Transaction_type4="Cash";//inputing Transaction Type
        String Description4="Stationary";//inputing Description
        int Amount_4=1000;//inputting amount

        System.out.println("----------------------------------");
        System.out.println("1st Transation of " +Date+ " are: "+Transaction_type+" Descrption " +Description+" Amount "+Amount); //Writing all the transactions at one place
        System.out.println("2nd Transation of " +Date1+ " are: "+Transaction_type1+" Descrption "+Description1+" Amount "+Amount1);//Writing all the transactions at one place
        System.out.println("3rd Transation of " +Date2+ " are: "+Transaction_type2+" Descrption "+Description2+" Amount "+Amount2);//Writing all the transactions at one place
        System.out.println("4th Transation of " +Date3+ " are: "+Transaction_type3+" Descrption "+Description3+" Amount "+Amount_3);//Writing all the transactions at one place
        System.out.println("5th Transation of " +Date4+ " are: "+Transaction_type4+" Descrption "+Description4+" Amount "+Amount_4);//Writing all the transactions at one place

  
    }
}


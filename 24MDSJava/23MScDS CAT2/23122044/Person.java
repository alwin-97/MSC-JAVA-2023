import java.util.*;
import java.util.Scanner;
import alin.*;

public class person {
    static void person(){
      private String name;
        private int phno;
        private String email;
}
public static void person(String[] args){
    try(Scanner scan =new Scanner(System.in)){
        char ch ='N';
        alin[] pr = new alin[10];
        int counter =0;
        pr[counter] =new alin();
        counter++;

        do{ 
    System.out.println("_____________________________________");
    System.out.println("|       Person Contacts Details     |");
    System.out.println("|___________________________________|");
    System.out.println("|1| Add Details of the people       |");
    System.out.println("|2| View Details of the people      |");
    System.out.println("|3| Display Details of the people   |");
    System.out.println("|4| Exit                            |");
    System.out.println("|_|_________________________________|");
    System.out.println("enter the choice");
    int choice = Integer.parseInt(scan.nextline());
        switch(choice){

           case 1:{ 
                Addperson();
            break;
           }
           case 2:{
                Viewperson();
                break;
           }
           case 3:{
                Displayperson();
                break;
           }
           case 4:{
            Exit();
            break;
           }
           default: {
            System.out.println("Invalid Choice");
           }
        }
    }  
}  
} 
}  



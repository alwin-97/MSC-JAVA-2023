import alin;
import java.util.Scanner;


public class Main {
  public static void main(String[] args){
  
  Scanner scan = new Scanner(System.in);
  

  do{
    System.out.println("Please choose one among the following options:");
    System.out.println("1.Store contact details.");
    System.out.println("2.View contact details.");
    System.out.println("3.Edit contact details.");
    int choice = Integer.parseInt(scan.nextLine());
    
    switch(choice){
        case 1:
          storeDetails();

        case 2:
          viewDetails();

        case 3:
          editDetails();

        default:
        System.out.println("Invalid choice, please try again.");

    }
    System.out.println("Do you want to continue?(Yes/No)");
    String continues = new scan.nextLine();
    
  }while(continue.equalsIgnoreCase("yes"));
  }    
}

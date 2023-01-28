import java.util.Scanner;

public class switchEx {
    public static void main(String[] args) {
        /*
         * Java program to accept a number and print corresponding DAY
         * Eg: User enters 1, results Monday
         * Eg: User enters 3, results Wednesday
         */

         Scanner scan = new Scanner(System.in);
         // int userChoice = scan.nextInt(); // 1,2,....

         // if(userChoice == 1){
         //    System.out.println("Monday");
         // }else if(userChoice == 2){
         //    System.out.println("Tuesday");
         // }else if(userChoice == 3){
         //    System.out.println("Wednesday");
         // }else if(userChoice == 4){
         //    System.out.println("Thursday");
         // }else if(userChoice == 5){
         //    System.out.println("Friday");
         // }else if(userChoice == 6){
         //    System.out.println("Saturday");
         // }else if(userChoice == 7){
         //    System.out.println("Sunday");
         // }else{
         //    System.out.println("Invalid Choice");
         // }

         String userChoice = "KERALA";

         switch(userChoice){
            case "KERALA":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Choice");
         }

    }
}

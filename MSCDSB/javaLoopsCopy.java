import java.util.Scanner;

public class javaLoopsCopy {
    public static void main(String[] args) {

        System.out.println("Program Start");

        // for loop
        // for(initialization; condition; increment/decrement){
        // // body of loop
        // }

        // int j = 1;
        
        // j = j+1; // same as line 14
        // j += 1; // alternative way of line 13
        // for (int i = 0; i <= 5; i += 2) {
        //     System.out.println(i);
        // }

        // while loop
        // while(condition){
        //     // loop body
        // }
        // int a = 0;
        // while(a<= 5){
        //     System.out.print(a);
        //     a+=1;
        // }
        
        // do-while loop
        // do{
        //     // loop block
        // }while(condition);

        Scanner scan = new Scanner(System.in);
        char ch;
        do{
            System.out.println("Executing....");
            System.out.println("To continue y :");
            ch = scan.nextLine().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        System.out.println("Program End");

    }
}

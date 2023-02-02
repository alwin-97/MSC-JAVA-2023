import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {

        // for(initialization; condition; increment/decrement){
        // // loop block
        // }

        // for(int i=0;i<5;i++){ //outer for loop
        // for(int j=0;j<i;j++){ // inner for loop
        // System.out.print("0 ");
        // }
        // System.out.println();
        // }

        // while loop
        // while(condition){
        // // loop body
        // }

        // int a = 5;
        // while(a >= 0){
        // System.out.println(a);
        // a -= 1;
        // }

        // do while loop
        // do{
        // loop body
        // }while(condition)

        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Executing....");
            System.out.println("Press 'y' to continue !");
            ch = scan.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }

}

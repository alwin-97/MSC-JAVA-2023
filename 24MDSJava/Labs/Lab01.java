import java.util.Scanner;

public class Lab01{

    static String memory = "";

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         

        int i =0;
        while(i<=5){
            int val = Integer.parseInt(scan.nextLine());
            memory = memory + ","+ val;
            i++;
        }

        System.out.println(memory);

    }
}
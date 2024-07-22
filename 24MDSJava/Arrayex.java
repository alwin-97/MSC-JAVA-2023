import java.util.Scanner;

public class Arrayex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Limit: ");
        int limit = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[limit];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the number: "+(i+1)+" : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum=0;
        for(int i:arr){
            sum+=i;
        }

        System.out.println("Sum: "+sum);

        // int[] arr = new int[4];
        // arr[0] = 10; 
        // arr[3] = 20;

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // for(int i : arr){
        //     System.out.println(i);
        // }


    }
}

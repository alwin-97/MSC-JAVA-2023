import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        // take the length of array from user
        // given an option to user to quit after entering each
        // value as input to the array
        // Ex: User enters 100000
        // User have entered few inputs, now he choose to quit
        // print till the value user have entered
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array length : ");
        int userArrayLen = Integer.parseInt(scan.nextLine());

        int arr[] = new int[userArrayLen];
        int choice, counter=0;

        for(int i=0;i<userArrayLen;i++){
            System.out.print("Enter value for "+i+"th index : ");
            arr[i] = Integer.parseInt(scan.nextLine());
            counter += 1;
            System.out.print("0 to quit, any other number to continue : ");
            choice = Integer.parseInt(scan.nextLine());
            if(choice == 0){
                break;
            }
        }

        for(int i =0; i<counter;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

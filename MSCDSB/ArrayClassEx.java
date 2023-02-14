import java.util.*;

public class ArrayClassEx {
    public static void main(String[] args) {
        // ask the user to enter 'n', where n is the length of array
        // collect inputs
        // display
        // NOTE: The program should ask after entering 1 value; if any new
        // value have to be entered....!
        // suppose i enter n as 10000, but i want to enter only 5 values
        // print only the values that i have entered....!!
        // how will you approach ?

        // scanner class to take user inputs
        Scanner scan = new Scanner(System.in);

        // taking the max length of array from user
        System.out.print("Enter the maximum number of elements needs to be kept in array :");
        int arrayLenMax = Integer.parseInt(scan.nextLine());

        // decalring array with the lenth of users choice
        int[] numArray = new int[arrayLenMax];

        // do-while loop control variable
        int continueLoop = 0;
        int i = -1;

        // iterating on the array length to collect inputs and save to array
        // for (int i = 0; i < arrayLenMax; i++) {
        do {
            i+=1;
            if(i == arrayLenMax){
                break;
            }
            System.out.print("Enter value for " + i + "th element : ");
            numArray[i] = Integer.parseInt(scan.nextLine()); // saving to array
            System.out.print("Do you want to continue (0 to continue, any other number to exit) : ");
            continueLoop = Integer.parseInt(scan.nextLine());
        } while (continueLoop == 0);

        // }

        // displaying array to user
        System.out.println("Elements in array with size " + arrayLenMax);
        // System.out.println(Arrays.toString(numArray));
        for(int j=0;j<=i;j++){
            System.out.print(numArray[j]+" ");
        }
    }
}

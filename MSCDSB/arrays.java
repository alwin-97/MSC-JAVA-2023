import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // 1D Array
        // <datatype>[] arrayName = {1,2,3,4};
        int[] intArr = {10,20,30,40,50};

        //accessing an element with its index position
        System.out.println(intArr[3]);

        // iterating over the array and displaying all values
        for(int i=0;i<intArr.length;i++){
            System.out.print(intArr[i]+ " ");
        }
        System.out.println();

        // another way of iteration
        for(int i : intArr){
            System.out.print(i+ " ");
        }
        System.out.println();
        // decalring array
        int[] intArr2 = new int[5]; // we are creating an integer array 
        // that can store upto 5 interger values
        intArr2[2] = 100;
        intArr2[4] = 1;
        for(int i : intArr2){
            System.out.print(i + " ");
        }
        //intArr2[7] = 1; // will give error and program exits

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<intArr2.length;i++){
            System.out.println("Enter value for : "+i+"th Element in Array:");
            intArr2[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i : intArr2){
            System.out.print(i + " ");
        }

        // ask the user to enter 'n', where n is the length of array
        // collect inputs
        // display
        // NOTE: The program should ask after entering 1 value; if any new 
        // value have to be entered....!
        // suppose i enter n as 10000, but i want to enter only 5 values
        // print only the values that i have entered....!!
        // how will you approach ?


    }
}

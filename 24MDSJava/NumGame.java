import java.util.Scanner;

public class NumGame {

    static int[] collectNumbers(){
        int numArr[] = new int[100];
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (00 for exiting):");
        for(int i=0;i<100;i++){
            String input = scanner.nextLine();
            if(input.equals("00")){
                break;
            }else{
                int temp = Integer.parseInt(input);
                numArr[counter] = temp;
                counter += 1;
            }
        }
        int[] tempArr = new int[counter];
        for (int i = 0;i<counter;i++){
            tempArr[i] = numArr[i];
        }
        scanner.close();
        return tempArr;
    }

    static int returnLength(int[] arr){
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = collectNumbers();

        for(int i : arr){
            System.out.print(i+" ");
        }

        int length_of_arr = returnLength(arr);
        System.out.println("Length of Array: "+length_of_arr);
    }
}

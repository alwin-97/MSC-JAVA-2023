import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // <data_type> array_name[] = {value1,value2...};
        // <data_type> array_name[] = new data_type[size];
        int arr[] = {10,20,30,40,50};

        System.out.println(arr[3]);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        
        for(int i: arr){
            System.out.print(i+" ");
        }

        System.out.println();

        // <data_type> array_name[] = new data_type[size];
        String arr1[] = new String[5];

        System.out.println(arr1[3]);// will result null
        arr1[3] = "JAVA";
        System.out.println(arr1[3]);

        for(int i =0; i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(String i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        // create an string array of size 20;
        // use the help of for loop and initilize the 
        // values for each index
        // print the array

        String newArr[] = new String[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<newArr.length;i++){
            System.out.println("Enter value for : "+(i+1)+"th String");
            newArr[i] = scan.nextLine();
        }
        for(String i : newArr){
            System.out.print(i+" ");
        }
    }

    // take the length of array from user
    // given an option to user to quit after entering each
    // value as input to the array
    // Ex: User enters 100000
    // User have entered few inputs, now he choose to quit
    // print till the value user have entered

}

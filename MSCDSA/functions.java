import java.util.Scanner;

public class functions {

    static Scanner scan = new Scanner(System.in);
    static int abc = 10;
    static String hello = "Hello..!";

    // functions
    // static <return type> <function name>(){
        // function code
    // }

    // no return & no parameter
    static void myFirstFunction(){
        System.out.println("My first Function");
    }

    // static int[] myFunc(int[] a){
    //     int arr[] = new int[3];
    //     arr[0] = a[0] + a[1];
    //     arr[1] = a[0] - a[1];
    //     arr[2] = a[0] * a[1];
    //     return arr;
    // }

    // no return & paramters
    public static void main(String[] args) {
        myFirstFunction();
        
        int a = myintfunc();
        System.out.println(a);

        int sum = add(5,6);
        System.out.println(sum);

        // int ar[] = {2,5};
        // int[] arr = myFunc(ar);
        // for(int i : arr){
        //     System.out.print(i+"\t");
        // }
    }

    // returing value with no paramter
    static int myintfunc(){
        return add(2,3);
    }

    // returing value with parameter
    static int add(int a, int b){
        return a+b;
    }
}

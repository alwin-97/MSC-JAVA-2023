import java.util.Scanner;

public class tryCatchEx {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int arr[] = new int[3];
        System.out.println("Program Start");
        try{
            // codes that can give you error
            // System.out.println(arr[100]);
            // System.out.println(a/b);
            System.out.println("Program inside try block");
            System.out.println("Enter age");
            Scanner scan  = new Scanner(System.in);
            int age = Integer.parseInt(scan.nextLine());
            if(age < 10 ){
                throw new ArithmeticException("Invalid execution");
            }else if(age < 20){
                throw new Exception("Invalid Age");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }finally{
            System.out.println("Program in finally block");
        }
        
        System.out.println("Program End");
    }
}

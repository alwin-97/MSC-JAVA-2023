import java.util.Scanner;

public class MScAFunctionEx {
    
    // user defined functions
    static float calculate(int n1, int n2, char op){
    
        float res;

        switch (op) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
                res = 0;
                break;
        }

        return res;
    }

    static float calculate_np_wr(){
        int a,b;
        char op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number 1");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Number 2");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("Enter operator:");
        op = scan.nextLine().charAt(0);

        float res;

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                res = 0;
                break;
        }

        return res;
    }

    static void calculate_wp_nr(int n1, int n2, char op){
    
        float res;

        switch (op) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
                res = 0;
                break;
        }

        System.out.println("Result: " +res);
    }

    static void calculate_np_nr(){
        int a,b;
        char op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number 1");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Number 2");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("Enter operator:");
        op = scan.nextLine().charAt(0);

        float res;

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                res = 0;
                break;
        }

        System.out.println("Result: " +res);
    }

    // main method
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char option = 'y';

        do{
            System.out.println("1. Function with Parameter and Return Value");
            System.out.println("2. Function without Parameter and Return Value");
            System.out.println("3. Function with Parameter and no Return Value");
            System.out.println("4. Function with no Parameter and no Return Value");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());
            float res;
            int a,b;
            char op;

            switch (choice) {
                case 1:
                    System.out.println("Enter Number 1");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter Number 2");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter operator:");
                    op = scan.nextLine().charAt(0);
                    res = calculate(a,b,op);
                    System.out.println("Result: "+res);
                    break;
                case 2:
                    res = calculate_np_wr();
                    System.out.println("Result: "+res);
                    break;
                case 3:
                    System.out.println("Enter Number 1");
                    a = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter Number 2");
                    b = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter operator:");
                    op = scan.nextLine().charAt(0);
                    calculate_wp_nr(a,b,op);
                    break;
                case 4:
                    calculate_np_nr();
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to continue (y/n)?");
            option = scan.nextLine().charAt(0);
            
        }while(option == 'y');
    }

}
import java.util.Scanner;

public class MScBFunctionEx {

    static Scanner scan = new Scanner(System.in);
    
    static float compute_wp_wr(int n1, int n2, char op){
        float res;
        switch (op) {
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }

    static void compute_wp_nr(int n1, int n2, char op){
        float res;
        switch (op) {
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        System.out.println("Result: "+res);
    }

    static float compute_np_wr(){
        System.out.println("Enter number 1:");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter number 2:");
        int n2 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter operator:");
        char op = scan.nextLine().charAt(0);

        float res;
        switch (op) {
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }

    static void compute_np_nr(){
        System.out.println("Enter number 1:");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter number 2:");
        int n2 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter operator:");
        char op = scan.nextLine().charAt(0);

        float res;
        switch (op) {
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        System.out.println("Result: "+res);
    }

    public static void main(String[] args) {
        char option='y';
        do{
            int n1, n2;
            char op;
            float res;

            System.out.println("1. compute_wp_wr");
            System.out.println("2. compute_wp_nr");
            System.out.println("3. compute_np_wr");
            System.out.println("4. compute_np_nr");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter number 1:");
                    n1 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter number 2:");
                    n2 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter operator:");
                    op = scan.nextLine().charAt(0);

                    res = compute_wp_wr(n1, n2, op);
                    System.out.println("Result: "+ res);

                    break;
                case 2:
                    System.out.println("Enter number 1:");
                    n1 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter number 2:");
                    n2 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter operator:");
                    op = scan.nextLine().charAt(0);

                    compute_wp_nr(n1, n2, op);
                    break;
                case 3:
                    res = compute_np_wr();
                    System.out.println("Result: "+ res);
                    break;
                case 4:
                    compute_np_nr();
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to continue (y/n)?");
            option = scan.nextLine().charAt(0);
        }while(option == 'y');
    }

}

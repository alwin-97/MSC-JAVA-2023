import java.util.Scanner;

public class FunctionsExcopy {

    static int operate(int n1, int n2, char op){

        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '/':
                return n1 / n2;
            case '*':
                return n1 * n2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        int n1, n2;
        char op;

        System.out.println("Welcome to MSc Calcy");
        System.out.println("Enter Number 1");
        n1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Number 2");
        n2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Operator");
        op = scan.nextLine().charAt(0);

        int res = operate(n1,n2,op);
        System.out.println("Res: "+res);
    }
}

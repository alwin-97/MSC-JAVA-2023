import java.util.Scanner;

public class FunctionsEx {
    
    // user defined functions
    // accessmodifier returntype functionname (args)
    //{ 
        // function body 
        // return if any
    // }

    static Scanner scan = new Scanner(System.in);
    static int n1, n2;
    static char op;

    static int operate(){

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
        
        System.out.println("Welcome to MSc Calcy");
        System.out.println("Enter Number 1");
        n1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Number 2");
        n2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Operator");
        op = scan.nextLine().charAt(0);

        int res = operate();
        System.out.println("Res: "+res);
    }
}

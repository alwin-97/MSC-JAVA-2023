import java.util.Scanner;

class loops {

    public void printHello() {
        System.out.println("--->HELLO");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        int condition = 0;

        do {
            System.out.println("1. to print HI\n2. to print Hello\nEnter choice:");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    loops l1 = new loops();
                    l1.printHello();
                    break;
                case 2:
                    System.out.println("--->HELLO");
                    break;
                default:
                    System.out.println("Wrong Input..!");
            }

            System.out.println("Do you want to continue ? [0|1]");
            condition = scan.nextInt();
        } while (condition == 1);
    }
}

// if(choice == 1){
// System.out.println("--> HI");
// }else if(choice == 2){
// System.out.println("--> HELLO");
// }else{
// System.out.println("Wrong Input..!");
// }
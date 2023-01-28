import java.util.Scanner;

class hello { // class className
    public static void main(String[] args) { //main method
       // System.out.println("Hello ... !"); // printing something to user
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter integer val");
       int intVal = scan.nextInt();
       System.out.println("User input : "+ intVal);
    }
}
import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {
        /*
         * Java Program to read Name, Age, Class and disply them to the user
         */
        String Name;
        int Age;
        String Class;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name, Age, Class :");
        Name = scan.nextLine();
        Age = Integer.parseInt(scan.nextLine());
        Class = scan.nextLine();
        System.out.println("Name: "+Name+"\nAge: "+ Age+"\nClass: "+ Class);
    }
}

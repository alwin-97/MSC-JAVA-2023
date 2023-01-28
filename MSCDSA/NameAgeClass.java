import java.util.Scanner;

public class NameAgeClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name, Age, Class");
        String Name = scan.nextLine();
        int Age = Integer.parseInt(scan.nextLine());
        String Class = scan.nextLine();
        System.out.println("User Details : {Name:"+ Name+", Age: "+ Age+", Class: "+ Class+"}");
    }
}

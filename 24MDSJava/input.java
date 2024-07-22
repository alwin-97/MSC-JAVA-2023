import java.util.Scanner;

class input{
    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println(name);
        scan.close();

    }
}
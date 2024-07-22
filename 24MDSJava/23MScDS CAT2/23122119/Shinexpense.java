import java.time.LocalDate;
import java.io.File;    //importing required librarie
import java.io.FileWriter;
import java.util.Scanner;

class transaction {//parent class or base class
    public LocalDate date;
    protected String type;  //declaring variables
    protected int amt;
    public String descr;

    transaction() { //definig the constructors
        this.type = "";
        this.amt = 0;
        this.descr = "";
    }

    transaction(String type, int amt, String descr) { //dconstructors
        this.type = type;
        this.amt = amt;
        this.descr = descr;
    }
}

class exp_manager extends transaction {//c hild class extending parent class
    public int totalinc;
    public int totalexp;

    exp_manager(String type, int amt, String descr) {// constructors
        super(type, amt, descr);
        LocalDate crdate = LocalDate.now();
        try {
            FileWriter write = new FileWriter("transaction.txt", true);
            write.write(crdate + " " + type + " " + amt + " " + " " + descr + "\n");
            write.close();
        } catch (Exception e) {
        }
    }

}

public class Shinexpense {
    public static void main(String[] args) { //main class
        Scanner scan = new Scanner(System.in); //to get the input from the user
        exp_manager[] exp = new exp_manager[10]; //using object
        int count = 0; //counter variable
        String c;

        do {
            System.out.println("1. Add a new transaction");
            System.out.println("2. view the transaction"); //menu driven 
            System.out.println("3. view the total stats");
            System.out.print("Enter your choice - ");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) { //coditions
                case 1:
                    System.out.print("Enter the tpe of transaction - ");
                    String type = scan.nextLine();
                    System.out.print("Enter the amount - ");
                    int amt = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter the description - ");
                    String descr = scan.nextLine();
                    exp[count] = new exp_manager(type, amt, descr); //appending
                    count++;
                    break;
                case 2:
                    try {
                        File file = new File("transaction.txt"); //reading the file
                        Scanner read = new Scanner(file);
                        while (read.hasNextLine()) { //checking if there is string
                            String line = read.nextLine();
                            System.out.println(line); // printing 
                        }
                    } catch (Exception e) { // to give the error
                    }
                    break;

                case 3:
                    int totalexp = 0;
                    int sum = 0;
                    int totalincome = 0;
                    try {
                        File file1 = new File("transaction.txt");
                        Scanner read1 = new Scanner(file1);      //reading the file
                        while (read1.hasNextLine()) {
                            String line = read1.nextLine();
                            String[] arr = line.split(" ");
                            if (arr[1].equalsIgnoreCase("income")) {
                                sum = Integer.parseInt(arr[2]); //if condiotions
                                totalincome += sum;
                                System.out.println("The total income =" + totalincome);
                            } 
                            else if (arr[1].equalsIgnoreCase("expense")) {
                                sum = Integer.parseInt(arr[2]);
                                totalexp += sum;
                                System.out.println("The total expense =" + totalexp);
                            }  
                        }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    count++;
                    break;
                default:
                    break;
            }
            System.out.print("Do u want to continue - "); //continuation
            c = scan.nextLine();
        } while (c.equalsIgnoreCase("Yes"));
    }
}

import alin.Person;
import java.util.Scanner;

class AlinContact {

    // STATIC FUNCTION WHICH PRINTS THE WELCOME MESSAGE
    public static void welcome() {
        System.out.println("Welcome Alin!");
    }
    public static void main(String[] args) {

        // CALLING AN INSTANCE OF THE CLASS INSIDE THE PACKAGE
        // int personCounter = 0;
        Person person1 = new Person();
        Person[][] person = new Person[10][3];
        Scanner scanner = new Scanner(System.in);
        char ch = 'N';
        String filename = "details.txt";
        person1.createTxtFile();

        // MENU-DRIVEN PROGRAM
        do {
            int choice = 0;
            welcome();
            System.out.println("Please make a choice: ");
            System.out.println("1. Add a new contact: ");
            System.out.println("2. Searching for an existing contact: ");
            System.out.println("3. List all the contacts: ");
            System.out.println("4. EXIT");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    person1.addContact();
                    // personCounter++;
                    break;
                case 2: 
                    person1.searchContact(filename);
                    break;
                case 3:
                    // for(String[] per: person) {
                    //     System.out.println(per[0]);
                    // }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Thank You!");
                    break;
            }
                System.out.println("Do you want to continue (Y/N)?: ");
                ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        System.out.println("Thank You!");
        scanner.close();
    }
}

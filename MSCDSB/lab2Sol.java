import java.util.*;

public class lab2Sol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String arr[] = new String[1024];
        int arrLen = 0;
        int loopControl = 0;

        do {
            // printing the menu options
            System.out
                    .println("Menu Options\n1.Enter Name\n2. List All\n3. Remove Name\n4. Search Name\nYour choice: ");
            int userChoice = Integer.parseInt(scan.nextLine());

            switch (userChoice) {
                case 1:
                    System.out.print("Enter the new Name: ");
                    String tempName = scan.nextLine();
                    boolean addName = false;
                    if (arrLen == 0) {
                        addName = true;
                    } else {
                        for (int i = 0; i < arrLen; i++) {
                            if (arr[i].equalsIgnoreCase(tempName)) {
                                addName = false;
                            } else {
                                addName = true;
                            }
                        }
                    }
                    if (addName == true) {
                        arr[arrLen] = tempName;
                        arrLen = arrLen + 1;
                        System.out.println("Name added..");
                    } else {
                        System.out.println("Name Exists..");
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrLen; i++) {
                        System.out.print(arr[i] + ", ");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("Enter the Name to be Searched: ");
                    String searchName = scan.nextLine();
                    for (int i = 0; i < arrLen; i++) {
                        if (arr[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Name found..");
                        } 
                    }

                    break;
                default:
                    System.out.println("Wrong Choice..!");
            }

            // uses to continue or not
            System.out.println("Press 1 to continue..!");
            loopControl = Integer.parseInt(scan.nextLine());
        } while (loopControl == 1);

        System.out.println("Program Exits..");
    }
}

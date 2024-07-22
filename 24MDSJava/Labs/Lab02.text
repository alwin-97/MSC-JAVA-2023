/*
 * ***************************************************************************
 * Name: 
 * Register Number: 
 * Class:
 * Date :
 * ***************************************************************************
 *                     Resturant Billing Application
 * You are going to create a JAVA program that runs in comand line for a Cafe.
 * That is aimed to track the billing of vairous items that has been sold for a
 * particular day.
 * 
 */

import java.util.Scanner;

class Resturant {
    /*
     * Define the data member to store the menu items and its price (Eg.
     * Idli-Sambar - 30, Tea - 10)
     * Use a String array to store the menu item and its price.
     * String[][] menu = {{"Idli-Sambar","30"},{"Tea","10"}}
     */

    /*
     * Define variable to store the items ordered for each order
     * int[][] orders= {{2,3},{1,2}}
     * Hint: here 1,2,3 represents the index of items in the menu array
     * Keep another counter variable to itentify the count of orders as well!
     */
    int[][] orders = new int[100][10];
    int orderCounter = 0;

    void printMenu() {
        /*
         * Code to print the resturant menu in appropriate format
         */
    }

    float computeAmount(int[] itemsSelected) {
        float amount = 0.0f;
        /*
         * itemsSlected is an array of indexes of menu array that stores the item name
         * and price you need to take out the price form the menu array, convert it to
         * integer / float and calcuate the total price for the order
         */

        return amount;
    }

    void generateBill(Scanner scanner) {
        /*
         * Call the printMenu function and print the menu options to the user.
         * The user will enter one or more choices that he wishes to order, you will
         * collect and store it in an integer array. this array will be passed to
         * computeAmount function to get the final bill for the order.
         * Once the amount is recived, you will print the amount and the order gets
         * processed !
         * before exiting the function, you need to store the items ordered into the
         * 'orders' array that tracks all the orders in your resturant.
         */

        int[] itemsOrderd = new int[10]; // assuming that maximum 10 items for each bill
        char ch = 'y';
        int counter = 0;

        do {
            printMenu();
            int choice = 0;
            System.out.println("Enter the item number you wish to order");
            choice = Integer.parseInt(scanner.nextLine());
            // check if the number entered is possible to order and then add to the array!
            // itemsOrderd[counter] = choice;

            if (counter < 10) {
                System.out.println("Do you want to add another item to the order (Press y/Y for yes)");
                ch = scanner.nextLine().charAt(0);
            } else {
                ch = 'n';
            }
        } while (ch == 'Y' || ch == 'y');

        int[] temp = new int[counter];
        for(int i=0;i<counter;i++){
            temp[i] = itemsOrderd[i];
        }

        float billAmount = computeAmount(temp);
        System.out.println("Total Bill Amount: " + billAmount);

        // add the itemsOrderd array to the 'orders' array
        orders[orderCounter] = temp;
    }

    void printTotalSales() {
        /*
         * This function prints the orders and its total cost and print the
         * total sales for the resturant.
         * This function will be called for printing the total sales of the resturant
         * for the day!
         */
    }
}

public class Lab02 {

    static void welcomeCafe() {
        /*
         * Complete the static function that creates a welcome message for your
         * application
         * Stating the Resturant Name, FSSAI Id, Date of Bill and usage instructions
         */
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = 'N';

        welcomeCafe();
        /*
         * Create the object for resturant class and define a menu driven progam that
         * uses the functions
         * defined in the resturant class with the help of the object you have created
         * and make the billing system
         * for your cafe!
         * Hint: Menu Driven program calls the functions with the help of objects.
         */

         Resturant myResturant = new Resturant(); // Object of Resturant Class

        do {
            int choice = 0;
            System.out.println(" ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("My Menu");
                    myResturant.printMenu(); // calling function from the class using objects
                    break;
                case 2:
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        myResturant.printTotalSales(); // print all the sales and sales summary

        System.out.println("Tankyou for using __________ Application");
        scanner.close();
    }
}

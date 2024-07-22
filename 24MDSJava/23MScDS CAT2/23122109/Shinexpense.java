import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

import transaction_pack.*;

class Shinexpense{

    static void TransWrite(String filename, String content){
        try{
            FileWriter trWriter = new FileWriter("transactionFile.txt",true);
            trWriter.write(content+"\n");
            trWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        }
        static void TransRead(Scanner scan){
            try{
                File reader = new File("transactionFile.txt");
                Scanner myReader = new Scanner(reader);
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);

                }
                myReader.close();
            }
            catch(Exception e){
                System.out.println("An error occured");
                e.printStackTrace();
            }
        }

    public static void main(String[] args){
        Transaction tran1 = new Transaction();
        Expensemanager exp1 = new Expensemanager();
        String option;
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int count =0;
        int average=0;

        do{
            System.out.println("1. Add a new transaction");
            System.out.println("2. view transaction");
            System.out.println("3. View Statistics");
            System.out.println("4: exit");
            
            int choice = Integer.parseInt(scan.nextLine());

            switch(choice){
                case 1:
                    String details = tran1.addTransaction();
                    String[] parts = details.split(";");
                    System.out.println("Enter the date of transaction");
                    parts[0] = scan.nextLine();
                    System.out.println("Enter the type of transaction (saving/current)");
                    parts[1]= scan.nextLine();
                    System.out.println("Enter the amount you want to add");
                    parts[2]=scan.nextLine();
                    int amnt = Integer.parseInt(parts[2]);
                    //System.out.println("Enter the description of your transaction");
                    //parts[3]= scan.nextLine();
                    System.out.println(parts[0]);
                    System.out.println(parts[1]);
                    System.out.println(amnt);
                    String content = parts[0]+";"+parts[1]+";"+parts[2]; //
                    TransWrite("transactionFile.txt",content); //adding content to file
                break;

                case 2:
                    System.out.println("your transaction history is: ");
                    System.out.println("============================");
                    TransRead(scan);
                break;

                case 3:
                try{
                    File reader = new File("transactionFile.txt");
                    Scanner myReader = new Scanner(reader);
                    while(myReader.hasNextLine()){
                        count++;
                        String data = myReader.nextLine();
                        String[] splitted = data.split(";");
                        int amnts = Integer.parseInt(splitted[2]);
                        sum = sum+amnts;
                        average = sum/count;
                        
                    }
                    myReader.close();
                    }
                    catch(Exception e){
                        System.out.println("An error occured");
                        e.printStackTrace();
                    }
                    System.out.println("Here is your statistics");
                    System.out.println("========================"+"\n");
                    System.out.println("Total number of transaction: "+count);
                    System.out.println("Total amount is: "+sum);
                    System.out.println("Average amount per transaction is: "+average);
                break;

                default:
                break;
            }
            System.out.println("Do you want to continue?(y/n)");
            option = scan.nextLine();
        }
        while (option.equals("y"));
    }
    }

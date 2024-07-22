package alin;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class alincontact {
        public static void main(String[] args){
            try{
                Scanner scan = new Scanner(System.in);
                FileWriter myFileobj = new FileWriter("contacts.txt");
                System.out.print("Enter name:,phone:,email:");
                String detail = scan.nextLine();
                myFileobj.write(detail+"\n");
                myFileobj.close();

                File readFile = new File("contact.txt");
                Scanner readFile1 = new Scanner(readFile);
                while(readFile1.hasNextLine()){
                    System.out.println(readFile1.nextLine());
                
                
                }
                 catch (IOException e){
                    System.out.println("error");
                    e.printStackTrace();
                }


            
            }
     }
    }
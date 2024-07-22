import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import alin.person;

// main class
public class Alincontact{
    static String[] person_input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = scan.nextLine();
        System.out.println("Enter the Phone Number");
        String Phone = scan.nextLine();
        System.out.println("Enter the Email");
        String Email = scan.nextLine();
    }

    static void add_file(String filename,String row){
        try{
            FileWriter file = new FileWriter(filename,true);
            file.append(row+"\n");
            file.close();
        }
        catch(IOException e){
            System.out.println("can't write into the file");
            e.printStackTrace();
        }
    }

}




import java.io.*;
import java.util.Scanner;

public class fileEx {
    public static void main(String[] args) {
        try{

            File fobj = new File("fileEx.txt");
            // fobj.createNewFile();
            System.out.println(fobj.exists());

            FileWriter fwrite = new FileWriter(fobj,true);
            fwrite.write("Hello World..!");
            fwrite.close();
            
            Scanner fread = new Scanner(fobj);
            while(fread.hasNextLine()){
                System.out.println(fread.nextLine());
            }
            fread.close();

        }catch(Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }
    }
}

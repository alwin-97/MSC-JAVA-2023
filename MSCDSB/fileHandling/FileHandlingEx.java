import java.io.File;
import java.util.Scanner;

public class FileHandlingEx {
    public static void main(String[] args) {
       
        try{
            File file = new File("abc.txt");
            
            if(file.exists()){
                System.out.println("File exists..");
            }else{
                System.out.println("File is missing..");
                if(file.createNewFile()){
                    System.out.println("File Created");
                }else{
                    System.out.println("File creation error");
                }
            }

            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

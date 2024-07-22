import java.io.*;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        try{

            File file = new File("myfile.txt");
            FileWriter fw = new FileWriter(file);
            for(int i=0;i<5;i++){
                fw.write(i+"This is my first line\n");
            }
            fw.close();

            File file2 = new File("myfile.txt");
            Scanner scanner = new Scanner(file2);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        }catch(Exception e){

        }
    }
}

import java.io.*;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("test.txt", true);
            fileWriter.write("This is my first line..\n");
            fileWriter.close();

            File file = new File("test.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (Exception exception) {
        }

    }
}

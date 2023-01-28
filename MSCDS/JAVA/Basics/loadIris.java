import java.io.*;
import java.util.*;

public class loadIris {
    public static void main(String[] args) {
        File iris = new File("Iris.csv");
        Scanner scan;
        try {
            scan = new Scanner(iris);
            while(scan.hasNextLine()){
                for( String s : scan.nextLine().split(",")){
                    System.out.print(s + "\t");
                }
                System.out.println();
            }
            
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

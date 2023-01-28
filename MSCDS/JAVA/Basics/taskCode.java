import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Student {
    String Name, Class, RegNo, Email;

    Student() {
    }

    Student(String args[]) {
        this.Name = args[0];
        this.Class = args[1];
        this.RegNo = args[2];
        this.Email = args[3];
    }

    void DisplayStudent() {
        System.out.println("\t" + this.Name + "\t" + this.Class + "\t" + this.RegNo + "\t" + this.Email);
    }
}

class taskCode {
    public static void main(String[] args) throws FileNotFoundException {
        File taskFile = new File("task.txt");
        Scanner scanFile = new Scanner(taskFile);

        while (scanFile.hasNextLine()) {
            String data = scanFile.next();
            if (scanFile.nextLine().trim() != "") {
                System.out.println(data);
                String tempData[] = data.trim().split(",");
                String args[] = {tempData[0].split(" ")[1],tempData[0].split(" ")[1],}
            }
        }
    }
}
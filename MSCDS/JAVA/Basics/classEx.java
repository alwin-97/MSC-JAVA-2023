import java.util.Scanner;

class Students {
    String name;
    String rollnumber;
    String email;

    Students() {
        System.out.println("Constructor Invoked..!");
        this.name = "";
        this.rollnumber = "";
        this.email = "";
    }

    Students(String a, String b, String c) {
        System.out.println("Parameterized constructor Invoked..!");
        this.name = a;
        this.rollnumber = b;
        this.email = c;
    }

    String StudentString() {
        return name + " " + rollnumber + " " + email;
    }

    void StudentString(String a, String b, String c) {
        System.out.println(a + " " + b + " " + c);
    }
}

public class classEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Students student = new Students(); // call the defacult constructor
        // Students student1 = new Students("alwin", "1847207", "alwin.joseph@christuniverisity.in"); // calls the
        //                                                                                            // parameterized
        //                                                                                            // constructor
        // System.out.println(student1.StudentString());
        // student1.StudentString(student1.name, student1.rollnumber, student1.email);

        Students studentArray[] = new Students[10];
        int counter = 0;

        System.out.println("Enter the limit..");
        counter = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the student values..");
        for (int i = 0; i < counter; i++) {
            System.out.println("Enter Name, Roll Number, Email");
            String name = scan.nextLine();
            String email = scan.nextLine();
            String rollnumber = scan.nextLine();
            studentArray[i] = new Students(name,rollnumber,email);
        }

        System.out.println("Details of all students are...");
        for (int i = 0; i < counter; i++) {
            studentArray[i].StudentString(studentArray[i].name, studentArray[i].email, studentArray[i].rollnumber);
        }

        // System.out.println("Enter Name, Roll Number, Email");
        // student.name = scan.nextLine();
        // student.rollnumber = scan.nextLine();
        // student.email = scan.nextLine();

        // System.out.println(student.StudentString());
    }
}

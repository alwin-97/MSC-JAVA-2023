import java.util.Scanner;

class Student{
    String firstName;
    String secondName;
    String rollNumber;

    Scanner scan = new Scanner(System.in);

    void collectDetails(){
       System.out.println("Enter First Name");
       firstName = scan.nextLine();
       System.out.println("Enter Last Name");
       secondName = scan.nextLine();
       System.out.println("Enter Roll Number");
       rollNumber = scan.nextLine();
    }

    void dispalyDetails(){
        System.out.println(firstName + " "+ secondName +"\n"+rollNumber);
    }

    String toCombineName(){
        return firstName + " " + secondName;
    }
}

class classBasics {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.collectDetails();
        System.out.println(obj.firstName);
    }
}

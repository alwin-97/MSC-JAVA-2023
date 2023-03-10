class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor....");
        name = "ABC";
        rollno = 0;
        System.out.println("Ends..Constructor....");
    }

    Student(String a){
        name=a;
    }

    Student(int a){
        rollno = a;
    }

    Student(String name,int rollno){
        this.name=name;
        this.rollno = rollno;
    }

    void printStudent(){
        System.out.println(name + "\t"+Integer.toString(rollno));
    }
}

public class classEx {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.printStudent();
        Student obj1 = new Student(10);
        obj.printStudent();
        Student obj2 = new Student("Alwin",1847207);
        obj.printStudent();
    }
}

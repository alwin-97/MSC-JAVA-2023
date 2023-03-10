class Student{
    // data members
    String name;
    String rollno;

    // Default constructor | Empty constructor
    Student(){
        System.out.println("I am a constructor..");
        name = "DEFAULT VALUE";
        rollno = "ROLL NUMBER";
    }

    Student(String a, String b){
        System.out.println("I am paramertized constructor");
        name = a;
        rollno = b;
    }

    void setNameRollno(String a,String b){
        name = a;
        rollno = b;
    }

    public String toString(){
        return name+" "+ rollno;
    }
}

public class classEx {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.toString());
        stu.setNameRollno("Alwin", "1847207");
        System.out.println(stu.toString());
        
        Student newStu = new Student("abc","123");
        System.out.println(newStu.toString());

        int a = 0;
        int intArr[] = new int[5];
        int[][] intArr2 = new int[5][5];

        Student sobj = new Student();
        sobj.name = "name";
        Student arr[] = new Student[5];
        arr[0].name = "name 1";
        arr[1].name = "name 2";


    }
}

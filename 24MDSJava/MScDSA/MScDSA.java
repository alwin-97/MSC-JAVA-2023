class Student{

    private String name;

    Student(){
        System.out.println("i am a constructor");
    }

    Student(String name){
        System.out.println("I am par. con. wit. val "+name);
        this.name = name;
    }

    void setName(String nme){
        this.name = nme;
    }

    String getName(){
        return this.name;
    }
}

public class MScDSA {
    public static void main(String[] args) {
        Student abhidev = new Student();
        abhidev.setName("Abhidev S P");
        System.out.println(abhidev.getName());

        Student abin = new Student("Abin Roy");
        System.out.println(abin.getName());
        
    }
}

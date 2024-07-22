class Student{
    private String name;
    int age;

    void setName(String n){
        name=n;
    }

    String getName(){
        return name;
    }
}

public class MScDsB {
    public static void main(String[] args) {
        Student aadith = new Student();
        aadith.setName("Aadith Joseph");
        // aadith.name = "Abay Singh";
        System.out.println(aadith.getName());
    }
}

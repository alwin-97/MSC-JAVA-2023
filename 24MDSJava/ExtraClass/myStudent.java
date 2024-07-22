class Student{

    private String name;

    Student(){}

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

}

class myStudent{
public static void main(String[] args) {
    String[] name = new String[10];//name [0/1/2/3/4...]

    Student name1 = new Student(); // normal object
    name1.setName("Alwin");
    System.out.println(name1.getName());

    Student[] obj = new Student[10];
    int counter = 0;

    do{
        System.out.println();

        switch () {
            case 1:
                obj[counter] = new Student();
                counter+=1;
                break;
            case 2:
                for(int i=0;i<counter;i++){
                    System.out.println(obj[i].getName())
                }
            default:
                break;
        }

        // chose to continuw
    }while();
}
}
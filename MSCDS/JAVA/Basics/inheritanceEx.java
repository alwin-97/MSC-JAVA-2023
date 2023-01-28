class College {
    protected String collegeName;
    public String abc;
    private String cdf;

    College(){
        System.out.println("College class constructor");
    }

    void printCollegeName(){
        System.out.println(" : "+ this.collegeName);
    }
}

class Students extends College{
    String studentName;
    String rollNumber;

    Students(){
        System.out.println("Student class constructor");
    }

    void printStudentDetails(){
        System.out.println(" : : "+this.studentName + " (" + this.rollNumber + ").");
    }
}

public class inheritanceEx{
    public static void main(String args[]){
        // College colobj = new College();
        Students stuobj = new Students();
    }
}


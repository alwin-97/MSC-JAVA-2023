package alin;


//initialising the class Person
public class Person {
    //person class having data members

    public String name;
    public int phone;
    public String email;
    //creating default constructor
    public Person(){
        this.name=" ";
        this.phone=0;
        this.email=" ";

    }
    //creating parametrized constructor
    public Person(String name,int phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    //for displaying the persons' details
    public String getPersondetails(){
        return "Name :"+this.name+" Phone: "+this.phone+" Email: "+this.email;
    }

    
}
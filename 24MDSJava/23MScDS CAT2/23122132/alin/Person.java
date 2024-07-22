//this is the package alin
package alin;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//inside the package, there is this class called Person
public class Person {
    //declaring the data members for the class Person
    String name;
    String phone;
    String email;
    Scanner scan = new Scanner(System.in);

    //constructor without parameters to initialize the variables
    public Person(){
        this.name="";
        this.phone="";
        this.email="";
    }

    public Person(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    //method to print the details of a person
    public String personDetails(String name,String phone,String email){
        return name+","+phone+","+email;

    }

    public void write_to_file(){
            try{
                FileWriter filewriter = new FileWriter(("personDetails.txt"),true);
                String record = personDetails(name, phone, email);
                filewriter.write(record);
                filewriter.write('\n');
                filewriter.close();
            }
            catch (Exception e){
                System.out.println("Error");
                e.printStackTrace();
            }
            

    }

    
}

// Initializing the package
package alin;

// Importing the necessaries
import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private long phone;
    private String email;

    public Person(String name, long phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public long getPhone(){
        return phone;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Name: " + name +
                ", Phone No: " + phone +
                ", Email ID: " + email;
    }
}
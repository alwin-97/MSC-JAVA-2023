package alin;

public class Person{

    // Data Members of Person
    private String name;
    private String phone;
    private String email;

    // Constructor to set Data memeber values
    public Person(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters for each data members
    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }
}
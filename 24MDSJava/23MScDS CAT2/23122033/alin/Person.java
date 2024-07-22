package alin;

public class Person{

    // Declaring the variables
    private String name;
    private int phone;
    private String email;

    // Declared a constructor
    public Person(String name, int phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // We will use the getter  method to access the variables as they are private
    public String getName(){
        return name;
    }

    public int getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return name + ",(" + phone + ")," + email;
    }

    public static Person fromString(String personData){
        String[] parts = personData.split(",");
        String name = parts[0];
        int number = Integer.parseInt(parts[1]);
        String email = parts[2];

        // create a new intstance of the constructor
        return new Person(name, number, email);
    }
}
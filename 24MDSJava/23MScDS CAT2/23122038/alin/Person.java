package alin; // a class under package alin

public class Person{
    private String name;
    private int phone;
    private String email;

    public Person(String name, int phone, String email){  // creating a parametrized constructor
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // retrieving the values using getter method
    public String getName() { 
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail(){
        return email;
    }


    // mehod to print person Details
    public void print_personDetails(){   
        System.out.println("Person Details........");
        System.out.println("Person name: "+ this.getName());
        System.out.println("Person phone number: "+ this.getPhone());
        System.out.println("Person email id: " + this.getEmail());
    }
}
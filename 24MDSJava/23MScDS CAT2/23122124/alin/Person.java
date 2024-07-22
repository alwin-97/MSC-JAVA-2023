package alin;

public class Person {

    protected String name;
    protected String phone;
    protected String email;

    Person(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void printDetals(String name, String phone, String email){
        System.out.println("Name: " + name + "\n");
        System.out.println("Phone no: " + phone + "\n");
        System.out.println("E-mail: " + email);
    }

    public String getDetails(){
        return "Name: " + name + "Phone no: " + phone + "E-mail: " + email;
    }

}

package alin;

import java.io.*;

public class Person implements Serializable{
    private String name;
    private int phone;
    private String email;
 

public Person(String name, int phone, String email){ //Constructor for Person
    this.name = name;
    this.phone = phone;
    this.email = email;

}
//getter methods
public String getname(){
    return name;
}

public int getphone(){
    return phone;
}

public String getemail(){
    return email;
}

// To print the details
public String tostring(){
    return name +","+phone+","+email;
}

public static Person fromstring(String contact_data){
    String[]parts = contact_data.split(",");
    if (parts.length!=3) throw new IllegalArgumentException("Invalid data:" + contact_data);
    return new Person((parts[0]),Integer.parseInt(parts[1]),(parts[2]));
}
}

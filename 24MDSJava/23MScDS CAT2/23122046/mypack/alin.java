// package named alin with a class named Person
package alin;
import java.util.*;
import java.io.*;
// Person class with data members name, phone and email
class Person{
    private String name;
    private long phone;
    private String email;
}
// constructor Person with no parameters.
public Person(){
    this.name = "dipa";
    this.phone = "2345678";
    this.email ="123@gmail.com";

}
// constructor Person with parameters name, phone and email
public Person(String name,long phone, String email){
    this.name = name;
    this.phone = phone;
    this.email = email;
    
}

public String getName(){
    return name;
}

public long getPhone(){
    return phone;
}

public String getEmail(){
    return email;
}
//function to print the persons details
public void printDetails(name,long phone, String email){
    System.out.println("NAME:"+ getName());
    System.out.println("PHONE NUMBER:"+ getPhone());
    System.out.println("EMAIL:"+ getEmail());

}
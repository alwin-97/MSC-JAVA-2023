//Package named Alin with a class named Person//

Package alin
import java.io*;
import java.util.ArrayList;
import java.util.Scanner;
Public class Person  {
    Private String name;
    Private Int PhoneNumber;
    Private boolean[] ContactDetails;

//Person class having data members//

Public Person (String name, int PhoneNumber, int EmailAddress,){
    this.name = name;
    this.PhoneNumber = PhoneNumber;
    this.EmailAddress = EmailAddress;
    this.ContactDetails = new boolean[number of people];
} 
public String getName(){
    return name;
}
public int getPhoneNumber(){
    return PhoneNumber;
}
public int getEmailAddress(){
    return EmailAddress;
}
public boolean[] getContactDetails (){
    if(Person > = 0 && Person < ContactDetails.length){
        ContactDetails [Person] = true;
        System.out.println("Contact marked for" + name + "Person Details"+ (Person + 1));
    } else {
        System.out.println("Invalid Person");
    }
    }
}

//Display Contact Details//
Public void display ContactDetails (){
    System.out.println(x:"\Contact Details:");
    System.out.println("Name: " person.getName());
    System.out.println("PhoneNumber: " person.getPhoneNumber());
    System.out.println("EmailAddress: " person getEmailAddress());

    scanner.close();
}

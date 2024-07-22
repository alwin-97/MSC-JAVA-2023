package alin;   //begining of the package alin

import java.io.FileWriter;              //Importing packages requrired for the functionalities 
import java.io.IOException;


//Person class with data members name,phone,email

public class Person{
    char name;
    int phone;
    char email;
    
}

//Constructors in person class
public Person(char name,int phone,char email){
    this.name=name;
    this.phone=phone;
    this.email=emai;

}



//Function to print person details
public PrintDetails(char name){

    

}


//code to save the details of the person
public void SavePerson(String filename){
    try(FileWriter writer = new FileWriter(filename,true)){
        writer.write(name+","phone+","email);
        System.out.print("Contact Saved sucessfully");
    } catch(IOException e){
        e.print StrackTrace();
    }
}





package model;

import alin.Person;

import java.io.*;
import java.util.*;

public class PersonManager{

    // Creating a filename  variable
    private static final String Person_file = "Person.txt";

    private List<Person> person;

    public PersonManager(){
        person = new ArrayList<> ();
        loadPerson();
    }

    // loadinf the deatils
    private void loadPerson(){
        try(BufferedReader br = new BufferedReader(new FileReader(Person_file))){
            String line;
            while((line = br.readLine()) != null){
                person.add(((Person) person).fromString(line));
            } 
        }catch(Exception exception){
            System.out.println("File not found");
        }
    }

    // saving person information
    public void SavePerson(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(Person_file))){
            for(Person person : person){
                bw.write(person.toString());
                bw.newLine();
            }
        }catch(Exception ex){
            System.out.println("File not found");
        }
    }
    
    // adding student 
    public void AddPerson(String name, int phone, String email){
        person.add(new Person(name, phone, email));
        SavePerson();
    }

    public void printAllContact(){
        for(Person person: person){
            System.out.println(person);
        }
    }
}
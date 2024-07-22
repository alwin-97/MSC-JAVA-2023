package Contacts;

import alin.Person;
import java.util.*;
import java.io.*;

public class ContactManager{
    private static final String CONTACT_FILE = "contacts.txt";
    private List <Person> persons = new ArrayList<>();

    public void ContactsManager(){
        loadContacts();
    }

    private void loadContacts(){
        try(BufferedReader br = new BufferedReader(new FileReader(CONTACT_FILE))){
            String line;
            while((line=br.readLine()) != null){
                persons.add(Person.fromstring(line));
            }
        }
    catch(IOException e){
        e.printStackTrace();
            }

     }


public void saveContacts(){
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(CONTACT_FILE))){
        for(Person person : persons ){
            bw.write(person.tostring());
            bw.newLine();
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
public void addContact(String name, int phone, String email){
    if(persons.stream().anyMatch(c->c.getphone()==phone)){
        System.out.println("contact with phone no.:" + phone + "already exists");
    }
    else {persons.add(new Person(name, phone, email));
    saveContacts();}
}
public void printAllContacts(){
    persons.forEach(System.out::println);
}
public void findperson(String name, int phone, String email){
    if(persons.stream().anyMatch(c->c.getname()==name)){
        System.out.println("Contact found:"+ "Name:"+name +"Phone no."+ phone +"Email:"+ email);
    }
    else{
        System.out.println("Contact Not Found");
    }
    
}
}


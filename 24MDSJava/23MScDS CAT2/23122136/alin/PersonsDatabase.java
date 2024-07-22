package alin;

import java.io.*;
import java.util.*;
// import java.util.jar.Attributes.Name;

// creating a separet class to handel all the functions 
public class PersonsDatabase {
    
    private Map<String, Person> Person;
    private static final String FILENAME = "Contacts.txt";

    // create the constructor and using Hashmap function 
    public PersonsDatabase() {
        this.Person = new HashMap<>();
        loadDatabase();
    }

    // Add the functionality to add persons or contacts using Person class object
    public void addPerson(String Name,String Phone,String Email){
        Person.put(Name, new Person(Name,Phone,Email));
        SaveDatabase();
        System.out.println("Contact Added Succesfully");
    }
    // Add the functionality to search a existing contacts using Person class object
    public void searchbyName (String Name){
        Person person = Person.get(Name);
        if(person!=null){
            System.out.println("Contact Found");
            System.out.println(person);
        }
        else{
            System.out.println("Name" + Name + "Not Found");
        }
    }
    // Create the function to make a new file if its not already there and read the database 
    private void loadDatabase() {
        try {
            File file = new File(FILENAME);
            if (!file.exists()) {
                file.createNewFile();
                return;
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if (parts.length == 3) {
                    Person.put(parts[0], new Person(parts[0], parts[1], parts[2]));
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // create this function to save the data you stored 
    private void SaveDatabase(){
        try{
            FileWriter writer = new FileWriter(FILENAME,true);
            for(Person person : Person.values()){
                writer.write(person.getName() + "," +person.getPhone()+","+person.getEmail()+"\n");
                writer.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    // Creating this function for lising all the 
    public void listcontacts(){
        try{
            File writer = new File(FILENAME);
            Scanner scanner = new Scanner(writer);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

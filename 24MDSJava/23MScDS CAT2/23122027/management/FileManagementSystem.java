package management;
//to manage file handling

import java.io.*;
import java.util.*;
import alin.Person;
import alin.PersonDetail;
//import necesary li braries and packages



public class FileManagementSystem {
    private List<Person> alins;

    //constructor

    public FileManagementSystem (){
        alins = new ArrayList<>();
    }



    //followings are functions needed for the main application


    //add contact
    public void addPerson(Person alin){
        alins.add(alin);
    }

    //save to file
    public void saveToCSV (String fileName){
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            writer.println("Name,PhoneNo,Email,Address"); //for header
            for (Person alin : alins) {
                if (alin instanceof PersonDetail){
                    {
                        PersonDetail management = (PersonDetail)alin;
                        writer.println(management.getName()+ "," + management.getPhoneNo()+ "," + management.getEmail() + "," + management.getAddress());
                    }
                }
                System.out.println ("Details saved to " + fileName);
            }}
            catch(IOException e){
                e.printStackTrace();
            }
        }


        //load the file
    public void loadFromCSV (String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            reader.readLine();
            while ((line= reader.readLine()) != null){
                String [] parts = line.split(",");

                 if (parts.length == 5){
                    String name = parts[0];
                    long PhoneNo = Long.parseLong(parts[1]);
                    String Email = parts[2];
                    String Address = parts[3];

                    alins.add(new PersonDetail(name, PhoneNo, Email, Address));


                }
            }
            System.out.println("Details loaded in " + fileName);
        }catch(IOException e){
            e.printStackTrace();

        }
                
    }


    //displaying the list
    public void  displayPerson(){
        for (Person alin: alins){
            System.out.println(alin);
        }
    }
    

    //search for contact
    public static void searchContact(String fileName, String targetName) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while((line = br.readLine()) != null){
                String [] values = line.split(",");
                if (values.length >0 && values[0].equals(targetName))
                System.out.println("Found row : " + line );
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

}
        
    
    
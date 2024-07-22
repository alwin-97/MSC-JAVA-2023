package alin;

// Creating the Person Class 
public class Person {
    private String Name;      // initialze the data members 
    private String Phone;
    private String Email;

    // creating te constructor (and this is parameterizes )
    public Person(String Name,String Phone,String Email){
        this.Name = Name;
        this.Phone =  Phone;
        this.Email = Email;
    }


    // Ceating Getters functions 

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }
    
    @Override
    public String toString(){
        return"Name: " + Name + " Phone: " + Phone + " Email: " + Email; 
    }

}

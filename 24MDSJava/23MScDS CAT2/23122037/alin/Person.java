package alin;




public class Person{
 private String Name;
 private int Phone;
 private String Email;

    // default constructor
    public Person(){
        this.Name = "";
        this.Phone = 234 ;
        this.Email ="";

    }
    //parameterize constructor
    public Person(String Name,int Phone,String Email ){
        this.Name =Name;
        this.Phone = Phone;
        this.Email = Email;
    }
    public String getName(){
        return this.Name;
    }
    // Function to printdetalis
    public void printdetails(){
        System.out.println("Name:"+this.Name);
        System.out.println("Phone:"+this.Phone);
        System.out.println("Email:"+this.Email);

    }

    public String getDetalis(){
        return "Detalis"+","+this.Name+","+this.Phone+","+this.Email;
    }
    
}


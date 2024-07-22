package alin; //package named alin

// person class having datamembers
public class Person{
    protected String Name;
    protected int Phone;
    protected String Email;
//constrcutors
    Person(String Name,int Phone,String Email){
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    Person(){
        this.Name = "";
        this.Phone = 0;
        this.Email =  "";
    }
//function to print person details
    public void  Print_Details(){
        System.out.println("Name is" + Name);
        System.out.println("Phone is " + Phone);
        System.out.println("Email is"+ Email);
    }
}


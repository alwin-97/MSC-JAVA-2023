package alin;
//package name alin


//creating a child class using parent class Person (INHERITANCE)
public class PersonDetail extends Person {
    private String Address;
 
    //consructor
    public PersonDetail(String name, long phoneNo, String Email, String Address){
        super(name, phoneNo, Email);
        this.Address = Address;
    }

 //followings are functions to get address and all details together
    public String getAddress(){
        return Address;
    }

    @Override
    public String toString(){
        return super.toString() + ",Address:" + Address;
    }
    
}

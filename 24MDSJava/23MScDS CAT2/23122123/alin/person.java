// Creating a Package alin

package alin;

// with class name person
public class person{

    // data members
    private String name;
    private String phone;
    private String email;

    // constructor
    public person(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    public String getname(){
        return name;
    }

    // printing the details
    public void printdtls(){
        System.out.println("Name: "+ name);
        System.out.println("Phone: "+ phone);
        System.out.println("Email: "+ email);

    }

}
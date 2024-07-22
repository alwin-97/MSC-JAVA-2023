package alin;
class Person{    // our clas
    String Name;  //Data Members 
    int Phone;
    String Email;
    String Age;


    Person(){     // Constructor 
        this.Name = "";  // Encapsulation Method : We are Extracting only the necessary data from our class
        this.Phone = 0;   // Here, wer are using the setter method where we are setting up the values of the data members that is we are initializing them.
        this.Email = "";
        this.Age = "";
    }
    Person(String Name,int Phone,String Email,String Age){
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Age = Age;
    }
    public String getName(){  // Here we are using another encapsulation method which is getter method 
                            //I getter method, we are exracting or getting the necessary data or the data that we wants from the class. 
        return this.Name;
    }
    public int getPhone(){
        return this.Phone;
    }
    public String getEmail(){
        return this.Email;
    }
    public String getAge(){
        return this.Age;
    }

    public void printPerson_Details(){
        System.out.println("Name : "+ this.Name + ", Phone : " + this.Phone + ", Email :" + this.Email + ",Age" + this.Age); // here we are printing the details of a person that we have stored in the class.

    }




}




package alin;

import java.time.LocalDate;
// class for storing each person information
public class Person {
    // data members in the class 
        private String name;
        private String phone;
        private String email;
        private String data;
        // defualt contruster for initilizing the values
        public Person(){
            this.name = "";
            this.phone = "";
            this.email = "";
            this.data = LocalDate.now().toString();
            
        }
        // parameterized constructer for geting values from the user
        public Person(String name,String phone,String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.data = LocalDate.now().toString();
        }

        public Person(String data,String name,String phone,String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.data = data;
        }

        // function for returing the name of the person
        public String getname(){
            return this.name;
        }

        public String getdate(){
            return this.data.toString();
        }
        // function for printing the details of the person
        public void print_details(){
            System.out.println("date: "+this.data);
            System.out.println("name: "+this.name);
            System.out.println("phone: "+this.phone);
            System.out.println("email: "+this.email);
        }

        // function for returning the details as a row
        public String getdetails(){
            return this.data+","+this.name+","+this.phone+","+this.email;
        }

}
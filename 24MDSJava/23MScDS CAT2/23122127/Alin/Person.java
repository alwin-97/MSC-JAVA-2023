
package Alin;


    public class Person{
       
        String name;
        String number;
        String Email;
        /*CONSTRUCTORS */
        public Person(String name,String num, String Email){
            this.name=name;
            this.number=num;
            this.Email=Email;
       
        }
        /* Method To Print Details */
        public void PrintDetails(){
            System.out.println("HEllo! WELCOME  : "+name);
            System.out.println("Your Phone Number Is :-"+number);
            System.out.println("Your Email Id Is "+Email);

        }

    }

    
   

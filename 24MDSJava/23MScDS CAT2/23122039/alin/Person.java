package alin;

import java.util.scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.IOException;

//defining the class Person

public class Person{

    // defining the variables 

   private String Name ;
   private long Phone;
   private double Email;
   String  Newcontact[][] ;
   int contact_count = 0;

//defining the default constructor for class Person

   public void Person ()
{  
     //initializing the variables  

    this.Name = "" ; 
    this.Phone = 0;
    this.Email = "";

}
// defining the paremeterized constructor for class Person

    public Person (String Name , long Phone , double Email)
{  
     //initializing the variables  

    this.Name = Name ; 
    this.Phone = Phone;
    this.Email = Email;

}

//function for printing the details 

    public void printdetials()
{
    //printing the details : Name , phone number and Email 

    System.out.printLn("Enter you Name : "+this.Name);
    System.out.printLn("Enter you Name : "+this.Phone);
    System.out.printLn("Enter you Name : "+this.Email);

}

// function for getting the name of a person  

    public String  getName()
{
    return this.Name;
}


// function for adding a new contact :

    public void add_contact()
{
  // String  Newcontact[][] ;

   //two dimensional array to save the details of each persson 

   System.out.println("Enter how many person's number you want to add");
   int contact_count   =  scanner.nextInt();
   scanner.nextLine();

    Newcontact[][] newcontact = new Newcontact[n];

    //int contact_count = 0;
   String filename = "contact.txt";
   BufferedWriter writer = new BufferedWriter("contact.txt");

   // using for loop to save the contact of each person 

   for (int i = 0 ; i < contact_count ; i++)
   {
    newcontact[i][0] = this.Name;
    newcontact[i][1] = this.Phone;
    newcontact[i][2] = this.Email ;
    contact_count++;
    
   }
}
   
 //function  : when alen exists all the contact details wiil be saved in the file   

    public void contact_in_file()
{

    try{

    FileWriter fileWriter =  new Filewriter("contact.txt");
    writer = new BufferedWriter(fileWriter);
 
   for (int i = 0 ; i < contact_count ; i++)
   {
    fileWriter.write(newcontact[i][0] = this.Name +"\t"+ newcontact[i][1] = this.Phone+"\t" + newcontact[i][2] = this.Email) ;
    contact_count++;
    
   }
   fileWriter.close();
   }catch(IOException e){

    System.out.printLn("Something wrong" +e.getMessage());

   } finally{ if (writer != Null)
   {
    try{ writer.close();
    
    }catch(IOException e){
        System.out.printLn("Faiiled to get Message ."+e.getMessage());
    }

   }
   }

}



//program for listing contacts

    public void listing(){

    for(i = 0 ;i<contact_count ; i++)
    {
        System.out.printLn(newcontact[i][0] = this.Name+"\t"+newcontact[i][1] = this.Phone+"\t"+ newcontact[i][2] = this.Email);

    }
    }




// function for searching a person's contact 

    public void search_contact()
{

System.out.printLn("Enter the name of the person  you want to search");
String Searchname = scanner.nextLine();
boolean found = false ;

// condition for searching the contact details

for (int j =0 ; j < contact_count ; j++)
{
if(newcontact[i][0].getName())equalsIgnoreCase (Searchname);
{

    this.Name.printdetails();
    found = true ;
}
if (! found ){
    System.out.printLn("Not found ...");
}
}


 }
}




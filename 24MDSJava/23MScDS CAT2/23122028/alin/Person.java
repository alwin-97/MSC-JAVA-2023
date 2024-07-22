package alin;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;



public class Person{  //class named Person
    String name;
    String phonenum;
    String email;

    public Person(){ //creating constructor (default or non-parametrized constructor)
        this.name="";
        this.phonenum="";
        this.email="";
    }

    public Person(String name,String phonenum,String email){  //parametrized constructor
        this.name=name;
        this.phonenum=phonenum;
        this.email=email;
    }

    public void printDetails(){ //function to print details
        System.out.println("name is"+name);
        System.out.println("email is "+email);
        System.out.println("phone number is "+phonenum);
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phonenum;
    }
    public static void welcome(){ //function to welcome alin to the program
        System.out.println("*********************************");
        System.out.println("Good morning Alin.... Hope you have a great day..!");
    }

    public static void collectdetails(Scanner scan){ //function to collect persons details
     
        System.out.println("enter the name");
        String name=scan.nextLine();
        System.out.println("enter the phonenumber");
        String phonenum=scan.nextLine();
        System.out.println("enter the email");
        String email=scan.nextLine();
        System.out.println("*********************************");
        String details=name+ "\t" +phonenum +"\t" +email+ "\n";
        System.out.println("contact details: " +details);

        String [] contact= new String[3];
        contact[0]=name;
        contact[1]=phonenum;
        contact[2]=email;
        // these details are stored in a file named contact

        try{FileWriter fileWriter=new FileWriter("contact.txt");
        fileWriter.write(details);
        fileWriter.close();
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    // }
    // public static void viewDetails(){  //function to print persons details
              try{ File file=new File("contact.txt");
              Scanner fileReader =new Scanner(file);
              while(fileReader.hasNextLine()){
                String readline=fileReader.nextLine();
                String[] line=readline.split("\t");
                name=line[0].trim();
                phonenum=line[1].trim();
                 email=line[2].trim();

                System.out.println("entered name is "+name);
                System.out.println("entered phonenumber is "+phonenum);
                System.out.println("entered email is "+email);
            }
            fileReader.close();
              }catch(Exception exception){
              System.out.println(exception.getMessage());
    }
}
            public static void searchDetails(Scanner scan){  // function to search for the existing person
            System.out.println("enter the name to be searched");
            String searchname=scan.nextLine(); 
            boolean found =false;
            try{Scanner fileScanner =new Scanner(new File("contact.txt"));
            while(fileScanner.hasNextLine()){
                String readline=fileScanner.nextLine();
                String details[] =readline.split(" ");
                if (details[0].trim().equalsIgnoreCase(searchname)){
                found=true;
                Person person =new Person(details[0],details[1],details[2]);
                person.printDetails();

                }else{
                    System.out.println("not found");
                }
            }   
            fileScanner.close();      
}catch(Exception exception){
    System.out.println(exception.getMessage());
}
}
}
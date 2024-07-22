// package name 
 package alin;
//  importing Person class from package alin
import alin.Details.Person;   

// a static function in alincontact class to welcome  alin
class Alin_contact{
    public String welcome_alin(String name){
        System.out.println("welcome alin");
    }

}
public class CAT2HR.java{
    public static void main(String [args]){
        // menu
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do{ System.out.println("Enter any number");
            System.out.println("1.Adding new contact");
            System.out.println("2.Searching for an existing contact.");
            System.out.println("3.Listing Contact");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                // adding a new person to the file
                System.out.println("enter your name");
                Scanner name= sc.nextLine();
                System.out.println("Enter your phone no");
                Scanner phone= sc.nextLine();
                System.out.println("Enter your email");
                Scanner email= sc.nextLine();
                try{
                    FileWriter filew= new FileWriter("person_deatails.txt",true);
                    filew.write(line + "\n");
                    file.close();
                }catch( Exception exception){
                    System.out.println("There is an error");
                }
                break;
                
                // Searching for a new person if found then saved to that file
                case 2:
                 String email;
                 System.out.println("enter your email");
                 String email= sc.nextLine();
                 try{
                    File file=new file("person_deatails.txt",true);
                    Scanner sc1=new Scanner (file);
                     while(sc1.hasNextLine()){
                        String line_1=sc1.nextLine();
                        String [] line_split= line_split("  ,  ");
                        if email.equals(line_split[0]){
                            System.out.println(line_1);

                        }
                     }
                 }catch(Exception exception){
                    System.out.println("Error");
                 }
                 break;
                 case 3:
                 System.out.println("Exit");
                 break;


                

                }
            }
        }

    }


 
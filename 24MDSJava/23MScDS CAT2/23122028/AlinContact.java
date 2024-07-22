import alin.Person; //importing package alin
import java.io.File;
import java.util.Scanner;

public class AlinContact{

    public static void main(String args[]){
          Scanner scan =new Scanner(System.in);
          char ch='y';

          do{
            int choice=0;
            Person.welcome(); // print welcome message
            //menu
            System.out.println(" please choose from below");
            System.out.println("1 add a new contact and viewing ");
            System.out.println("2 search for an existing contact");
            System.out.println("3 listing contacts");
            System.out.println("4 exit program");


            choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                Person.collectdetails(scan);
                break;

                case 2:
                Person.searchDetails(scan);
                break;

                case 3: //listing all the contacts

                 try{ File file=new File("contact.txt");
              Scanner fileReader =new Scanner(file);
              while(fileReader.hasNextLine()){
                String readline=fileReader.nextLine();
                String[] line=readline.split("\t");
                String name=line[0].trim();

                System.out.println("contacts are "+name);
              }
            fileReader.close();
              }catch(Exception exception){
              System.out.println(exception.getMessage());
              }
               break;
                
               case 4:
                System.exit(0);
                break;

                default:
                System.out.println("invalid input");
  }
               System.out.println("do you waant to continue type y for yes and n for no");
               ch=scan.nextLine().charAt(0);
          }while(ch=='y');
    }
    
}

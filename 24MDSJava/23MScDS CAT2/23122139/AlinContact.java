import alin.Person; //importing Person class from package Alin
import java.io.*;
import java.util.*;
// Main class of program ALincContact
public class AlinContact {
    //intializing an array of Person details 
    private static ArrayList<Person> PersonCollection = new ArrayList<>();

    //creating a file to store details
    private static final String FN = "contact.txt";
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        // static function to welcome Alin
        // private static void welcome(){
        //     System.out.println("*****************");
        //     System.out.println(" Welocme Alin !");
        //     System.out.println("*****************");
        // }
        // welcome();

        //Menu with Options [adding,searching and lsiting] using switch case and do while loop
            char opt;
            String per1 = "" ;
            Person[] per = new Person[10];
            int choice ;
            do{
                System.out.println("Enter your choice");
                System.out.println("*****************");
                System.out.println("1.Adding a new Person");

                System.out.println("3.Listing Contacts");

                System.out.println("4.Exit ");

                choice = scan.nextInt();

                switch(choice){
                    case 1:
                    System.out.println("enter name");
                    String name = scan.nextLine();
    
                    System.out.println("enter phone");
                    int phone = Integer.parseInt(scan.nextLine());
    
                    System.out.println("enter email");
                    String email = scan.nextLine();
    
                    try(FileWriter writer = new FileWriter("contact.txt")){
                        writer.write(FN + "\n");
                        System.out.println("added!");
                    }
                    catch(IOException e){
                        System.out.println("errorr occured");
                        e.printStackTrace();
                    }
                        break;

                    case 2:
                        search();
                        break;

                    case 3:
                        // listing();
                        break;

                    case 4:
                        System.out.println("exiting !!");

                    default:
                       break;}

                        System.out.println("do you want to conitnue(y/n)");
                opt = scan.nextLine().charAt(0);
                    }while(opt == 'y');
                scan.close();}
            
            //implementing functionality of adding a new person
            private static void add_det(Scanner scan,String name,int phone,String email){
               
                System.out.println("enter name");
                String Name = scan.nextLine();

                System.out.println("enter phone");
                int Phone = Integer.parseInt(scan.nextLine());

                System.out.println("enter email");
                String Email = scan.nextLine();

                try(FileWriter writer = new FileWriter("contact.txt");){
                    writer.write( FN + "\n");
                    System.out.println("added!");
                }
                catch(IOException e){
                    System.out.println("errorr occured");
                    e.printStackTrace();
                }

            }
            // implementing fucntion fro searching for an existing person and displaying details of person
            private static void search(){
                }
            private static void listing(String Name, double Phone,String Email){
                try(BufferedReader read = new BufferedReader(new FileReader("contact.txt"))){
                    String line;
                    while((line = read.readLine())!=null){
                        String []details = line.split(",");
                        if(details[0].equals("Person")){
                            String name = details[0];
                            String phone = details[1];
                            String email = details[2];
                            // line.append(details[1],Integer.parseInt(details[2]),details[3]);
                        }else {
                            System.out.println("no data");
                        }
                    }
                }catch(IOException e){
                    System.out.println("error occured whil reading");
                    e.printStackTrace();
                }
            }
            }

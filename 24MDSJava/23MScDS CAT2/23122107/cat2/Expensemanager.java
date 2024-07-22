import java.io.*;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.io.IOException;

class Transaction{


    LocalDate my_obj = LocalDate.now();

    transcation(String transcationtype , String description){

            this.date = my_obj;
            this.transcation_type = transcationtype;
            this.description = description;

    }


    }




 class Expensemanager extends Transaction{


         File file = new File("expenses.txt");
         Scanner sc = new Scanner(file);

         while (sc.hasNextLine())

         System.out.println(sc.nextLine());


         Scanner scan = new Scanner(System.in);

        //menu driven program
        int choice; 
        do{
            System.out.println("--------------------------------------------");
            System.out.println("WELCOME TO DAILY FINANCIAL MANAGEMENT SYSTEM");
            System.out.println("--------------------------------------------");
            System.out.println("----------PLEASE SELECT AN OPTION-----------");   
            System.out.println("----------Option1:store transcation---------");  
            System.out.println("----------Option2:viewing transcation-------");
            System.out.println("----------Option3:viewing total stastics----");    
            System.out.println("--------------------------------------------");
            System.out.println("--------------------------------------------");
                choice = scan.nextInt();
            switch(choice){


                case 1:
                    System.out.println("PLEASE ENTER YOUR TRANSCATION TYPE");
                    String s1 = scan.nextLine();
                    System.out.println("PLEASE ENETER YOUR AMOUNT");
                    int s2 = scan.nextInt();
                    System.out.println("please enter some description ");
                    String s3 = scan.nextLine();     

                    stores();   

                break;
                    
                case 2:
                    adding()
                break;
                case 3:
                        viewing()
                
                case 4:
                    totalStatistics()
                default:
                    System.out.println("error has occured");
                    
                                
            }
        }while(choice!=4);
            
        }
            //we save the file here
            try{

                FileWriter writer = new FileWriter("expenses.txt");
                String data1 = scan.nextLine;
                writer.write(data1);
                write.close();

                System.out.println("hello");
            }


            catch(IOException e){

                System.out.println("an error occured");
                e.printStackTrace();
            }

        Expensemanager obj2 = new Expensemanager();
        


        public void stores(String transcationtype , String description){


                String a = transcationtype;
                String b = description;
            
        }




        public void adding(string a){

            
                
                
        }



        public void viewing(){

                System.out.println("THE FOLLOWING IS YOUR TRANSCATIONS " + s1);
                System.olut.println("THE FOLLOWING IS your descriptions " + s2);
                

        }


        public void total(){

              

        }
    



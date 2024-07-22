import alin.SavePerson; //importing the user made package named alin
import alin.PrintDetails;
import alin.person;


import java.io.FileWriter;              //Importing packages requrired for the functionalities 
import java.io.IOException;
import java.io.Scanner;


//main program called AlinContact

public class AlinContact{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            //Menu of the
            System.out.println("____________________________________________________________________");
            System.out.println("_________________WELCOME TO THE PROGRAM ALIN <3_____________________");//Welcome message for alin
            System.out.println("Menu:-");
            System.out.println("____________________________________________________________________");
            System.out.println("Enter the number as choice");
            System.out.println("1:Enter New Contact");
            System.out.println("2:Search Contact");
            System.out.println("3:Exit");
            System.out.println("_____________________________________________________________________");
            

//Choice for the menu
            int choice = scanner.nextInt();

            if (choice==1){


                handleSaveperson();


            }

            if (choice==2){

                handlesearch();

            }

            else{
                break;
            }
        }
    }
}

//this is where code is saved
private static void handleSaveperson(Scanner scanner){
    System.out.println("Contact details....");
    char name= scanner.nextChar();
    char emai=scanner.nextChar();
    int phone=scanner.nextInt();
    person[]=name+email+phone; //person array    

    SavePerson SavePerson = new SavePerson(name,email,phone);
    SavePerson.SavePerson("data.csv");

}


//function for searching using the user made alin package
private static void handlesearch(Scanner scanner){
    System.out.println("Enter the name of the person to be searched..");
    char name= scanner.nextChar();
    PrintDetails.PrintDetails(char name);
    System.out.println("Peek-a-boo found you too...");
}
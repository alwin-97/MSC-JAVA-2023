import alin;   //Importing the user defined package alin
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// Creating an array to store person details
String[][] PersonDetails = new String[30][30];
int i;

public class Person{
// Method for storing contact details
// Person's details being saved to a file
public void storeDetails(){
  try{
    Scanner scan = new Scanner(System.in);
    // File writing
    FileWriter FileWriter = new FileWriter("contact.txt",true);
    FileWriter.write("Name\t"+"Phone\t"+"Email\n");
    FileWriter.write("Aryan\t"+"7769098767\t"+"ary12@gmail.com\n");
    FileWriter.write("Saloni\t"+"9986100987\t"+"sal321@gmail.com\n");
    FileWriter.write("Nehal\t"+"9450087777\t"+"hal234@gmail.com\n");
    FileWriter.write("Hetal\t"+"8859011234\t"+"tal324@gmail.com\n"); 
    FileWriter.close();
    
  // File reading
  File file = new File("contact.txt");
  Scanner fileReader = new Scanner(file);
  while(fileReader.hasNextLine()){
      System.out.println(fileReader.nextLine());
      PersonDetails[i] = fileReader.nextLine();  // Storing details from file in the array
  }
  fileReader.close();

}catch(Exception exception){
}

}
// Method for viewing contact details
public void viewDetails(){
    try{
        File file = new File("contact.txt");
        Scanner fileReader = new Scanner(file);
         while(fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
             PersonDetails[i] = fileReader.nextLine();  // Storing details from file in the array
        }
        fileReader.close();
    }catch(Exception exception){
      
    }
}


// Method for editing contact details
public void editDetails(){
    System.out.println("Which entry do you want to change? (Name / Phone / Email)");

}

}

public class AlinContact {
  public static void main(String[] args){
  
  Scanner scan = new Scanner(System.in);

// static function welcoming Alin
  static void WelcomeAlin(){
    System.out.println("Welcome to the app Alin"); 
  }
  
  
  do{
    System.out.println("Please choose one among the following options:");
    System.out.println("1.Store contact details.");
    System.out.println("2.View contact details.");
    System.out.println("3.Edit contact details.");
    int choice = Integer.parseInt(scan.nextLine());
    
    switch(choice){
        case 1:
          storeDetails();

        case 2:
          viewDetails();

        case 3:
          editDetails();

        default:
        System.out.println("Invalid choice, please try again.");

    }
    System.out.println("Do you want to continue?(Yes/No)");
    String continue = scan.nextLine();
    
  }while(continue.equalsIgnoreCase("yes"));
  }    
}

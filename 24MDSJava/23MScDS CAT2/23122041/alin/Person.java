package alin;

import java.io.*;
import java.util.*;

public class Person{
    //data members
    private  String name;
    private  double phone;
    private  String mail;
    private  int count=0;
    private int num;
    private  int last_num;
    private Scanner scan = new Scanner(System.in);

    public Person(String name,double phone,String mail,int num){  //parameterized constructor
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.num = num;
    }
    //getters - accessors(retrieve values form a field)
    public String getName(){
        return this.name;
    }

    public double getPhone(){
        return this.phone;
    }

    public String getMail(){
        return this.mail;
    }

    public int getNum(){
        return this.num;
    }

    public Person(){   //default constructor
        count = getLastNum();
        count++;
        num = count;
    }

    private int getLastNum(){
        try {
            File file = new File("contacts.txt");
            if(file.exists()){
                Scanner filScanner = new Scanner(file);
                while (filScanner.hasNextLine()) {
                    String line = filScanner.nextLine();
                    if (line.startsWith("number")) {
                        String[] parts = line.split("[:\t]");
                    
                    if (parts.length>1) {
                        String num = parts[1].trim();
                        last_num = Integer.parseInt(scan.nextLine());    
                    }
                }
                }filScanner.close();
            }
        }  catch (Exception e) {e.getMessage();
        }
        return last_num;
    }

    //function to get input
    public void getInput(){
        System.out.println("num:");
        num = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the name of the person - ");
        name = scan.nextLine();
        System.out.println("Enter the phone number of the person - ");
        phone = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the email id of the person - ");
        mail = scan.nextLine();
    }

    //function to save to file
    public void saveToFile(){
        try {
            FileWriter fileWriter = new FileWriter("contacts.txt",true);
            fileWriter.write("Number:"+getNum()+"\t"+"Name:"+"\t"+getName()+"\t"+"Phone number:"+" \t"+getPhone()+"\t"+ "Email id:"+"\t"+getMail());
            fileWriter.write("\n");
            fileWriter.close();
        } catch (Exception e) {e.getMessage();
        }
    }

    //function to print details
    public void printDetails(){
        System.out.println("The contacts are - ");
        System.out.println("Person number - " + getNum());
        System.out.println("Name of the person - " + getName());
        System.out.println("Phone number of the person - " + getPhone());
        System.out.println("Email id of the person - " + getMail());      
    }
}
  

package alin; //package named alin

import java.io.*; //importing necessary library

// class named Person having Data members name, phoneNo and mail
public class Person implements Serializable{
    private String name;
    private long PhoneNo;
    private String Email;

    //using constructor
    public Person(String name, long PhoneNo, String Email){
        this.name = name;
        this.PhoneNo = PhoneNo ;
        this.Email = Email;
    }


    //followings are functions to retuen name, phoneNo, email, and lastly all together
    public String getName(){
        return name;
    }

    public long getPhoneNo(){
        return PhoneNo;
    }

    public String getEmail(){
        return Email;
    }

    public String toString(){
        return "Name:" + name + ",Phone Number:" + PhoneNo + ",Email:" + Email;
    }
}
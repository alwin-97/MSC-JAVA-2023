package alin;

import java.util.*;

public class Person {
    static Scanner scanner = new Scanner(System.in);
    private String Name;
    private long Phone;
    private String Email;

    public Person() {
        this.Name = "Alin";
        this.Phone = 1234567890;
        this.Email = "alin@gmail.com";
    }

    public Person(String name, long num, String mail) {
        this.Name = name;
        this.Phone = num;
        this.Email = mail;
    }

 
    public void prindetails() {
        String phone = String.valueOf(Phone);
        System.out.println("Name- " + Name + " Phone- " + phone + " Email- " + Email);
    }

    public String getname() {
        return this.Name;
    }

    public long getphonenum() {
        return this.Phone;
    }

    public String getmail() {
        return this.Email;
    }

}

import alin.*;
import java.util.*;
import java.io.*;

class AlinContact {

    static int person_met = 0;
    static int today_contact_taken = 0;
    static Person[] person = new Person[1000];
    static String name;
    static long num;
    static String mail;
    static Scanner scanner = new Scanner(System.in);

    static String Hello_Alin() {
        return " -----------Hello Alin-----------" + '\n' +
                " Your Contact Amnager this." + '\n' +
                " Hope You meet some Wondeful people today." + '\n' +
                " I'm here to save the contact details of people you meet everyday." + '\n' +
                " Have a Nice day";
    }

    static void enterdetails() {
        System.out.print(" Please enter the person's name -  ");
        name = scanner.nextLine();
        System.out.print(" Please enter the person's Phone number  -  ");
        num = Long.parseLong(scanner.nextLine());
        System.out.print(" Please enter the person's email id -  ");
        mail = scanner.nextLine();
    }

    static String getdetails() {
        String numm = String.valueOf(num);
        return name + "," + numm + "," + mail;
    }

    static void findperson(String nam) {
        int flag = 0;
        for (int i = 0; i < person_met; i++) {
            String search = person[i].getname();
            if (search.equalsIgnoreCase(nam)) {
                flag = 1;
                person[i].prindetails();
                break;
            }
        }
        if (flag == 0) {
            System.err.println(" No details find ...");
        }
    }

    static void display() {
        for (int i = 0; i < person_met; i++) {
            person[i].prindetails();
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("Alin_Contact_details.txt");
            Scanner filereader = new Scanner(file);
            while (filereader.hasNextLine()) {
                String Data = filereader.nextLine();
                String[] data = Data.split(" ");
                long num = Long.parseLong(data[3]);
                person[person_met] = new Person(data[1], num, data[5]);
                person_met++;
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        ;
        System.out.println(AlinContact.Hello_Alin());
        while (true) {
            System.out.println('\n' + " 1. Add new Contact of a person ");
            System.out.println(" 2. Search Contact details of a person");
            System.out.println(" 3. Display all the contacts till now registered");
            System.out.println(" 4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AlinContact.enterdetails();
                    String details = AlinContact.getdetails();
                    String[] det = details.split(",");
                    long number = Long.parseLong(det[1]);
                    person_met++;
                    today_contact_taken++;
                    person[person_met] = new Person(det[0], number, det[2]);
                    if (today_contact_taken == 10) {
                        System.out.println(" Your Limit of Storing a person's contact in a day is reached" + '\n'
                                + "See you Tomorrow" + '\n' + "Exiting the program.");
                        try {
                            FileWriter writer = new FileWriter("Alin_Contact_details.txt", true);
                            for (int i = 0; i < person_met; i++) {
                                writer.write("Name- " + person[i].getname() + " Phone- " + person[i].getphonenum()
                                        + " Email- " + person[i].getmail());
                            }
                        } catch (Exception e) {
                        }
                        System.exit(0);
                    }
                    break;
                case 2:

                    System.out.print(" Enter the Name of the person to be searched  -  ");
                    String nam = scanner.nextLine();
                    AlinContact.findperson(nam);
                    break;
                case 3:
                    AlinContact.display();
                    break;
                case 4:
                    try {
                        FileWriter writer = new FileWriter("Alin_Contact_details.txt", true);
                        for (int i = 0; i < person_met; i++) {
                            writer.write("Name- " + person[i].getname() + " Phone- " + person[i].getphonenum()
                                    + " Email- " + person[i].getmail());
                        }
                    } catch (Exception e) {
                    }
                    System.exit(0);
                default:
                    break;
            }

        }
    }
}

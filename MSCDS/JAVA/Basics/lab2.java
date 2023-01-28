import java.util.Scanner;

// You have been asked to create a menu-driven java program to process the details 
// of a student who wishes to participate in the upcoming industrial visit trip for
// MSc DS Students.

// The program should have the options in the menu.

//     Enter a student's details [Name, Roll Number, Email, Phone Number, Preference]
//     Search and update a student's details [By keeping the roll number as a constant]
//     Search and display his/her details
//     Display all registrations

// While developing the program, do not forget to implement the concepts of 
// function overloading and constructor overloading.

class student {
    protected String Name, RollNumber, Email, PhoneNumber, Preference;

    student() {
        Name = RollNumber = Email = PhoneNumber = Preference = "";
    }

    student(String Name, String RollNumber, String Email, String PhoneNumber, String Preference) {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Preference = Preference;
    }
}

class lab2 extends student {

    static void display(student arr[], int counter){
        for (int i = 0; i < counter; i++) {
            System.out.println("Name : " + arr[i].Name);
            System.out.println("RollNumber : " + arr[i].RollNumber);
            System.out.println("Email : " + arr[i].Email);
            System.out.println("Phone Number : " + arr[i].PhoneNumber);
            System.out.println("Preference : " + arr[i].Preference);
        }
    }

    static void display(student obj){
        System.out.println("Name : " + obj.Name);
        System.out.println("RollNumber : " + obj.RollNumber);
        System.out.println("Email : " + obj.Email);
        System.out.println("Phone Number : " + obj.PhoneNumber);
        System.out.println("Preference : " + obj.Preference);
   
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        student arr[] = new student[61];
        int counter = 0;
        int continueEx = 0;
        int choice = 0;
        String upno;

        // System.out.println(Name);

        do {
            System.out.println("Options Available");
            System.out.println("1. Add new Student");
            System.out.println("2. Search and Update");
            System.out.println("3. Search and Display");
            System.out.println("4. All registrations");
            System.out.print("Choice : ");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Name, Roll Number, Email, Phone Number and Preference");
                    String Name, RollNumber, Email, PhoneNumber, Preference;
                    Name = scan.nextLine();
                    RollNumber = scan.nextLine();
                    Email = scan.nextLine();
                    PhoneNumber = scan.nextLine();
                    Preference = scan.nextLine();
                    arr[counter] = new student(Name, RollNumber, Email, PhoneNumber, Preference);
                    counter += 1;
                    break;
                case 2:
                    System.out.print("Enter the Roll number to update: ");
                    upno = scan.nextLine();
                    for (int i = 0; i < counter; i++) {
                        if (arr[i].RollNumber.equals(upno)) {
                            System.out.println("Current Preference : " + arr[i].Preference);
                            System.out.print("New Preference : ");
                            String newPref = scan.nextLine();
                            arr[i].Preference = newPref;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the Roll number to search: ");
                    upno = scan.nextLine();
                    for (int i = 0; i < counter; i++) {
                        if (arr[i].RollNumber.equals(upno)) {
                           display(arr[i]);
                        }
                    }
                    break;
                case 4:
                    display(arr, counter);
                    break;
                default:
                    System.out.println("In valid Operation");
            }

            System.out.print("Press 1 to continue : ");
            continueEx = Integer.parseInt(scan.nextLine());
        } while (continueEx == 1);

        System.out.println("Thankyou for using our Application !");
    }
}
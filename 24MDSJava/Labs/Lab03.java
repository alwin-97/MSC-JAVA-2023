/*
 * ***************************************************************************
 * Name: 
 * Register Number: 
 * Class:
 * Date :
 * ***************************************************************************
 *                     Student Record Management
 * This java program is done arround the domain of student data management in
 * an accademic setting. 
 * 
 * The main aim of the program is to understand the working of
 * 1. Classes
 * 2. Data Members / Attributes of a Class
 * 3. Member functions
 * 4. Constructors
 * 5. Objects
 * 6. Introduction to access modifiers, array of objects | object array
 * 
 */

import java.util.Scanner;

class Student{
    private String name;
    private long reg_no;
    private String email;
    private String dob;
    private int age;
    private String[][] marks;
    private int subjectCounter;

    Student(){
        /*
         * Task 1: Fill the code to initilize the variables with some default values for the attributes [Name, reg_no, email, dob and age].
         * Note: in the program you will be using DD-MM-YYYY format to store the date.
         * Note: age should not be taken as an user input
         * Task 2: For the marks attribute, you will use a string array with the 2-dimention,
         * for each of the subject, you will store these details {"Subject Name","Semester","Max Mark","Secured Mark"}. 
         * Hence here you will initialize the marks array that helps to store maximum of 10 Marks for a student.
         */
        this.name = "";
        this.email = "";
        this.dob = "";
        this.age = 0;
        this.marks = new String[10][4];
        this.subjectCounter = 0;
    }

    Student(String name, long reg_no, String email, String dob){
        this.name = name;
        this.reg_no = reg_no;
        this.email = email;
        this.dob = dob;
        /*
         * Task 1: Calculate the age with the help of the computeAge() and store in the age attribute
         * Task 2: use the same logic for the marks attribute initialization
         */
        this.age = computeAge(this.dob);
        this.marks = new String[10][4];
        this.subjectCounter = 0;
    }

    private int computeAge(String dob){
        int age = 2024 - Integer.parseInt(dob.split("-")[2]);
        /*
         * Task 1: Complete the logic to identify the age from the date of birth from the format DD-MM-YYYY
         */


        return age;
    }

    public void addMarks(String[] mark){
        /*
         * Task: add the mark for the subject to the marks array by incrementing the subjectCounter
         */

    }

    public void printStudentDetails(){
        /*
         * Task: print the student details based on all the available data
         */

    }
    
    public String getName(){
        return this.name;
    }

    public String toString(){
        /*
         * Modify this method to return all the values in the variable in coma seperated from.
         */

         return "";
    }
 }

 public class Lab03{

    static String[] studentDetails(Scanner scanner){
        String[] arr = new String[4];
        System.out.println("Enter Name");
        arr[0] = scanner.nextLine();
        System.out.println("Enter Reg. No.");
        arr[1] = scanner.nextLine();        
        System.out.println("Enter Email");
        arr[2] = scanner.nextLine();
        System.out.println("Enter DOB");
        arr[3] = scanner.nextLine();
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] mscds = new Student[82];
        int studentCounter = 0;

        /*
         * Execute the following chuck of code for some hint !
         * 
         * mscds[studentCounter] = new Student();
         * System.out.println(mscds[studentCounter].getName());
         * studentCounter+= 1;
         * mscds[studentCounter] = new Student("Alwin Joseph",1847207,"alwin.joseph@christuniversity.in","06-04-2000");
         * System.out.println(mscds[studentCounter].getName());
         * studentCounter+= 1;
         * 
         */

        /*
         * TODO: write an appropriate menu dirven program that helps me to manage the data of students of MSc Ds at CHRIST University.
         * 
         * Working of the menu driven program:
         * ----------------------------------------
         * The menu will have the following options:
         * 1. Add the details of student.
         * 2. View the detail of a students
         * 3. Search the detail of a stuent
         * 4. Exit
         * 
         * Note: Adding the Marks for a student can be kept as an optional feature after adding the basic details and searching for a student
         * 
         */
        char ch = 'y';

         do{
            System.out.println("1. Add a student");
            System.out.println("2. View all students");
            System.out.println("3. Search for a student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // adding a student
                    String[] arr = studentDetails(scanner);
                    mscds[studentCounter] = new Student(arr[0],Long.parseLong(arr[1]),arr[2],arr[3]);
                    studentCounter+=1;
                    break;
                case 2:
                    // viewing all students
                    for(int i=0;i<studentCounter;i++){
                        mscds[i].printStudentDetails();
                    }
                    break;
                case 3:
                    // searching a student
                    String name  = scanner.nextLine();
                    for(int i=0;i<studentCounter;i++){
                       if(mscds[i].getName().equals(name)){
                        mscds[i].printStudentDetails();
                        break;
                       }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice..");
                    break;
            }

            System.out.println("Do you want to continue ?");
            ch = scanner.nextLine().charAt(0);

         }while(ch=='y'||ch=='Y');


        scanner.close();
    }
 }


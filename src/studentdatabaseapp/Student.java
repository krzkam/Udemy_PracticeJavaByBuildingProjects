package studentdatabaseapp;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses=null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student fist name: ");
        this.firstName=in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName=in.nextLine();

        System.out.print("1 - Freshmen\n2- Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear=in.nextInt();


        setStudentID();
        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
    }
    //Generate an ID
    private void setStudentID(){
        //Grade level + id
        id++;
        this.studentID = gradeYear+""+id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do{
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses=courses+"\n"+course;
                tuitionBalance = tuitionBalance+costOfCourse;
            }
            else break;
        }while (true);


        System.out.println("ENROLLED IN: "+courses);
        System.out.println("TUITION BALANCE: "+tuitionBalance);
    }
    //View balance

    //Pay Tuition

    //Show status
}

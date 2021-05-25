package emailapp;

import java.security.PrivateKey;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultsPasswordLenght = 10;
    private String alternateEmail;
    private String email;
    private String companySuffix = "company.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        //Call a method asking for the department - return department
        this.department = setDepartment();
        //Call a name that returns random password
        this.password=randomPassword(defaultsPasswordLenght);
        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName+" "+this.department);
        System.out.println("Your Password is: "+this.password);
        //Combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your Email is: "+email);

    }
    //Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: \n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) return "sales";
        else if (depChoice ==2 ) return "dev";
        else if (depChoice ==3) return "acct";
        else return "";
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]password = new char[length];
        for (int i=0;i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //Set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
}

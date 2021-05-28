package bankaccountapp;

public class Checking extends Account {
    //List properties specific to a Checking account
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initDeposit){
        super(name,ssn,initDeposit);
        System.out.println("New Checking account");

    }
    //List any methods specific to the checking account
}

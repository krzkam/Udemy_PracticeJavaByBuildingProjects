package bankaccountapp;

public class Savings extends Account{
    //List properties specific to the Savings account
    int safetyDepistBoxID;
    int safetyDepisitBoxKey;

    //Constructor to initialize settings for the Saving properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name,ssn,initDeposit);
        System.out.println("New Savings account");

    }
    //List any methods specific to savings account
}

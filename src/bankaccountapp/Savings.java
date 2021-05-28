package bankaccountapp;

public class Savings extends Account{
    //List properties specific to the Savings account
    int safetyDepistBoxID;
    int safetyDepisitBoxKey;

    //Constructor to initialize settings for the Saving properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber = "1"+accountNumber;
    }
    //List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}

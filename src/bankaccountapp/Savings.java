package bankaccountapp;

public class Savings extends Account{
    //List properties specific to the Savings account
    int safetyDepostBoxID;
    int safetyDepositBoxKey;

    //Constructor to initialize settings for the Saving properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber = "1"+accountNumber;
        setSafetyDepositBox();
    }
    private void setSafetyDepositBox(){
        safetyDepostBoxID =(int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
    }
    //List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your Savings Account Features"+
                        "\n Safety Deposit Box ID "+safetyDepostBoxID+
                        "\n Safety Deposit Key "+safetyDepositBoxKey
        );
    }
}

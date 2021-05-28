package bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts
    String name;
    String ssn;
    String accountNumber;
    double balance;
    double rate;
    static int index = 10000;

    //Constructor to set base properties and initialize the account
    public Account(String name, String ssn, double initDeposit){
        this.name=name;
        this.ssn=ssn;
        this.balance=initDeposit;
        System.out.println("NAME: "+name+" SSN: "+ssn+" BALANCE: $"+balance);

        //Set account number
        index++;
        this.accountNumber=setAccountNumber();
        System.out.println("ACCOUNT NUMBER "+this.accountNumber);
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));
        return lastTwoOfSSN+uniqueID+randomNumber;
    }
    //List common methods
}

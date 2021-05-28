package bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts
    String name;
    String ssn;
    String accountNumber;
    double balance;
    double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String ssn, double initDeposit){
        this.name=name;
        this.ssn=ssn;
        balance=initDeposit;
        System.out.println("NAME: "+name+"SSN: "+ssn+"BALANCE: $"+balance);
    }
    //List common methods
}

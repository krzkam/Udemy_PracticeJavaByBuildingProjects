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
        //Set account number
        index++;
        this.accountNumber=setAccountNumber();
    }

    private String setAccountNumber(){
        //String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
        String lastTwoOfSSN = ssn.substring(ssn.length()-2);
        int uniqueID = index;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));
        return lastTwoOfSSN+uniqueID+randomNumber;
    }


    //List common methods
    public void showInfo(){
        System.out.println(
                "\nNAME: "+name+
                "\nACCOUNT NUMBER: "+accountNumber+
                "\nBALANCE: "+balance
        );
    }
}

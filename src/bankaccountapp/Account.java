package bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts

    //Constructor to set base properties and initialize the account
    public Account(String name){
        System.out.println("Name "+name);
        System.out.print("NEW ACCOUNT: ");

    }
    //List common methods
}

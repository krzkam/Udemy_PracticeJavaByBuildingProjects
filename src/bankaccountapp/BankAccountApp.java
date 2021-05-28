package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args){
        Checking chkacc1 = new Checking("Krz Kam","123456789",1500);
        Savings savacc1 = new Savings("Richy Rich","123456782",2500);

        savacc1.showInfo();
        chkacc1.showInfo();
        //Read a CSV File then create new accounts based on that data


    }
}

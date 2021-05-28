package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){
        /*
        Checking chkacc1 = new Checking("Krz Kam","123456789",1500);
        Savings savacc1 = new Savings("Richy Rich","123456782",2500);

        savacc1.compound();

        savacc1.showInfo();
        chkacc1.showInfo();
        */



        //Read a CSV File then create new accounts based on that data
        String file = "C:\\Users\\KAMINKR1\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] newAccountHolder : newAccountHolders ){
            System.out.println("NEW ACCOUNT");
            System.out.println(newAccountHolder[0]);
            System.out.println(newAccountHolder[1]);
            System.out.println(newAccountHolder[2]);
            System.out.println(newAccountHolder[3]);
        }

    }
}

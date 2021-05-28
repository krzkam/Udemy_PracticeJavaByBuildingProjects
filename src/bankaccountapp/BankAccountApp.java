package bankaccountapp;

import java.util.LinkedList;
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
        List <Account> accounts = new LinkedList<Account>();

        String file = "C:\\Users\\KAMINKR1\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] newAccountHolder : newAccountHolders ){
            String name =  newAccountHolder[0];
            String ssn =  newAccountHolder[1];
            String accountType = newAccountHolder[2];
            double initDeposit = Double.parseDouble(newAccountHolder[3]);
            //System.out.println(name+ " "+ssn+ " "+accountType+ " $"+initDeposit);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name,ssn,initDeposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name,ssn,initDeposit));
            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts){
            System.out.println("- - - - - -");
            acc.showInfo();
        }

    }
}

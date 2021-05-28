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
            String name =  newAccountHolder[0];
            String ssn =  newAccountHolder[1];
            String accountType = newAccountHolder[2];
            double initDeposit = Double.parseDouble(newAccountHolder[3]);
            //System.out.println(name+ " "+ssn+ " "+accountType+ " $"+initDeposit);
            if (accountType.equals("Savings")){
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else if (accountType.equals("Checking")){
                System.out.println("OPEN A CHECKING ACCOUNT");
            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

    }
}

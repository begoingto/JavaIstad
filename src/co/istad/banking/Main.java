package co.istad.banking;

import co.istad.banking.Rate.RielRate;
import co.istad.banking.database.Database;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*
        * Account account = new Account();
        account.setName("Dara");
        account.setNumber(9999);*/
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(888111222);
        creditCard.setPin(123);
        creditCard.setThruDate(LocalDate.now());

        if (creditCard.getNumber().equals(Database.creditCard().getNumber())){
            creditCard = Database.creditCard();
        }
        creditCard.deposit(500.50);
        //creditCard.withdraw(100.0);
        //creditCard.setLimitAmount(10000.0);
//        creditCard.withdraw();
        creditCard.showBalance();


        SavingAccount savingAccount = new SavingAccount(111222,"Begoingto",100.0);
        if (savingAccount.getNumber().equals(Database.savingAccount().getNumber())){
            savingAccount = Database.savingAccount();
        }
        savingAccount.showBalance();
    }
}

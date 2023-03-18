package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    /*private static CreditCard creditCard;

    public static CreditCard db(){
        creditCard = new CreditCard();
        creditCard.setName("Begoingto".toUpperCase());
        creditCard.setNumber(888111222);
        creditCard.setPin(123);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(3, ChronoUnit.DAYS));
        return creditCard;
    }*/


    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(888111222,"Begoingto".toUpperCase(),1000.0);
        creditCard.setPin(123);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }

    public static SavingAccount savingAccount(){
        SavingAccount savingAccount = new SavingAccount(111222,"Begoingto",100.0);
        savingAccount.setInterest(0.06);
        return savingAccount;
    }


}

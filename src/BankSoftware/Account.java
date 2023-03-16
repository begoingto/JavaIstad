package BankSoftware;

import java.util.Scanner;
import java.util.UUID;

public class Account {
    int id;
    String username;
    double total;

    private CreditCard creditCard;
    private SavingAccount savingAccount;
    private final int pin = 1234;

    public boolean verifyPin(int pin)
    {
        return this.pin==pin;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.total += creditCard.getAmount();
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.total += savingAccount.getAmount();
        this.savingAccount = savingAccount;
    }


    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public String checkAccount(Scanner input)
    {
        System.out.println("-------- please choose account to deposit --------");
        System.out.println("1. Credit Account");
        System.out.println("2. Saving Account");
        System.out.print("=> Enter account: ");
        int acc = input.nextInt();
        return acc== 1 ? CreditCard.account : SavingAccount.account;
    }

    public int inputPin(Scanner input)
    {
        System.out.print("=>Enter your pin: ");
        return input.nextInt();
    }

    public void checkPinMessage(boolean verified)
    {
        if (!verified) {
            System.out.println("*******************************************************");
            System.out.println("* \t Error \n* \t Your are wrong pin. Please try again!!!");
            System.out.println("*******************************************************");
        }
    }

    public void showInfo()
    {
        System.out.println("********* "+ this.username +" information  ********************");
        System.out.println("*\tuser ID: "+ this.id);
        System.out.println("*\tusername: "+ this.username);
        System.out.println("*\tuser pin: "+ this.pin);
        System.out.println("*\tAccount Credit ID: "+ this.creditCard.getCreditId());
        System.out.println("*\tAccount Credit Amount: "+ this.creditCard.getAmount());
        System.out.println("*\tAccount Saving ID: "+ this.savingAccount.getCreditId());
        System.out.println("*\tAccount Saving Amount: "+ this.savingAccount.getAmount());
        System.out.println("*\t Total amount: "+ this.total);
        System.out.println("******************************************************");
    }
}

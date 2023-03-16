package BankSoftware;

import java.util.Scanner;

public class SavingAccount extends Account implements AccountAction{
    private final int savingId;
    private double amount;
    public static String account = "SAVING";

    public SavingAccount(int creditId, double amount) {
        this.savingId = creditId;
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getCreditId() {
        return savingId;
    }

    @Override
    public double deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("=> Enter amount: ");
        this.amount += input.nextDouble();
        return this.amount;
    }

    @Override
    public double withdraw(double amount) {
        if (amount < this.amount){
            this.amount -= amount;
            return this.amount;
        }
        return 0;
    }

    @Override
    public void showAmount() {

    }


}

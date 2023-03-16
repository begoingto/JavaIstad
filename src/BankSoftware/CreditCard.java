package BankSoftware;

import java.util.Scanner;
import java.util.UUID;

public class CreditCard extends Account implements AccountAction{
    private final int creditId;
    private double amount;
    public static String account = "CREDIT";

    public CreditCard(int creditId, double amount) {
        this.creditId = creditId;
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
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

    public int getCreditId() {
        return creditId;
    }
}

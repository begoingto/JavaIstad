package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CreditCard extends Account {
    private Integer pin;
    private Double limitAmount;
    private LocalDate thruDate;

    public CreditCard() {}

    public CreditCard(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    protected final void deposit(Double amount) {

        if (isExpired(thruDate)) {
            super.formatMessage("Card is expired...!!!");
            return;
        }
        super.deposit(amount);
    }

    @Override
    protected final void withdraw(Double amount) {
        if (!pin.equals(Database.creditCard().getPin())) {
            super.formatMessage("Incorrect pin...!!!");
            return;
        }

        if (isExpired(thruDate)) {
            super.formatMessage("Card is expired...!!!");
            return;
        }

        if (amount > limitAmount) {
            super.formatMessage("Over the limit amount...!!!");
            return;
        }

        super.withdraw(amount);
    }

    protected final void withdraw(){
        withdraw(super.getBalance());
    }

    @Override
    protected void showBalance() {
        System.out.println("---------------------Account information---------------------");
        System.out.println("=> Account Number: "+ super.getNumber());
        System.out.println("=> Account Name: "+ super.getName());
        System.out.println("=> Account Balance: "+ String.format("%1$,.2f", super.getBalance()));
        System.out.println("=> Pin: " + this.pin);
        System.out.println("=> Thru Date: " + this.thruDate);
        System.out.println("=> Limit Amount: " + this.limitAmount);
        System.out.println("-------------------------------------------------------------");
    }
}

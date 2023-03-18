package co.istad.banking;

import java.time.LocalDate;

public abstract class Account {
    private Integer number;
    private String name;
    private Double balance;

    public Account(){

    }

    public Account(Integer number, String name, Double balance){
        this.number = number;
        this.name = name;
        this.balance= balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(Double amount) {
        if (amount < 0){
            this.formatMessage("You are kidding me!!!");
            return;
        }
        if (amount==0){
            this.formatMessage("You cannot deposit.");
            return;
        }
        this.balance += amount;
    }

    protected void withdraw(Double amount) {
        if (amount < 0){
            System.out.println("**************************************");
            System.out.println("You are kidding me!!!");
            System.out.println("**************************************");

            return;
        }
        if (amount> this.balance){
            System.out.println("**************************************");
            System.out.println("Insufficient balance.");
            System.out.println("**************************************");
            return;
        }
        this.balance -= amount;
    }

    protected abstract void showBalance();

    protected boolean isExpired(LocalDate date){
        return LocalDate.now().isAfter(date);
    }

    public void formatMessage(String message){
        System.out.println("**************************************");
        System.out.println(message);
        System.out.println("**************************************");
    }
}

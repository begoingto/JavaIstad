package co.istad.banking;

import co.istad.banking.Rate.RielRate;
import co.istad.ulit.Interest;

public class SavingAccount extends Account implements Interest{
    private Double interest;
    private Interest interestI;

    static class DefaultInterest implements Interest {
        @Override
        public Double calculate(Double amount) {
            return amount * 0.02;
        }
    }

    public SavingAccount(){
        // this.interestI = new DefaultInterest(new RielRate());
        //setInterestI(new DefaultInterest());
        setInterestI(new Interest() {
            @Override
            public Double calculate(Double amount) {
                return amount * 0.02;
            }
        });
    }

    public SavingAccount(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }

    @Override
    public Double calculate(Double amount) {
        return null;
    }

    @Override
    protected void showBalance() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$Account information$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("=> Account Number: "+ super.getNumber());
        System.out.println("=> Account Name: "+ super.getName());
        System.out.println("=> Account Balance: "+ String.format("%1$,.2f", super.getBalance()));
        System.out.println("=> Interest: "+ this.interest);
        System.out.println("=> Interest Rate: "+ getBalance());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}

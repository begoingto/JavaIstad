package BankSoftware;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Account user = new Account();
        user.id=1;
        user.username="Long Dara";
        System.out.println("************ Bank Account: "+ user.username+ "************");
        Scanner input = new Scanner(System.in);
        int pin;
        do {
            pin = user.inputPin(input);
            user.checkPinMessage(user.verifyPin(pin));
        }while (!user.verifyPin(pin));
        input.nextLine();

        CreditCard creditCard = new CreditCard(1001,15);
        user.setCreditCard(creditCard);
        SavingAccount savingAccount = new SavingAccount(1002,0);
        user.setSavingAccount(savingAccount);

        while (true){
            System.out.println("=> Please choose menu below:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show information");
            System.out.println("4. Exit");
            System.out.print("=> Enter menu option: ");
            int option = Integer.parseInt(input.nextLine());
            switch (option) {
                case 1 -> {
                    String account = user.checkAccount(input);
                    if (account.equals(CreditCard.account)) {
                        do {
                            pin = user.inputPin(input);
                            user.checkPinMessage(user.verifyPin(pin));
                        } while (!user.verifyPin(pin));
                        input.nextLine();
                        user.total += user.getCreditCard().deposit();
                    } else {
                        do {
                            pin = user.inputPin(input);
                            user.checkPinMessage(user.verifyPin(pin));
                        } while (!user.verifyPin(pin));
                        input.nextLine();
                        user.total += user.getSavingAccount().deposit();
                    }
                    System.out.println("********** Congratulation **********");
                }
                case 2 -> {
                    String acc = user.checkAccount(input);
                    System.out.print("=> Enter amount: ");
                    double money = input.nextDouble();
                    if (acc.equals(CreditCard.account)) {
                        do {
                            pin = user.inputPin(input);
                            user.checkPinMessage(user.verifyPin(pin));
                        } while (!user.verifyPin(pin));
                        input.nextLine();

                        user.total -= user.getCreditCard().withdraw(money);
                    } else {
                        do {
                            pin = user.inputPin(input);
                            user.checkPinMessage(user.verifyPin(pin));
                        } while (!user.verifyPin(pin));
                        input.nextLine();
                        user.total -= user.getSavingAccount().withdraw(money);
                    }
                    System.out.println("********** Congratulation **********");
                }
                case 3 -> user.showInfo();
                case 4 -> System.exit(0);
            }
        }


    }
}

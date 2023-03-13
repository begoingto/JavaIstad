import java.util.Scanner;

public class Worker extends Person {
    int id;
    double wage;
    double hours;

    @Override
    public void input(Scanner input) {
        System.out.print("=> Enter person Id: ");
        this.id = Integer.parseInt(input.nextLine());
        super.input(input);
        System.out.print("=> Enter person wage: ");
        this.wage = Double.parseDouble(input.nextLine());
        System.out.print("=> Enter person hours: ");
        this.hours = Double.parseDouble(input.nextLine());
    }

    public double findSalary()
    {
        return wage*hours;
    }
}

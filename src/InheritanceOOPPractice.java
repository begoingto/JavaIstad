import java.util.Scanner;

public class InheritanceOOPPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker w1 = new Worker();
        w1.input(input);
        w1.output();
        System.out.println("Wage: "+ w1.wage +", Hours: "+ w1.hours +", Her/Him salary is : "+ w1.findSalary());
    }
}

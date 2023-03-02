import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers;
        Scanner input = new Scanner(System.in);

        System.out.print("=> Enter allocation of numbers= ");
        int allocate = input.nextInt();
        numbers = new int[allocate];

        int sum = 0;

        for (int i = 0; i < allocate; i++) {
            System.out.print("=> Enter value number[" + i + "]=");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.println("************************************************");
        System.out.println("This Sum of number: " + sum);
        System.out.println("This Average of number: " + ((double) sum / allocate));
        System.out.println("************************************************");
    }
}

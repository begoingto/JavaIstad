package co.istad.exception;

import java.util.Scanner;

public class ExceptionTest {
    private static int myNum() {
        try {
            return 100;
        } catch (Exception e) {
            return 200;
        } finally {
            System.out.println("2023");
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println(myNum());
        System.out.println("-----------------------------");
        test();
        System.out.println("-----------------------------");
        try{
            checkAge(15);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void test() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter data: ");
            Integer data = Integer.parseInt(scanner.nextLine());
            System.out.println("Data is :" + data);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("You still a kid");
        }
    }
}

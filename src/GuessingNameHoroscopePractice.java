import java.util.Scanner;

public class GuessingNameHoroscopePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name -> ");
        String name = input.nextLine();
        int sum=0;

        for (int i=0; i < name.length();i++)
        {
            sum += switch (name.toLowerCase().charAt(i)){
                case 'a', 'j','s' -> 1;
                case 'b', 'k','t' -> 2;
                case 'c', 'l','u' -> 3;
                case 'd', 'm','v' -> 4;
                case 'e', 'n','w' -> 5;
                case 'f', 'o','x' -> 6;
                case 'g', 'p','y' -> 7;
                case 'h', 'q','z' -> 8;
                case 'i', 'r' -> 9;
                default -> 0;
            };
        }

        while (String.valueOf(sum).length() > 1)
        {
            int remain = sum % 10;
            int result = sum / 10;
            sum = remain + result;
        }

        System.out.println("Sum = "+ sum);
    }
}

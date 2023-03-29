package newfeatures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        int nDay = Integer.parseInt(in.nextLine());
        String day = switch (nDay){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Wrong day";
        };
        String str = """
                ***************************************
                *	The day you are type is: %s
                """.formatted(day);
        str += "**************** Thank you ************";
        System.out.printf(str);
    }
}

import java.time.*; // To import Entire Package
import java.time.format.DateTimeFormatter; // To import Package Member
public class Main {
    public static void main(String[] args) {
        // Referring to a Package Member by Its Qualified Name
        java.util.Scanner input = new java.util.Scanner(System.in); // System.in is Java compiler automatically imports

        System.out.print("=> Enter Your Name: ");
        String name = input.nextLine();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Time : "+ now.format(DateTimeFormatter.ofPattern("dd-MMMM-YYYY hh:mm a")));
        System.out.println("Hello "+ name+ ", nice to meet you.");
    }
}

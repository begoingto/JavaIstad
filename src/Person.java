import java.util.Scanner;

public class Person {
    String name;
    int age;
    char gender;


    public Person() {
    }

    public void input(Scanner input)
    {
        System.out.println("********************* Input *********************");
        System.out.print("=> Enter person name: ");
        this.name = input.nextLine();
        System.out.print("=> Enter person gender: ");
        this.gender = input.nextLine().charAt(0);
        System.out.print("=> Enter person age: ");
        this.age = Integer.parseInt(input.nextLine());
    }

    public void output()
    {
        System.out.println("********************* Output *********************");
        System.out.print("\t Person Name: "+ this.name + ", Gender: "+ gender+ ", Age: "+ this.age);
    }
}

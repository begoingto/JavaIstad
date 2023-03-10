import java.util.Scanner;

public class Product {
    static String company = "COCA COLA";
    int id;
    String name;
    double price;

    public void select()
    {
        System.out.println("============== Product Detail ==============");
        System.out.println("Product ID: "+ id);
        System.out.println("Product Name: "+ name);
        System.out.println("Product Price: "+ price);
    }


    public void insert(Scanner scanner)
    {
        System.out.println("============== Add Product ==============");

        System.out.print("Enter Product ID: ");
        id  = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Product Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        price = Double.parseDouble(scanner.nextLine());

    }
}

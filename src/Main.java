import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("=> Enter N of Product :");
        int n = Integer.parseInt(input.nextLine());
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            /**
                Product p = new Product();
                p.insert(input);
                products[i] = p;
            */
            products[i] = new Product();
            products[i].insert(input);
        }

        for (Product product: products)
        {
            product.select();
        }
    }
}

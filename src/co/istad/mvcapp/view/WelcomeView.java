package co.istad.mvcapp.view;

import co.istad.mvcapp.controller.ProductController;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;

import java.util.Scanner;
import java.util.UUID;

public class WelcomeView {
    public static Scanner input = new Scanner(System.in);
    public static void welcomeView() {
        int option;
        ProductController controller = new ProductController();
        do {
            System.out.println("""
                **************************************
                * Welcome to the MVC Application     *
                * 1. create new Product              *
                * 2. List all Products               *
                * 3. Delete Product                  *
                * 4. Edit Product                    *
                * 5. Exit               *""");
            System.out.print("=> Choose option: ");
            option = InputView.getInputNumber(new Scanner(System.in));
            switch (option) {
                case 1 -> {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("******************* Edit Product *******************");
                    System.out.print("=> Product Code: ");
                    Integer pCode = Integer.parseInt(input.nextLine());
                    System.out.print("=> Product Name: ");
                    String pName = input.nextLine();
                    System.out.print("=> Product Price In: ");
                    Double pPriceIn = Double.parseDouble(input.nextLine());
                    CreateProductDto createProductDto = new CreateProductDto(pCode, pName, pPriceIn);
                    controller.handleCreateNewProduct(createProductDto);
                }
                case 2 -> {
                    System.out.println("---------------------------------------------------------------------------");
                    ProductListView.productListView(controller.handleProductList());
                }
                case 3 -> {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.print("=> Enter UUID of product: ");
                    String id = input.nextLine();
                    controller.removeProduct(UUID.fromString(id));
                }
                case 4 -> {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.print("=> Enter UUID of product: ");
                    String id = input.nextLine();
                    controller.updateProduct(UUID.fromString(id));
                }
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid option..!");
            }
        }while (true);

    }
}

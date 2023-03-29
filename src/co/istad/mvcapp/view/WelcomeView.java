package co.istad.mvcapp.view;

import co.istad.mvcapp.controller.ProductController;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;

import java.util.Scanner;

public class WelcomeView {
    public static void welcomeView() {
        System.out.println("""
                **************************************
                * Welcome to the MVC Application     *
                * 1. create new Product              *
                * 2. List all Products               *
                * 3. Remove Product                  *
                * 4. Edit Product                    *
                * 5. Exit               *""");
        System.out.print("=> Choose option: ");
        int option = InputView.getInputNumber(new Scanner(System.in));
        ProductController controller = new ProductController();
        switch (option) {
            case 1 -> {
                CreateProductDto createProductDto = new CreateProductDto(100101, "Sting", 0.5);
                ProductDto productDto = controller.handleCreateNewProduct(createProductDto);
                System.out.println("Product is created successfully");
                System.out.println(productDto);
                ProductListView.productListView(controller.handleProductList());
            }
            case 2 -> {
                ProductListView.productListView(controller.handleProductList());
            }
            default -> System.out.println("Invalid option..!");
        }
    }
}

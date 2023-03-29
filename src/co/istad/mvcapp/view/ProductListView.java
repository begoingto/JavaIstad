package co.istad.mvcapp.view;

import co.istad.mvcapp.dto.ProductDto;
import java.util.List;

public class ProductListView {
    public static void productListView(List<ProductDto> productDtoList) {
        System.out.println("************************************************");
        System.out.println("* \t\t\t My Product List");
        System.out.println("************************************************");
        productDtoList.forEach(productDto -> {
            System.out.println("* UUID \t:"+ productDto.id());
            System.out.println("* CODE \t:"+ productDto.code());
            System.out.println("* NAME \t:"+ productDto.name());
            System.out.println("* PRINCE IN :"+productDto.priceIn());
            System.out.println("************************************************");
        });
    }
}

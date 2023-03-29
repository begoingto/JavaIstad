package co.istad.mvcapp.dao;

import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;

import java.util.function.Function;

public class ProductDtoMapper implements Function<Product, ProductDto> {
    @Override
    public ProductDto apply(Product product) {
        return new ProductDto(
                product.getId(),
                product.getCode(),
                product.getName(),
                product.getPriceIn());
    }
}
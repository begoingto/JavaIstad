package co.istad.mvcapp.dao;

import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;

import java.util.List;

public interface ProductDao {
    List<ProductDto> select();
    ProductDto insert(CreateProductDto createProductDto);
}

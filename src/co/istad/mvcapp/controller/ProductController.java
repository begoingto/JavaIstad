package co.istad.mvcapp.controller;

import co.istad.mvcapp.dao.ProductDaoImpl;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;

import java.util.List;
import java.util.UUID;

public class ProductController {
    private final ProductDaoImpl productDao;

    public ProductController() {
        productDao = new ProductDaoImpl();
    }

    public List<ProductDto> handleProductList() {
        return productDao.select();
    }

    public ProductDto handleCreateNewProduct(CreateProductDto createProductDto) {
        return productDao.insert(createProductDto);
    }

    public void removeProduct(UUID id){
        productDao.remove(id);
    }

    public void updateProduct(UUID id){
        productDao.update(id);
    }
}

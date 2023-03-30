package co.istad.mvcapp.dao;

import co.istad.mvcapp.datasource.StaticDataSource;
import co.istad.mvcapp.dto.CreateProductDto;
import co.istad.mvcapp.dto.ProductDto;
import co.istad.mvcapp.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductDaoImpl implements ProductDao {

    private final StaticDataSource staticDataSource;
    private final CreateProductDtoMapper createProductDtoMapper;
    private final ProductDtoMapper productDtoMapper;

    public ProductDaoImpl() {
        staticDataSource = new StaticDataSource();
        createProductDtoMapper = new CreateProductDtoMapper();
        productDtoMapper = new ProductDtoMapper();
    }

    @Override
    public List<ProductDto> select() {
        return staticDataSource.getProducts()
                .stream()
                .map(productDtoMapper::apply)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto insert(CreateProductDto createProductDto) {
        Product productForInsert = createProductDtoMapper.apply(createProductDto);
        staticDataSource.getProducts().add(productForInsert);
        System.out.println("""
                *******************************************
                *\t You are have been created successfully
                *******************************************
                """);
        return productDtoMapper.apply(productForInsert);
    }

    @Override
    public void remove(UUID id) {
        //var product = staticDataSource.getProducts().stream().filter(e -> e.getId().equals(id)).findFirst();
        //staticDataSource.getProducts().remove(product);

        List<Product> newProduct = staticDataSource.getProducts()
                .stream()
                .filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return !product.getId().equals(id);
                    }
                }).collect(Collectors.toList());
        staticDataSource.setProducts(newProduct);
        System.out.println("""
                *******************************************
                *\t You are have been delete successfully
                *******************************************
                """);
    }

    @Override
    public void update(UUID id) {
        ArrayList<Product> products = new ArrayList<>(staticDataSource.getProducts());
        var product = products.stream().filter(e -> e.getId().equals(id)).findFirst().get();
        System.out.println("******************** Default *******************");
        System.out.println("* UUID \t:"+ product.getId());
        System.out.println("* CODE \t:"+ product.getCode());
        System.out.println("* NAME \t:"+ product.getName());
        System.out.println("* PRINCE IN :"+product.getPriceIn());
        System.out.println("************************************************");
        System.out.println("******************* Edit Product *******************");
        Scanner input = new Scanner(System.in);
        System.out.print("=> Enter Name: ");
        product.setName(input.nextLine());
        System.out.print("=> Enter Price In: ");
        product.setPriceIn(Double.parseDouble(input.nextLine()));
        products.set(products.indexOf(product),product);
        staticDataSource.setProducts(products);
        System.out.println("""
                *******************************************
                *\t You are have been updated successfully
                *******************************************
                """);
    }
}

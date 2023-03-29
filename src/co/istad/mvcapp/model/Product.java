package co.istad.mvcapp.model;

import java.util.UUID;

// POJO
public class Product {
    private UUID id;
    private String name;
    private Integer code;
    private Double priceIn;

    public Product() {}

    public Product(UUID id, Integer code,String name,  Double priceIn) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.priceIn = priceIn;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", priceIn=" + priceIn +
                '}';
    }
}

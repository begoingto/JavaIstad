package co.istad.mvcapp.dto;

import java.util.UUID;

public record  ProductDto(UUID id, Integer code, String name, Double priceIn) {
}

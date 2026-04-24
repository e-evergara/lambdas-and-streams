package co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.impl;

import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.model.Product;
import co.com.ecosoft.lambdas.and.streams.fundamentals.generic.services.DatabaseService;

public class ProductServices implements DatabaseService<Product> {
    @Override
    public Product getById(long id) {
        return Product.builder()
                .id(id)
                .name("Product " + id)
                .price(100.0 * id)
                .build();
    }

    @Override
    public java.util.List<Product> getAllRecords() {
        return java.util.Arrays.asList(
                Product.builder().id(1l).name("Product 1").price(100.0).build(),
                Product.builder().id(2l).name("Product 2").price(200.0).build(),
                Product.builder().id(3l).name("Product 3").price(300.0).build());
    }

}

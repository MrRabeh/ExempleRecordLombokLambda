package com.exempleRecord.lombok.gestion.implementation;

import com.exempleRecord.lombok.gestion.CatalogueProduct;
import com.exempleRecord.lombok.model.Product;
import lombok.val;

import java.util.HashSet;
import java.util.stream.Collectors;

public class ProductManager implements CatalogueProduct {

    public static final String NAME_PRICE_QUANTITY = "NAME  |PRICE |Quantity |";
    public static final String PIPE = "|";

    public static final String SAUTE_LIGNE = "\n";

    private HashSet<Product> products = new HashSet<>();
    @Override
    public Product addProduct(String name, double price, int quantity) {
        val product = Product.builder().name(name).price(price).quantity(quantity).build();
        products.add(product);
        return product;
    }

    @Override
    public String printShopProduct() {
        // use lambda and StringBuilder
        StringBuilder builder = new StringBuilder();

        builder.append(NAME_PRICE_QUANTITY + SAUTE_LIGNE);
        products.stream()
                .map(product -> builder.append(product.name() + PIPE + product.price() + PIPE + product.quantity() + SAUTE_LIGNE))
                .collect(Collectors.joining());// join StringBuilder

        return builder.toString();
    }
}

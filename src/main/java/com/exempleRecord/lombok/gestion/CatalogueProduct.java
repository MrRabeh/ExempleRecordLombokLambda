package com.exempleRecord.lombok.gestion;

import com.exempleRecord.lombok.model.Product;

public interface CatalogueProduct {

    public Product addProduct(String name,double price,int quantity);
    public String printShopProduct();
}

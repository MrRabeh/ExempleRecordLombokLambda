package com.exempleRecord.lombok;


import com.exempleRecord.lombok.gestion.implementation.ProductManager;
import lombok.val;

public class Main {

    // publication dand GIT

    public static void main(String[] args) {

        val manager = new ProductManager();

        //ADD product 1
        manager.addProduct("product 1",2,5);

        //ADD product 2
        manager.addProduct("product 2",100,10);

        System.out.println(manager.printShopProduct());

        }
}
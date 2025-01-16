package org.example.model;

import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Chocolate", 20, "Feel Good"),
                new Coke("Coke", 30, "Chocolate and fruit options"),
                new Bread("Bread", 5, "Our Varieties")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
            System.out.println("#######################################");
        }

    }
}
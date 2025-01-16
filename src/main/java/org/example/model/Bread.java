package org.example.model;

public class Bread extends ProductForSale {


    public Bread(String type, double price, String description){
        super(type, price, description);

    }



    public void showDetails(){
        System.out.println("Type: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());

    }
}

package org.example.model;

public  class Coke extends ProductForSale {

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails(){
        System.out.println("Type: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
    }
}

package com.futurelabs.poo.mguarniz.semana32;

public class Product {
    private String description;
    private double price;

    public Product() {}

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected String showInformation() {
        return "Descripcion: " + description + "\nPrecio: S/. " + price;
    }
}

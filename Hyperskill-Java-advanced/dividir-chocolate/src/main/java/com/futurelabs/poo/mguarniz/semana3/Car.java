package com.futurelabs.poo.mguarniz.semana3;

import java.time.LocalDateTime;
import java.util.Date;

public class Car {
    private String brand;
    private String model;
    private Date year;

    public Car() { }

    public Car(String brand, String model, Date year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto [Marca=" + brand + ", modelo=" + model + ", año=" + year.getYear() + "]";
    }
}

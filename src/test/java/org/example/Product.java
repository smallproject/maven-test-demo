package org.example;

import org.junit.jupiter.api.extension.Extensions;


public class Product {
    private String name;
    private double value;
    private double percentage;

    public static void getBTWPercentage() {

    }

    public void getBTWAmount() {

    }

    public Product(String name, double value, double percentage) {
        this.name = name;
        this.value = value;
        this.percentage = percentage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

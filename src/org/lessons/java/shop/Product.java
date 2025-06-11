package org.lessons.java.shop;

public class Product {
    int code;
    String name;
    String description;
    float price;
    int iva = 22;

    public void setCode() {
        this.code = (int) (Math.random() * 1000) + 1;
    }

    public void setPrice() {
        this.price = (float) Math.round((Math.random() * 10000) + 1 * 100) / 100;
    }

    public float setFullPrice() {
        return Math.round((price + (price * iva / 100)) * 100) / 100f;
    }

    public String setFullName() {
        return this.code + "-" + this.name;
    }
}

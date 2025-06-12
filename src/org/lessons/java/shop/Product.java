package org.lessons.java.shop;

public class Product {
    private int code;
    private String name;
    private String description;
    private float price;
    private int iva = 22;

    Product(int code) {
        this.code = code;
    }

    Product(int code, String name, String description, float price, int iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public float FullPrice() {
        return Math.round((price + (price * iva / 100)) * 100) / 100f;
    }

    public String FullName() {
        return this.code + "-" + this.name;
    }
}

package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner inputName = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto: ");
        product.name = inputName.nextLine();
        inputName.close();
        product.setCode();
        product.setPrice();
        product.setFullPrice();
        product.setFullName();
        System.out.println(product.code);
        System.out.println(product.price);
        System.out.println(product.setFullPrice());
        System.out.println(product.setFullName());
    }
}

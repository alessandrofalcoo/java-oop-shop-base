package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        Scanner inputCode = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        System.out.println("Inserisci il codice del prodotto");
        int codice = inputCode.nextInt();
        System.out.println("Inserisci il nome del prodotto: ");
        String nome = inputName.nextLine();
        System.out.println("Inserisci il prezzo del prodotto");
        float price = inputPrice.nextFloat();
        Product product = new Product(codice);
        product.setName(nome);
        product.setPrice(price);
        inputCode.close();
        inputName.close();
        inputPrice.close();
        /*
         * System.out.println(product.getCode());
         * System.out.println(product.getPrice());
         */ System.out.println(product.FullPrice());
        System.out.println(product.FullName());
    }
}

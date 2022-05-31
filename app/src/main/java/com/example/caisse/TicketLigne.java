package com.example.caisse;

public class TicketLigne {
    private int numberProducts  ;
    private String nameProduct ;
    private int price ;

    public TicketLigne(int numberProducts, String nameProduct, int price) {
        this.numberProducts = numberProducts;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getTotalPrice(){
        return numberProducts * price ;
    }

    public int getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(int numberProducts) {
        this.numberProducts = numberProducts;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

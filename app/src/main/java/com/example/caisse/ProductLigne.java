package com.example.caisse;

public class ProductLigne {
    private  int id ;
    private String name ;
    private int price ;

    public Integer getPrice() {
        return price;
    }

    public ProductLigne(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

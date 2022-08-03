package com.example.khadok.Models;

public class MainModel {
    int image;
    String name,price,description,customerid;



    public MainModel(int image, String name, String price, String description, String customerid) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
        this.customerid = customerid;
    }
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

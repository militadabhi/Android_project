package com.example.individualproject;

public class makeup {
    private int image;
    private double price;
    private String name;
    private String discription;

    public makeup(int image,double price, String name, String discription) {
        this.image=image;
        this.price = price;
        this.name = name;
        this.discription = discription;
    }

    public makeup(){

    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}

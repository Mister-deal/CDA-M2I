package com.example.exo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    private int stock;

    private double price;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String urlImg;

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Product(String name, int stock, double price, Date date, String urlImg) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.date = date;
        this.urlImg = urlImg;
    }

    public Product() {
    }

    public Product(String urlImg) {
        this.urlImg = urlImg;
    }

    public Product(String name, int stock, double price, Date date) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", date=" + date +
                ", urlImg='" + urlImg + '\'' +
                '}';
    }
}

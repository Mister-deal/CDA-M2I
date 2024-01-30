package org.example.exo4to6;

import org.example.exception.QualityException;

import java.time.LocalDate;

public class Product {

    private String product;
    private int sellIn;
    private int quality;

    public String getProduct() {
        return product;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void update() throws QualityException {
        if(quality > 0){
            if(sellIn > 0){
                setSellIn(sellIn - 1);
            }
            setQuality(quality - 1);
        }
        if(quality > 50 || quality < 0){
            throw new QualityException();
        }

    }
}

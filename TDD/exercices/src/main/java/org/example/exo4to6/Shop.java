package org.example.exo4to6;

import org.example.exception.QualityException;

public class Shop {
    public void update(Product product) {
        int decreaseQualityNumber = 0;
        if(product.getQuality() > 50 || product.getQuality() < 0)
            throw new QualityException();
        if(product.getType().equals("laitier")) {
            if(product.getName().equals("brie vielli")) {
                decreaseQualityNumber = -1;
            }
            else {
                if(product.getSellIn() > 0) {
                    decreaseQualityNumber = 2;
                }
                else {
                    if(product.getQuality() > 4) {
                        decreaseQualityNumber = 4;
                    }else {
                        decreaseQualityNumber = product.getQuality();
                    }
                }
            }
        } else {
            if(product.getSellIn() > 0) {
                decreaseQualityNumber = 1;
            } else {
                if(product.getQuality() > 2) {
                    decreaseQualityNumber = 2;
                } else {
                    decreaseQualityNumber = product.getQuality();
                }
            }
        }

        product.setQuality(product.getQuality() - decreaseQualityNumber);
        product.setSellIn(product.getSellIn()-1);
    }
}

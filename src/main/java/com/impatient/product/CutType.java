package com.impatient.product;

/**
 * Created by vashishta on 8/8/16.
 */
public enum CutType {

    LEGS(20.00), LIVER(15.00);

    private Double price;

    private CutType (Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}

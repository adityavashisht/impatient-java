package com.impatient.product;

/**
 * Created by vashishta on 8/8/16.
 */
public class MeatDriver {


    public static void main(String[] args) {

        Meat meat = new Meat(MeatProduct.CHICKEN_LEVER);


        Double price = meat.getMeatProduct().getCutType().getPrice();

        System.out.println(price);
    }

}

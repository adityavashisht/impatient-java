package com.impatient.spring;

import com.impatient.legacy.Ingredient;

/**
 * Created by vashishta on 8/16/16.
 */
public class DicedChopper implements Chopper {
    @Override
    public boolean chop(Ingredient ingredient) {
        System.out.println("Diced....");
        return false;
    }
}

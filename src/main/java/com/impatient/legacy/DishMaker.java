package com.impatient.legacy;

import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class DishMaker {

    private Chopper chopper;

    public DishMaker (Chopper chopper) {
        this.chopper = chopper;
    }

    public Dish makeDish(List<Ingredient> ingredientList) {
        for(Ingredient ingredient : ingredientList) {
            if(ingredient instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) ingredient;
                if(vegetable!=null && vegetable.isChop()) {

                    chopper.chop(ingredient);
                }
            }

        }
        return new Dish();
    }
}

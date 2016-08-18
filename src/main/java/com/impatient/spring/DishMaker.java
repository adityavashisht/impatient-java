package com.impatient.spring;

import com.impatient.legacy.Ingredient;
import com.impatient.legacy.Vegetable;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class DishMaker implements InitializingBean {

    private Chopper chopper;


    public DishMaker (Chopper chopper) {
        this.chopper = chopper;
    }


    private Mixer mixer;


    public void setMixer(Mixer mixer) {
        this.mixer = mixer;
    }

    public Dish makeDish(List<Ingredient> ingredientList) {
        System.out.println("Making a delicious dish...");
        for(Ingredient ingredient : ingredientList) {
            if(ingredient instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) ingredient;
                if(vegetable!=null && vegetable.isChop()) {

                    chopper.chop(ingredient);
                }
                // Mix the stuff
                mixer.mix(ingredient);
            }

        }
        return new Dish();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (mixer == null) {

            throw new IllegalArgumentException("Missing mixer...abort");
        }
    }
}

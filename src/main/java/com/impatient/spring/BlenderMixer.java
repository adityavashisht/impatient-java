package com.impatient.spring;

import com.impatient.legacy.Ingredient;

/**
 * Created by vashishta on 8/17/16.
 */
public class BlenderMixer implements Mixer {
    @Override
    public void mix(Ingredient ingredient) {
        System.out.println("Blending...." + ingredient.getName());
    }
}

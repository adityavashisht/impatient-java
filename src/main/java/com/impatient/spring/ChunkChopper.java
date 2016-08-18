package com.impatient.spring;

import com.impatient.legacy.Ingredient;

/**
 * Created by vashishta on 8/16/16.
 */
public class ChunkChopper implements Chopper {

    public boolean chop (Ingredient ingredient) {
        System.out.println("Chopping chunks of " + ingredient.getName());
        return true;
    }

    public void init() {
        System.out.println("Initializing.....");
    }

    public void destroy() {
        System.out.println("Destroying.....");
    }
}

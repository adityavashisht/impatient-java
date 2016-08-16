package com.impatient.legacy;

/**
 * Created by vashishta on 8/16/16.
 */
public class ChunkChopper implements Chopper {

    public boolean chop (Ingredient ingredient) {
        System.out.println("Chunks....");
        return true;
    }
}

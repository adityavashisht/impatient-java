package com.impatient.legacy;

import com.impatient.spring.ChunkChopper;
import com.impatient.spring.DishMaker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class KitchenDemo {

    public static void main(String[] args) {
        ChunkChopper chunkChopper = new ChunkChopper();
        DishMaker dishMaker = new DishMaker(chunkChopper);

        Vegetable tomato = new Vegetable();
        tomato.setChop(true);

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(tomato);

        dishMaker.makeDish(ingredientList);
    }
}

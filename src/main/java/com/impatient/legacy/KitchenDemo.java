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

        Vegetable vegetable = new Vegetable();
        vegetable.setChop(true);
        vegetable.setName(VegetableType.TOMATO.name());
        vegetable.setVegetableType(VegetableType.TOMATO);

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(vegetable);

        dishMaker.makeDish(ingredientList);
    }
}

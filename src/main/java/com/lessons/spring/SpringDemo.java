package com.lessons.spring;

import com.impatient.legacy.Ingredient;
import com.impatient.legacy.Vegetable;
import com.impatient.spring.DishMaker;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class SpringDemo {


    public static void main(String [] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/spring-kitchen.xml"});

        DishMaker dishMaker = (DishMaker) context.getBean("dishMaker");

        Vegetable tomato = new Vegetable();
        tomato.setChop(true);
        tomato.setName("Tomato");

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(tomato);

        dishMaker.makeDish(ingredientList);

       /* ChunkChopper chunkChopper = (ChunkChopper) context.getBean("chunkChopper");
        System.out.println(chunkChopper);
        chunkChopper.chop(tomato);
        chunkChopper.destroy();

        ChunkChopper chunkChopperTwo = (ChunkChopper) context.getBean("chunkChopper");
        System.out.println(chunkChopperTwo);
        chunkChopperTwo.chop(tomato);*/


    }
}

package com.impatient.legacy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 8/16/16.
 */
public class SpringKitchenDemo {


    public static void main(String [] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/spring-kitchen.xml"});

        DishMaker dishMaker = (DishMaker) context.getBean("dishMaker");

        Vegetable tomato = new Vegetable();
        tomato.setChop(true);
        tomato.setName("Tomato");

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(tomato);

        dishMaker.makeDish(ingredientList);


    }
}

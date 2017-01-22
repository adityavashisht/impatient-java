package com.com.lerningjava.jan2017.looping;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Ady on 1/22/17.
 */
public class LoopingSample {


    private static List<String> myCollection = new ArrayList<>();

    static {
        myCollection.add("Aditya");
        myCollection.add("Test");
    }

    public static void main(String[] args) {


        // Lambda
        myCollection.forEach(value -> {


            System.out.println(value);

        });

        // For loop
        for (String value : myCollection) {
            if (value.startsWith("T")) continue;
            System.out.println(value);
        }

        // Legacy
        for (int index = 0; index < myCollection.size(); index++) {
            String value = myCollection.get(index);
            System.out.println(value);
        }

        int index = 0;

        while (index < myCollection.size()) {
            String value = myCollection.get(index);
            System.out.println(value);
            index++;

        }

        index = 0;

        do {
            String value = myCollection.get(index);
            System.out.println(value);
            index++;

        }
        while (index < myCollection.size());
    }


}

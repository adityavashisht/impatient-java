package com.impatient.concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vashishta on 8/15/16.
 */
public class SimpleThread {

    public static void main(String[] args) {

        Runnable r = () -> {

            for (int index = 0; index < 100; index++) {

                System.out.println("Test");
            }

        };

        Runnable runnableAnonymous = new Runnable() {
            @Override
            public void run() {
                System.out.print("Anonymous");
            }
        };

        Runnable anotherR = () -> {

            for (int index = 0; index < 50; index++) {

                System.out.println("Another R Test");
            }

        };

        Runnable three = () -> {

            for (int index = 0; index < 100; index++) {

                System.out.println("Test");
            }

        };

        Thread t = new Thread(r);
        t.start();

        Thread anotherT = new Thread(anotherR);

        anotherT.start();




        System.out.println("Starting thread via executor service");

        ExecutorService executorService = Executors.newFixedThreadPool(300);
        executorService.submit(r);
        executorService.submit(anotherR);
        executorService.submit(three);

        System.out.println("Ending thread via executor service");


    }
}

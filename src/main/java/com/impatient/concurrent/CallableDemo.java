package com.impatient.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by vashishta on 8/15/16.
 */
public class CallableDemo {


    public static void main(String [] args) {

        Callable<String> myCallable = () -> "Hello";



        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(myCallable);

        try {
            String myFuture = myCallable.call();
            System.out.println(myFuture);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

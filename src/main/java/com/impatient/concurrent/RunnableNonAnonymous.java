package com.impatient.concurrent;

/**
 * Created by vashishta on 8/24/16.
 */
public class RunnableNonAnonymous implements Runnable {
    @Override
    public void run() {
        System.out.println("Not anonymous");
    }
}

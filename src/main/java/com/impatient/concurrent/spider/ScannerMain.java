package com.impatient.concurrent.spider;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by vashishta on 8/24/16.
 */
public class ScannerMain {

    public static void main(String [] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new ScannerOne());
        service.submit(new ScannerTwo());

        Object returnValue = null;
        ScannerOneCallable scannerOneCallable = new ScannerOneCallable();

        ExecutorService callableService = Executors.newFixedThreadPool(10);

        try {
            returnValue = callableService.submit(new ScannerOneCallable());
            System.out.println("Callable returned a value " + returnValue);
        }
        catch (Exception e) {

        }
    }
}

package com.com.springexample.beans;

import org.springframework.stereotype.Component;

/**
 * Created by aditya.vashisht on 2/2/17.
 */
@Component
public class DependencyLookup {

    public void lookUp() {
        System.out.println("I was looked up");
    }
}

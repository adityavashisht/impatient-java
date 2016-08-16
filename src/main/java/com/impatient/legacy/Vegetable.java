package com.impatient.legacy;

/**
 * Created by vashishta on 8/16/16.
 */
public class Vegetable extends Ingredient {

    private String name;

    private boolean chop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChop() {
        return chop;
    }

    public void setChop(boolean chop) {
        this.chop = chop;
    }
}

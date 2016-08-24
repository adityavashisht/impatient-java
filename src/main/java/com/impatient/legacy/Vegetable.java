package com.impatient.legacy;

/**
 * Created by vashishta on 8/16/16.
 */
public class Vegetable implements Ingredient, Decoration {

    private String name;

    private boolean chop;

    private VegetableType vegetableType;

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isChop() {
        return chop;
    }

    public void setChop(boolean chop) {
        this.chop = chop;
    }

    @Override
    public void decorate() {
        if (enabled()) {
        // do decoration
        }
    }


    @Override
    public boolean enabled() {
        return false;
    }
}

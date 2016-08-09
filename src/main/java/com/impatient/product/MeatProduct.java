package com.impatient.product;

/**
 * Created by vashishta on 8/8/16.
 */
public enum MeatProduct {


    CHICKEN_LEGS(MeatType.CHICKEN, CutType.LEGS, "CHICKEN_LEGS", false),
    CHICKEN_LEVER(MeatType.CHICKEN, CutType.LIVER, "CHICKEN_LEVER", true);


    private CutType cutType;
    private MeatType meatType;
    private String name;
    private boolean active;

    private MeatProduct(MeatType meatType, CutType cutType, String name, boolean active) {
        this.meatType = meatType;
        this.cutType = cutType;
        this.name = name;
        this.active = active;
    }

    public CutType getCutType() {
        return cutType;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public MeatType getMeatType() {
        return meatType;
    }
}

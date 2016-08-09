package com.impatient.species.human;

/**
 * Created by vashishta on 8/5/16.
 */
public enum Gender {

    MALE ("MALE", 30, 100),FEMALE("FEMALE", 30, 100);

    private String type;
    private Integer maxAge;
    private Integer minAge;

    private Gender(String type, Integer minAge, Integer maxAge) {
        this.type = type;
        this.maxAge= maxAge;
        this.minAge = minAge;
    }

    public String getType() {
        return type;
    }
}

package com.impatient.species.human;

import com.impatient.species.AbstractSpecies;
import com.impatient.species.InterfaceSpecies;
import com.impatient.species.Lifespan;

/**
 * Created by vashishta on 8/5/16.
 */

// implements = is-a relation

public class Human implements InterfaceSpecies, Lifespan {

    // has-a
    private Race race;

    // has-a
    private Gender gender;


    /**
     * Custom species with a known race
     *
     * @param race
     */
    public Human(Race race) {
        this.race = race;
    }


    /**
     * @param race
     * @param gender
     */
    public Human(Race race, Gender gender) {
        this.race = race;
        this.gender = gender;
    }

    public Human() {

    }

    public String getRace() {
        return race.name();
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String breathe() {
        return "Breathe Human";
    }

    @Override
    public void born() {

    }

    @Override
    public void die() {

    }
}

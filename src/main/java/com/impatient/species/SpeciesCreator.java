package com.impatient.species;

import com.impatient.species.cat.Cat;
import com.impatient.species.human.Gender;
import com.impatient.species.human.Human;
import com.impatient.species.human.Race;

/**
 * Created by vashishta on 8/5/16.
 */
public class SpeciesCreator {

    public static void main(String[] args) {


        InterfaceSpecies species = new Human(Race.ASIAN);

        species = new Cat();

        String race = "";

       /* if (species instanceof Human) {

            Human human = (Human) species;
            race = human.getRace();
        }

        if(species instanceof Cat) {
            System.out.println(species.breathe());

        }*/

        System.out.println(species.breathe());

        System.out.println(race);

        Human humanWithGender = new Human(Race.ASIAN, Gender.FEMALE);

        String raceAndGender = humanWithGender.getRace() + "-" + humanWithGender.getGender().name();

        System.out.println(raceAndGender);

        Human humanNoRaceOrGender = new Human();
        //System.out.println(humanNoRaceOrGender.getGender().name());

    }
}

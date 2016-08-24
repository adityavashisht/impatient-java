package com.impatient.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 8/19/16.
 */
public class ProfileDriver {

    public static void main(String[] args) {
        ProfileService profileService = new ProfileServiceImpl();
        List<String> names = new ArrayList<>();
        names.add("ADY");
        names.add("GEETHA");
        names.add("SUKHCHAIN");
        names.add("ADY");
        names.add("KIRAN");

        boolean allow = true;

        int counter = 0;

        for (String name : names) {
            try {
                if(allow) {
                    String value = profileService.create(name);
                    System.out.println(value);
                }
            } catch (ProfileException pe) {
                System.out.println("Error " + pe.getMessage());
                //allow = false;
                counter++;
            }
            finally {

            }

        }

        System.out.println("Number of duplicated " + counter);
    }
}

package com.impatient.ch07;

import com.impatient.immutable.UserProfile;
import com.impatient.product.Meat;

import java.util.*;

/**
 * Created by vashishta on 8/12/16.
 */
public class ListSample {

    private static final int MAX_VALUE = 100;

    public static final Map<String, String> weekMap = new HashMap<>();

    static {


        weekMap.put("M", "MONDAY");
        weekMap.put("T", "TUESDAY");
    }

    public static void main(String[] args) {


        List<String> myStringList = new ArrayList<>(10);

        myStringList.add(null);
        myStringList.add("Aditya");
        myStringList.add(null);
        myStringList.add("Another Name");

        for (String value : myStringList) {
            //System.out.println(value);
        }


        Map<String, String> myWeekMap = ListSample.weekMap;

        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("Aditya");
        myHashSet.add("Aditya");

        for (String value : myHashSet) {
            //System.out.println(value);
        }


        Set<UserProfile> userProfiles = new HashSet<>();

        UserProfile profile = new UserProfile("Aditya", "123");
        UserProfile anotherProfile = new UserProfile("Aditya", "123");

        userProfiles.add(profile);
        userProfiles.add(anotherProfile);

        for (UserProfile userProfile : userProfiles) {
            System.out.println(userProfile.getEmail());
        }


        MockInterface mockInterface = new MockInterface() {
            @Override
            public void methodA() {

            }

            @Override
            public void methodB() {

            }
        };


    }
}

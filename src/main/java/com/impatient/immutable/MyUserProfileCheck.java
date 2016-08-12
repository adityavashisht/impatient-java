package com.impatient.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vashishta on 8/12/16.
 */
public class MyUserProfileCheck {


    public static void main(String [] args) {

        Map<UserProfile, String> userProfileMap = new HashMap<>();

        UserProfile userProfile = new UserProfile("Aditya", "1223232");
        UserProfile userProfileSecond = new UserProfile("Siji", "1223232");

        userProfileMap.put(userProfile, "ADY");
        userProfileMap.put(userProfileSecond, "SIJI");


        Set<UserProfile> keySet = userProfileMap.keySet();

        for(UserProfile profile : keySet) {
            String value = userProfileMap.get(profile);
            System.out.println(value);
        }


    }

}

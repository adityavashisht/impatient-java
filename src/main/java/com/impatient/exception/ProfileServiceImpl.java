package com.impatient.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vashishta on 8/19/16.
 */
public class ProfileServiceImpl implements ProfileService {

    private static Map<String, String> profileMap = new HashMap<>();

    @Override
    public String create(String name) throws ProfileException {

        String value = profileMap.get(name);
        if (value != null) {
            throw new ProfileException("What are you doing?", new IllegalArgumentException("Bad Argument"));
        }
        profileMap.put(name, name);


        return name;
    }


}

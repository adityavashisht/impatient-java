package com.impatient.immutable;

/**
 * Created by vashishta on 8/9/16.
 */
public final class UserProfile {

    private final String email;
    private final String phone;

    public UserProfile(String e, String p) {
        email = e;
        phone = p;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

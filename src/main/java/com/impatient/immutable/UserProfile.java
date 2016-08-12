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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile)) return false;

        UserProfile that = (UserProfile) o;

        if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) return false;
        return getPhone() != null ? getPhone().equals(that.getPhone()) : that.getPhone() == null;

    }

    @Override
    public int hashCode() {
        int result = getEmail() != null ? getEmail().hashCode() : 0;
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }
}

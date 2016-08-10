package com.impatient.registration;

/**
 * Created by vashishta on 8/9/16.
 */
public class RegistrationException extends RuntimeException {

    private String message;

    public RegistrationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

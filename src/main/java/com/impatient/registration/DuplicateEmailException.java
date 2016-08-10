package com.impatient.registration;

/**
 * Created by vashishta on 8/9/16.
 */
public class DuplicateEmailException extends Exception {

    private String message;

    public DuplicateEmailException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}

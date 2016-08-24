package com.impatient.exception;

/**
 * Created by vashishta on 8/19/16.
 */
public class ProfileException extends Exception {

    private String message;

    public ProfileException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

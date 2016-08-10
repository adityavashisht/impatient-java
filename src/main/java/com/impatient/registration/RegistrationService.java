package com.impatient.registration;

/**
 * Created by vashishta on 8/9/16.
 */
public interface RegistrationService {

    Long doRegister(Profile profile) throws DuplicateEmailException;
}

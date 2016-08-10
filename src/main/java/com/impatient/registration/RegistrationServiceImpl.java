package com.impatient.registration;

/**
 * Created by vashishta on 8/9/16.
 */
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public Long doRegister(Profile profile) throws DuplicateEmailException {
        System.out.println("registering...");

        throw new RegistrationException("oops");
    }
}

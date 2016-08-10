package com.impatient.registration;

/**
 * Created by vashishta on 8/9/16.
 */
public class RegistrationDriver {

    public static void main(String[] args) {

        RegistrationService service = new RegistrationServiceImpl();
        try {
            Long id = service.doRegister(new Profile());
        } catch (DuplicateEmailException ex) {

        }
        catch (Exception ex) {

        }
        finally {

        }
    }
}

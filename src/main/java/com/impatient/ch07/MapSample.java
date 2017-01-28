package com.impatient.ch07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ady on 1/28/17.
 */
public class MapSample {




    public static void main(String [] args) {

        Map<Person, Address> personAddressMap = new HashMap<>();

        Person p = new Person();
        p.setFirtName("John");
        p.setLastName("Test");

        Address address = new Address();
        address.setStreet("Fairfax");


        Person anotherP = new Person();
        anotherP.setFirtName("John");
        anotherP.setLastName("Shillingfod");

        Address anotherA = new Address();
        anotherA.setStreet("Loudoun");


        personAddressMap.put(p, address);
        personAddressMap.put(anotherP, anotherA);


        Set<Person> keys = personAddressMap.keySet();
        for(Person key: keys) {
            Address value = personAddressMap.get(key);
            System.out.println("Key: "+ key + " Value " + value);
        }


    }
}

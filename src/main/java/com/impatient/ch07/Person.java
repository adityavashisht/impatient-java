package com.impatient.ch07;

/**
 * Created by Ady on 1/28/17.
 */
public class Person {
    String firtName;
    String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!firtName.equals(person.firtName)) return false;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firtName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
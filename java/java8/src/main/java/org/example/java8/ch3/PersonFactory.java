package org.example.java8.ch3;

public interface PersonFactory<P extends Person> {
    P createPerson(String firstName, String lastName);
}

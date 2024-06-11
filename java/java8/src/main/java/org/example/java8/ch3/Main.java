package org.example.java8.ch3;

public class Main {
    public static void main(String[] args) {
        PersonFactory<Person> factory = Person::new;
        Person person = factory.createPerson("Yuhe", "Liu");
        System.out.println(person);
    }
}

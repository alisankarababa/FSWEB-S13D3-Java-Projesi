package com.workintech.classes;

public class Person {

    int id;
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNumber;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int id, String email, String phoneNumber) {
        this(firstName, lastName, age);
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return 13 <= age && age <= 19;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

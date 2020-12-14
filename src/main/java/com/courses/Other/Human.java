package com.courses.Other;

public class Human {

    public String FirstName;
    public String LastName;

    public Human(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void displayName() {
        System.out.println(FirstName + " " + LastName);

    }

    public static void main(String[] args) {
        Human Personality = new Human("Ivan", "Ivanov");
        Personality.displayName();
    }
}
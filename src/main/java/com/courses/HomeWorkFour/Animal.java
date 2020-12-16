package com.courses.HomeWorkFour;

public class Animal {
    String food;
    String location;
    String name;
    int age;

    public Animal(String food, String location,String name, int age) {
        this.food = food;
        this.location = location;
        this.name = name;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("is making noise");
    }

    public void eat() {
        System.out.println("is eating");
    }

    public void sleep() {
        System.out.println("is sleeping");
    }
}

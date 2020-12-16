package com.courses.HomeWorkFour;

public class Horse extends Animal {

    String furColor;
    int runSpeed ;

    public Horse(String food, String location, String name, int age) {
        super(food, location, name,age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");

    }
    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }
}
package com.courses.HomeWorkFour;

public class Dog extends Animal {
    String furColor;
    String breed;

    public Dog(String food, String location, String name, int age) {
        super(food, location, name, age);
    }


    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
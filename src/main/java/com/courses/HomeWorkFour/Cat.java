package com.courses.HomeWorkFour;

public class Cat extends Animal {

    String furColor;

    public Cat(String food, String location, String name, int age) {
        super(food, location, name, age);

    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

}
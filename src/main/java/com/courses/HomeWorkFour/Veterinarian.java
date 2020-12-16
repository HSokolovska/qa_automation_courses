package com.courses.HomeWorkFour;

public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.food + "" + animal.location + " " + animal.age + " " + animal.name);
    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Fish", "Kyiv", "Barsik", 2),
                new Dog("Meat", "Odessa", "baron", 5),
                new Horse("Hay", "New York", "Pegas", 10)};

        for (Animal cycleAnimal : animals) {
            treatAnimal(cycleAnimal);
            cycleAnimal.makeNoise();
            cycleAnimal.eat();
        }
    }

}


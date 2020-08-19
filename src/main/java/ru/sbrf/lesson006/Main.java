package ru.sbrf.lesson006;

import ru.sbrf.lesson006.animals.Animal;
import ru.sbrf.lesson006.animals.Cat;
import ru.sbrf.lesson006.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Возможности животного:");
        animal.toMakeSound();
        animal.eat();
        animal.move();

        System.out.println();

        System.out.println("Возможности кота: ");
        cat.toMakeSound();
        cat.eat();
        cat.move();
        cat.climbUpTrees();

        System.out.println();

        System.out.println("Возможности собаки: ");
        dog.toMakeSound();
        dog.eat();
        dog.move();
        dog.toSwim();
    }
}
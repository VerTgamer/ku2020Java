package ru.sbrf.lesson006;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Умения кота: ");
        cat.toMakeSound();
        cat.eat();
        cat.getModesOfTransportationCat().move();
        cat.getModesOfTransportationCat().toSwim();
        cat.getModesOfTransportationCat().climbUpTrees();

        System.out.println("");
        System.out.println("Умения собаки: ");
        dog.toMakeSound();
        dog.eat();
        dog.getModesOfTransportationDog().move();
        dog.getModesOfTransportationDog().toSwim();

    }
}

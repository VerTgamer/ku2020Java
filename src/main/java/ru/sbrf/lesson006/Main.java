package ru.sbrf.lesson006;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Возможности животного:");
        animal.toMakeSound();
        animal.eat();
        animal.getTransportAnimal().move();
        animal.getTransportAnimal().climbUpTrees();
        animal.getTransportAnimal().toSwim();

        System.out.println("");

        System.out.println("Возможности кота: ");
        cat.toMakeSound();
        cat.eat();
        cat.getTransportCat().move();
        cat.getTransportCat().climbUpTrees();
        cat.getTransportCat().toSwim();

        System.out.println("");

        System.out.println("Возможности собаки: ");
        dog.toMakeSound();
        dog.eat();
        dog.getTransportDog().move();
        dog.getTransportDog().climbUpTrees();
        dog.getTransportDog().toSwim();

    }
}

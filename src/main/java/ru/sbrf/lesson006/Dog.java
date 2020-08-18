package ru.sbrf.lesson006;

public class Dog extends Animal {

    private ModesOfTransportAnimalDog transportDog = new ModesOfTransportAnimalDog();

    public ModesOfTransportAnimalDog getTransportDog() {
        return transportDog;
    }

    @Override
    public void toMakeSound() {
        System.out.println("Издавать звук - Гав");
    }

    @Override
    public void eat() {
        System.out.println("Грызть кость");
    }
}

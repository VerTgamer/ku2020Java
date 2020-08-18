package ru.sbrf.lesson006;

public class Dog extends Animal {

    private ModesOfTransportation modesOfTransportationDog = new ModesOfTransportation();

    public ModesOfTransportation getModesOfTransportationDog() {
        System.out.print("По собачье - ");
        return modesOfTransportationDog;
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

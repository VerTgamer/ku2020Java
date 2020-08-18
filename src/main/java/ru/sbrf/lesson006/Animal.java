package ru.sbrf.lesson006;

public class Animal {

    private ModesOfTransportAnimal transportAnimal = new ModesOfTransportAnimal();

    public ModesOfTransportAnimal getTransportAnimal() {
        return transportAnimal;
    }

    public void toMakeSound() {
        System.out.println("Издавать звуки");
    }

    public void eat() {
        System.out.println("Кушать");
    }
}

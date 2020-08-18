package ru.sbrf.lesson006;

public class Cat extends Animal {

    private ModesOfTransportAnimalCat transportCat = new ModesOfTransportAnimalCat();

    public ModesOfTransportAnimalCat getTransportCat() {
        return transportCat;
    }

    @Override
    public void toMakeSound() {
        System.out.println("Издавать звук - Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Пить молоко");
    }


}

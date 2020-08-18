package ru.sbrf.lesson006;

public class Cat extends Animal {

    private ModesOfTransportation modesOfTransportationCat = new ModesOfTransportation();

    public ModesOfTransportation getModesOfTransportationCat() {
        System.out.print("По кошачье - ");
        return modesOfTransportationCat;
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

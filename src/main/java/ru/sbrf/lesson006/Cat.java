package ru.sbrf.lesson006;

public class Cat extends Animal {

    private ModesOfTransportation modesOfTransportationCat = new ModesOfTransportation();

    public ModesOfTransportation getModesOfTransportationCat() {
        return modesOfTransportationCat;
    }

    public void setModesOfTransportationCat(ModesOfTransportation modesOfTransportationCat) {
        this.modesOfTransportationCat = modesOfTransportationCat;
    }

    @Override
    public void toMakeSound() {
        System.out.println("Издавать звук - Мяу");
    }

    @Override
    public void eat() {
        super.eat();
    }


}

package ru.sbrf.lesson006;

public class Dog extends Animal {

    private ModesOfTransportation modesOfTransportationDog = new ModesOfTransportation();

    public ModesOfTransportation getModesOfTransportationDog() {
        return modesOfTransportationDog;
    }

    public void setModesOfTransportationDog(ModesOfTransportation modesOfTransportationDog) {
        this.modesOfTransportationDog = modesOfTransportationDog;
    }

    @Override
    public void toMakeSound() {
        System.out.println("Издавать звук - Гав");
    }

    @Override
    public void eat() {
        super.eat();
    }
}

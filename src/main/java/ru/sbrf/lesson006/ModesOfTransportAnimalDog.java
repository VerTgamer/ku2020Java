package ru.sbrf.lesson006;

public class ModesOfTransportAnimalDog extends ModesOfTransportAnimal {
    @Override
    public void move() {
        System.out.println("Движение по собачье");
    }

    @Override
    public void climbUpTrees() {
        System.out.println("Собака не умеет лазать по деревьям");
    }

    @Override
    public void toSwim() {
        System.out.println("Плавать по собачье");
    }
}

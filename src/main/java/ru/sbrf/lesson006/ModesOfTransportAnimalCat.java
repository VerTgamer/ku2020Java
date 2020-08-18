package ru.sbrf.lesson006;

public class ModesOfTransportAnimalCat extends ModesOfTransportAnimal {
    @Override
    public void move() {
        System.out.println("Движение по кошачье");
    }

    @Override
    public void climbUpTrees() {
        System.out.println("Лазать по деревьям по кошачье");
    }

    @Override
    public void toSwim() {
        System.out.println("Коты не любят плавать");
    }
}

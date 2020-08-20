package ru.sbrf.lesson006.animals;

import ru.sbrf.lesson006.actions.Eat;
import ru.sbrf.lesson006.actions.Move;
import ru.sbrf.lesson006.actions.ToMakeSound;
import ru.sbrf.lesson006.actions.СlimbUpTrees;

public class Cat implements Eat, Move, ToMakeSound, СlimbUpTrees {
    public void eat() {
        System.out.println("Пить молоко");
    }

    public void move() {
        System.out.println("Движение по кошачье");
    }

    public void toMakeSound() {
        System.out.println("Издавать звук - Мяу");
    }

    public void climbUpTrees() {
        System.out.println("Лазать по деревьям по кошачье");
    }
}
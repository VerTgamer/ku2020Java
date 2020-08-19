package ru.sbrf.lesson006.animals;

import ru.sbrf.lesson006.actions.Eat;
import ru.sbrf.lesson006.actions.Move;
import ru.sbrf.lesson006.actions.ToMakeSound;
import ru.sbrf.lesson006.actions.ToSwim;

public class Dog implements Eat, Move, ToMakeSound, ToSwim {
    public void eat() {
        System.out.println("Грызть кость");
    }

    public void move() {
        System.out.println("Движение по собачье");
    }

    public void toMakeSound() {
        System.out.println("Издавать звук - Гав");
    }

    public void toSwim() {
        System.out.println("Плавать по собачье");
    }
}
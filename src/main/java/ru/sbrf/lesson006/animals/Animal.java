package ru.sbrf.lesson006.animals;

import ru.sbrf.lesson006.actions.Eat;
import ru.sbrf.lesson006.actions.Move;
import ru.sbrf.lesson006.actions.ToMakeSound;

public class Animal implements Eat, Move, ToMakeSound {

    public void eat() {
        System.out.println("Кушать");
    }

    public void toMakeSound() {
        System.out.println("Издавать звуки");
    }

    public void move() {
        System.out.println("Двигаться");
    }
}
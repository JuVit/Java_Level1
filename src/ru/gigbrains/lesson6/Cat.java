package ru.gigbrains.lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
        this.maxLengthRun = ThreadLocalRandom.current().nextInt(200,500);
        this.maxLengthJump = Math.ceil(ThreadLocalRandom.current().nextDouble(1.3,3.8)*10)/10;
    }
    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать!");
    }
}

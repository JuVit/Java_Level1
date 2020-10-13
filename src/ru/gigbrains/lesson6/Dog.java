package ru.gigbrains.lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animal {
        Dog(String name) {
            super(name);
            this.maxLengthRun = ThreadLocalRandom.current().nextInt(300,800);
            this.maxLengthSwim = ThreadLocalRandom.current().nextInt(10,17);
            this.maxLengthJump = Math.ceil(ThreadLocalRandom.current().nextDouble(0.3,1.7)*10)/10;
        }
}

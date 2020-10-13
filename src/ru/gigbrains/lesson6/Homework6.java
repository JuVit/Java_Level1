package ru.gigbrains.lesson6;

public class Homework6 {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Тишка");

        dog.info();

        dog.run(500);
        dog.jump(0.3f);
        dog.swim(9);
        dog.run(600);

        cat.info();
        cat2.info();

        cat.run(100);
        cat.swim(12);
        cat.jump(1);
    }
}

package ru.gigbrains.lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Тишка", 6);
        cat[1] = new Cat("Дашка", 7);
        cat[2] = new Cat("Саймон", 12);

        Plate plate = new Plate(19);
        plate.info();

        for (int i = 0; i<cat.length; i++)
        {
            cat[i].fullInfo();
            cat[i].eat(plate);
            cat[i].info();
        }
    }
}

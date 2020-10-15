package ru.gigbrains.lesson6;

public class Animal {
    String name;
    int maxLengthRun;
    double maxLengthJump;
    int maxLengthSwim;

    Animal(String name) {
        this.name = name;
    }

    public void info()
    {
        System.out.println("Это "+this.name+"."+" Его максимальная дистанция бега: "+this.maxLengthRun+"."+" Его максимальная дистанция прыжка: "+this.maxLengthJump+"."+" Его максимальная дистанция плаванья: "+this.maxLengthSwim);
    }

    public void run(int dist)
    {
        if (maxLengthRun>=dist)
        {
            System.out.println(name+" бежит на дистанцию "+dist+" м");
        }
        else System.out.println(name+" не бежит так далеко!");
    }

    public void swim(int length)
    {
        if (maxLengthSwim>=length)
        {
            System.out.println(name+" плывет на дистанцию "+length+" м");
        }
        else System.out.println(name+" не плывет так далеко!");
    }
    public void jump(double height)
    {
        if (maxLengthJump>=height)
        {
            System.out.println(name+" прыгает на высоту "+height+" м");
        }
        else System.out.println(name+" не прыгает так высоко!");
    }
}

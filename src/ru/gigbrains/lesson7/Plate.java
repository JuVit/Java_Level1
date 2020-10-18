package ru.gigbrains.lesson7;

public class Plate {

    private int food;
    private int inf;

    public Plate(int food)
    {
        this.food = food;
    }

    public int getInf() {
        return inf;
    }

    public void decreaseFood(int n)
    {
        if(food>=n)
        {
            food -= n;
            System.out.println("Теперь количество еды в тарелке: " + food);
            inf=1;
        }
        else
            {
            System.out.println("Еды не достаточно");
            inf = 0;
        }
    }

    public void info()
    {
        System.out.println("Количество еды в тарелке: " + food);
    }

    public void addFood(int count)
    {
        food+=count;
    }

}

package ru.gigbrains.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void fullInfo()
    {
        System.out.println("Имя кота " + name + ", его/ee аппетит " + appetite + ", его/ее сытость " + satiety);
    }

    public void info()
    {
        System.out.println("Сытость " + satiety);
    }

    public void eat(Plate p)
    {
        p.decreaseFood(appetite);
        if(p.getInf()==1)
        {
            this.satiety = true;
        }
    }


}

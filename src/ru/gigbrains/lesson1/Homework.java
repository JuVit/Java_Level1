package ru.gigbrains.lesson1;

public class Homework {
    public static void main(String[] args) {
        float a = 23.3f;
        float b = 2.12f;
        float c = 11.33f;
        float d = 3.6f;
        System.out.println("Результат второго задания: " +zadanie2(a, b, c, d));
        System.out.println("Результат третьего задания: " +zadanie3(1,11));
        zadanie4(200);
        System.out.println("Результат пятого задания: " +zadanie5(-20000));
        zadanie6("Илья");
        zadanie7(2019);
    }
    static void zadanie1() {
        byte b = 23;
        short s = 40;
        int i = 1;
        long l = 10000;
        double d = 23.3;
        float fl = 121;
        char ch = 'd';
        boolean bol = true;
    }
    static float zadanie2 (float a, float b, float c, float d)  {
        return a*(b+(c/d));
    }
    static boolean zadanie3 (int a, int b) {
        int sum = a+b;
        return sum > 10 && sum<= 20;
    }
    static void zadanie4 (int a) {
        if (a>=0) System.out.println("Число " +a+ " положительное");
        else System.out.println("Число " +a+ " отрицательное");
    }
    static boolean zadanie5 (int a) {
        if (a<0) return true;
        else return false;
    }
    static void zadanie6 (String im) {
        System.out.println("Привет, " +im+ "!");
    }
    static void zadanie7 (int year) {
        if (!(year%4 == 0)|| ((year%100 ==0) && !(year%400==0))) System.out.println("Год обычный");
        else System.out.println("Год високосный");
    }
}

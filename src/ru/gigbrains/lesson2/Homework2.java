package ru.gigbrains.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int[] mass = new int [] {0,0,1,0,0,1,1};
        System.out.println("Изменение чисел в массиве:");
        changeNumbersInMassiv(mass);
        int[] a = new int[8];
       System.out.println("\n"+"Заполнение массива данными:");
        fillMassivNumbers(a);
        int[] b = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n"+"Умножение чисел в массиве меньше 6 на 2:");
        multiplyNumbersInMassiv(b);
        int[][] c = new int[3][3];
        System.out.println("\n"+"Заполенение диагонали массива 1:");
        fill2Massiva1Diagonal(c);
        int[] array = new int[] {1,5,6,74,12,0,45,9};
        findMaxElementInMassiv(array);
        findMinElementInMassiv(array);
        int[] arr = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Результат поиска баланса в массиве: " + chekBalance(arr));

    }
    public static void changeNumbersInMassiv (int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            switch (mas[i]) {
                case 1:
                    mas[i] = 0;
                    break;
                case 0:
                    mas[i] = 1;
                    break;
                default:
                    System.out.println("Не тот символ");
            }
            System.out.print(mas[i]+" ");
        }
    }
    public static void fillMassivNumbers (int[] masiv) {
        for (int i=0, j=0 ;i<masiv.length;i++,j+=3) {
                    masiv[i]=j;
            System.out.print(masiv[i]+" ");
            }
    }
    public static void multiplyNumbersInMassiv (int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]<6) {
                mass[i]*=2;
            }
            System.out.print(mass[i]+" ");
    }
    }
    public static void fill2Massiva1Diagonal (int[][] array) {
        for (int i=0;i<array.length;i++) {
            for (int j=0; j<array[i].length;j++) {
                if (i==j) {
                    array[i][j]=1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void findMaxElementInMassiv(int[] array2) {
        int max=array2[0];
        for (int i=0;i<array2.length;i++) {
            if (array2[i]>max) {
                max = array2[i];
            }
        }
        System.out.println("Максимальный элемент в массиве: " +max);
    }
    public static void findMinElementInMassiv(int[] array2) {
        int min=array2[0];
        for (int i=0;i<array2.length;i++) {
            if (array2[i]<min) {
                min = array2[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " +min);
    }
    public static boolean chekBalance(int[] array3) {
        boolean balance = false;
        int sumel=0;
        int sumarray=0;
        for (int i=0;i<array3.length;i++) {
            sumarray+=array3[i];
        }
        for (int j =0;j<array3.length;j++) {
                sumel+=array3[j];
                if (sumel==sumarray-sumel) {
                    balance = true;
                }
        }
        return balance;
    }
}





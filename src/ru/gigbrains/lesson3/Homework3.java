package ru.gigbrains.lesson3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String selectedWord = getRandomWord(words);
        System.out.println("Компьютер загадал одно из этих слов, попробуй угадать!");
        System.out.println(Arrays.toString(words));
        //System.out.println("Загаданное слово: " +selectedWord);
        compareWord(selectedWord);
    }
    public static String getRandomWord (String[] array) {
        int rnd = new Random().nextInt(array.length-1);
        return array[rnd];
    }
    public static void compareWord (String wordComp) {
        String wordHum;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите слово: ");
            wordHum = in.nextLine();
            if (wordComp.equals(wordHum)) {
                System.out.println("Вы угадали! Это было слово:" +wordComp);
                break;
            }
            else {
                System.out.println("Вы не угадали! Играем дальше!");
                StringBuilder mask = new StringBuilder("###############");
                for (int i =0; i<wordComp.length(); i++) {
                    for (int j =0;j<wordHum.length();j++) {
                        if (wordComp.charAt(i)==wordHum.charAt(j)) {
                             mask.setCharAt(i,wordHum.charAt(j));
                        }
                    }
                }
                System.out.print("Вот ваша подсказка: ");
                System.out.println(mask);
            }
        }
            while (!Objects.equals(wordComp, wordHum));
    }
}


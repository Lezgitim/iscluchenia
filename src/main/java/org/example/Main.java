package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Реализуйте метод, который запрашивает у пользователя ввод
//        дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.);

//        drobnoe();

//        2. Исправить код.
        zadanie2();

    }

    private static void drobnoe() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число:");
            float num = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка, попробуйте еще.");
            drobnoe();
        }

    }
private static void zadanie2(){
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
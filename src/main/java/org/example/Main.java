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
//        zadanie2();

//        3. Исправить код.
//        zadanie3();
//        printSum(5, 5);

//        Разработайте программу, которая выбросит Exception, когда пользователь вводит
//        пустую строку. Пользователю должно показаться сообщение, что пустые строки
//        вводить нельзя.

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
    private static void zadanie3(){
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (NullPointerException ex) {
                System.out.println("Что-то пошло не так...");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (Throwable ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
        }
        public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
        }

    }

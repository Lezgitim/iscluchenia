package org.example;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//        Необработанные исключения.

//        delimNaNol();
//        massiv();
//        file();

//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен разности элементов
//        двух входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя.

        int[] first =  {1, 2, 3, 4, 5, 6, 7, 8};
        int[] second = {0, 1, 2, 3, 3, 2, 1, 2, 3};
        System.out.println("Разница двух  массивов " + differenceArray(first, second));
    }

    public static void delimNaNol(){
        System.out.println(10/0);
    }
    public static void massiv(){
        int[] mass = new int[1];
        System.out.println(mass[2]);
    }

    public static void file(){
        File f = new File("D://java/file.txt");
        FileReader fr = new FileReader(f);
    }

    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);

        if (min < max) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }


}
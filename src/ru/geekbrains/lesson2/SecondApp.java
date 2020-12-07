package ru.geekbrains.lesson2;

import java.util.Arrays;

public class SecondApp {

    public static void main(String[] args) {
        changeNumber();
        fillArray();
        multArray();
        diagonalArray();

    }
    //        Задать целочисленный массив, состоящий из элементов 0 и 1.
    //        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    static void changeNumber () {
        int [] array = {1, 0, 1, 0};
        for (int i = 0; i < 4; i++) {

            if (array [i] == 0) {
                array [i] = 1;
            }
            else if (array [i] == 1){
                array [i] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
    }

//    Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static void fillArray () {
        int [] array = new int[8];
        array [0] = 0;
        for (int i = 1; i < 8; i++) {
            array[i] = i + 3;
        }
        System.out.println(Arrays.toString(array));
    }
//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    static void multArray () {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array [i] * 2;
        }
        System.out.println(Arrays.toString(array));
    }
//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void diagonalArray () {
        int [][] dArray = new int [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    dArray[i][j] = 1;
                }
                if (i!=1 && j!=1) {
                    dArray[i][j] = 1;
                }
                System.out.println(dArray[i][j]);
            }

        }

    }

}



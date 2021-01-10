package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class SecondApp {

    public static void main(String[] args) {
        changeNumber();
        fillArray();
        multArray();
        diagonalArray();
        minMaxFinder();
        chekBalance();
        positionChange();


    }
//Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    static void changeNumber() {
        System.out.println("Задача №1");
        int[] array = {1, 0, 1, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 4; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
    }

//    Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static void fillArray() {
        System.out.println("Задача №2");

        int[] array = new int[8];
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < 8; i++) {
            array[i] = i + 3;
        }
        System.out.println(Arrays.toString(array));
    }
//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    static void multArray() {
        System.out.println("Задача №3");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
    }

    //    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void diagonalArray() {
        System.out.println("Задача №4");
        int[][] dArray = new int[8][8];

        for (int i = 0; i < dArray.length; i++) {
            dArray[i][i] = 1;
            dArray[i][dArray.length - 1 - i] = 1;
        }
        for (int i = 0; i < dArray.length; i++) {
            System.out.println(Arrays.toString(dArray[i]));
        }

    }


//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    static void minMaxFinder() {
        System.out.println("Задача №5");
        int[] array = new int [15];
        arrRandomFill(array, 50);
        System.out.println(Arrays.toString(array));
        OptionalInt minOpt = Arrays.stream(array).min();
        OptionalInt maxOpt = Arrays.stream(array).max();
        int max = maxOpt.getAsInt();
        int min = minOpt.getAsInt();

        System.out.println("Минимальное значение - " + min);
        System.out.println("Максимальное значение - " + max);
    }

//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.

    static void chekBalance() {
        System.out.println("Задача №6");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int arrFill = rand.nextInt(10);
            arr[i] = arrFill;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(isSumEquals(arr));


    }

    static boolean isSumEquals(int[] arrForSum) {
        boolean isSumEquals = false;
        for (int i = 0; i < arrForSum.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j <= i; j++) {
                sumLeft += arrForSum[j];
            }
            for (int j = 1; j < arrForSum.length - i; j++) {
                sumRight += arrForSum[i + j];
            }
            if (sumLeft == sumRight) {
                isSumEquals = true;
                break;
            }
        }
        return isSumEquals;
    }

//    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//    или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
//    Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    static void positionChange () {
        System.out.println("Задача №6");
        int [] array = new int[10];
        arrRandomFill(array, 11);
        System.out.println("Начальный массив " + Arrays.toString(array));
        int n = 2;
        array = positionChanger(array, n);
        System.out.println("Конечный массив при n = " + n + "  " + Arrays.toString(array));
    }

    static int [] positionChanger (int [] arr, int n) {

        int [] arrChanged = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + n >= arr.length) {
                arrChanged [i+n - arr.length] = arr[i];
            }
            else {
                arrChanged[i + n] = arr[i];
            }
        }
        return arrChanged;

    }
// ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)









    static void arrRandomFill (int [] arr, int bound) {
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int arrFill = rand.nextInt(bound);
            arr[i] = arrFill;
        }
    }




}








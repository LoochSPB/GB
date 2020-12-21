package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final char [][] map = new char [SIZE] [SIZE];
    private static final char DOT_EMPTY = '·';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        fillField();
        mapPrint();

        while(true) {

            userTurn();
            mapPrint();
            if (wincheck(DOT_X)) { break;}

            compTurn();
            mapPrint();
            if (wincheck(DOT_O)) {break;}
        }





    }

    private static boolean wincheck (char symbol) {


        if (map [0][0] == symbol && map [0][1] == symbol && map [0] [2] == symbol) {return true;};
        if (map [1][0] == symbol && map [1][1] == symbol && map [1] [2] == symbol) {return true;};
        if (map [2][0] == symbol && map [2][1] == symbol && map [2] [2] == symbol) {return true;};


    return false;


    }

    private static void userTurn() {
        System.out.print("Введите число: "); // TODO: Написать более понятный интерфейс
        int line = scan.nextInt() - 1;
        System.out.print("Введите число: "); // TODO: Написать более понятный интерфейс
        int column = scan.nextInt() - 1;

        if (isTurnValid(line,column)){
            map [line] [column] = DOT_X;
        }

    }

    private static boolean isTurnValid(int line, int column) {
        if (line > SIZE || line < 0){
            System.out.println("Введите число от одного до " + SIZE);
            return false;
        }
        if (column > SIZE || column < 0){
            System.out.println("Введите число от одного до " + SIZE);
            return false;
        }
        if (!(map[line][column] == DOT_EMPTY)){
            System.out.println("Эта ячейка занята");
            return false;
        }
        else {
            return true;
        }
    }


    private static void fillField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i][j] = DOT_EMPTY;
            }
        }
    }

    private static void mapPrint() {
        int lineIndex;
        int colIndex;
        mapHead();
        mapInner();
    }

    private static void mapHead() {
        for (int i = 0; i <= SIZE ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    private static void mapInner() {
        int lineIndex;
        int colIndex;
        for (lineIndex = 0; lineIndex < SIZE; lineIndex++) {
            System.out.print((lineIndex + 1) + " ");
            for (colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map[lineIndex][colIndex] + " ");
            }

            System.out.println();
        }
    }

    private static void compTurn() {
        Random rand = new Random();
        int line = rand.nextInt(SIZE);
        int column = rand.nextInt(SIZE);
        map [line][column] =  DOT_O;


    }


}
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


        System.out.println("Сыграем в Крестики-Нолики. Играть будем на этом поле:");
        fillField();
        mapPrint();

        while(true) {

            userTurn();
            mapPrint();
            if (winCheck(DOT_X)) { break;}

            System.out.println("Ход компьютера.");

            compTurn();
            mapPrint();
            if (winCheck(DOT_O)) {break;}
        }





    }

    private static boolean winCheck(char symbol) {

        //TODO: сделать проверку на победу по вертикали и диагонали при помощи цикла
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                if (map [i][j] == symbol && map [i++] [j++] == symbol){
                    System.out.println("Победили I++ J++");         //TODO: Исправить текст при поздравдении.
                    return true;

                }
                if (map [i][j] == symbol && map [i++] [j] == symbol){
                    System.out.println("Победили I++ J");         //TODO: Исправить текст при поздравдении.
                    return true;
                }
            }
        }


        


        if (map [0][0] == symbol && map [0][1] == symbol && map [0] [2] == symbol) {return true;}
        if (map [1][0] == symbol && map [1][1] == symbol && map [1] [2] == symbol) {return true;}
        if (map [2][0] == symbol && map [2][1] == symbol && map [2] [2] == symbol) {return true;}


    return false;


    }

    private static void userTurn() {

        int line = -5;
        int column = -5;


        while (!(isUserTurnValid(line,column))) {
            System.out.print("Введите число по горизонтали: ");
            line = scan.nextInt() - 1;
            System.out.print("Введите число по вертикали: ");
            column = scan.nextInt() - 1;
        }
        map [line] [column] = DOT_X;
    }

    private static boolean isUserTurnValid(int line, int column) {
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
    private static boolean isCompTurnValid(int line, int column) {
        if (line > SIZE || line < 0){
            return false;
        }
        if (column > SIZE || column < 0){
            return false;
        }
        if (!(map[line][column] == DOT_EMPTY)){
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
        int line = -1;
        int column = -1;
        while (!(isCompTurnValid(line,column))) {
            Random rand = new Random();
            line = rand.nextInt(SIZE);
            column = rand.nextInt(SIZE);
        }
        map[line][column] = DOT_O;
        System.out.println("Компьтер сделал свой ход. Теперь Вы.");
    }


}
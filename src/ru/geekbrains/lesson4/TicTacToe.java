package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final int DOT_TO_WIN = 4;
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
        if (checkRawColumn(symbol,DOT_TO_WIN)) {
            System.out.println("Победили " + symbol);
            return true;
        }
        if (checkDiag(symbol,DOT_TO_WIN)) {
            System.out.println("Победили " + symbol);
            return true;
        }
        if (checkwithdraw ()){
            System.out.println("Ничья");
            return true;
        }
        return false;


    }

    private static boolean checkwithdraw() {
        int withdraw = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                withdraw = (map [i][j] == DOT_EMPTY) ? withdraw + 1 : withdraw;
            }
        }
        if (withdraw == 0) {
            return true;
        }
        return false;
    }

    private static boolean checkDiag (char symbol, int DOT_TO_WIN) {
        int diagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            diagCounter = (map [i][i]==symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            diagCounter = (map [i][SIZE - 1 - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            diagCounter = (map [i][SIZE - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            diagCounter = (map [i][i - 1] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            diagCounter = (map [i][i + 1] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            diagCounter = (map [i][SIZE - 2 - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                return true;
            }
        }
    return false;
    }
    private static void compTurnFind (char symbol) {
        int diagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            diagCounter = (map [i][i]==symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN - 1) {
                map [i+1][i+1] = DOT_O;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            diagCounter = (map [i][SIZE - 1 - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN - 1) {
                map [i+1][SIZE - 1 - (i+1)] = DOT_O;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            diagCounter = (map [i][SIZE - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN - 1) {
                map [i+1][SIZE - (i+1)] = DOT_O;
            }
        }
        for (int i = 1; i < SIZE; i++) {
            diagCounter = (map [i][i - 1] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN - 1) {
                map [i+1][i] = DOT_O;
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            diagCounter = (map [i][i + 1] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN - 1) {
                map [i+1][i + 1 + 1] = DOT_O;
            }
        }
        for (int i = 0; i < SIZE - 1; i++) {
            diagCounter = (map [i][SIZE - 2 - i] == symbol) ? diagCounter + 1 : 0;
            if (diagCounter == DOT_TO_WIN) {
                map [i + 1][SIZE - 2 - (i + 1)] = DOT_O;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            int rawCounter = 0;
            int columnCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rawCounter = (map [i][j] == symbol) ? rawCounter + 1 :  0;
                if (rawCounter == DOT_TO_WIN - 1) {
                    map [i] [j+1] = DOT_O;
                }
                columnCounter = (map [j][i] == symbol) ? columnCounter + 1 :  0;
                if (columnCounter == DOT_TO_WIN - 1) {
                    map [j+1] [i] = DOT_O;
                }

            }
        }
    }

    private static boolean checkRawColumn(char symbol, int DOT_TO_WIN) {
        for (int i = 0; i < SIZE; i++) {
            int rawCounter = 0;
            int columnCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rawCounter = (map [i][j] == symbol) ? rawCounter + 1 :  0;
                columnCounter = (map [j][i] == symbol) ? columnCounter + 1 :  0;
                if (rawCounter == DOT_TO_WIN) {
                    return true;
                }
                if (columnCounter == DOT_TO_WIN) {
                    return true;
                }
            }
        }
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
        if (checkDiag(DOT_X,DOT_TO_WIN-1) || checkRawColumn(DOT_X, DOT_TO_WIN-1)) {
            compTurnFind(DOT_X);
        }
        else {
            int line = -1;
            int column = -1;
            while (!(isCompTurnValid(line, column))) {
                Random rand = new Random();
                line = rand.nextInt(SIZE);
                column = rand.nextInt(SIZE);
            }
            map[line][column] = DOT_O;
        }
        System.out.println("Компьтер сделал свой ход. Теперь Вы.");
    }


}
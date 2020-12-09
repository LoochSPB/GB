package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

//    Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Здравствуйте. Как Вас зовут?");
        String name = scan.nextLine();
        System.out.println(name + ", сыграем в игру Угадайте число. У Вас будет 3 попытки.");
        int answerTryAgain;
        do {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9");
                int userNumber = scan.nextInt();
                int attempts = 3 - (i + 1);
                if (userNumber == randomNumber) {
                    System.out.println("Верно!");
                    break;
                }
                else if (i == 2) {
                    System.out.println(name + ", к соалению Вы проиграли");
                    break;
                }
                else if (userNumber < randomNumber) {
                    System.out.println("Загаданное число больше. Осталось " + attempts + " попыток.");
                }
                else if (userNumber > randomNumber) {
                    System.out.println("Загаданное число меньше. Осталось " + attempts + " попыток.");
                }
            }
            System.out.println("Хотите сыграть еще раз? 1 – да / 0 – нет");
            answerTryAgain = scan.nextInt();
        } while (answerTryAgain == 1);
      System.out.println("Спасибо за игру и всего хорошего, " + name + "!");
    }
}

package ru.geekbrains.lesson3;

// Создать массив из слов
//         String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//         "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
//         "pear", "pepper", "pineapple", "pumpkin", "potato"};
//         При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//         сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//         Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//         apple – загаданное
//         apricot - ответ игрока
//         ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//         Для сравнения двух слов посимвольно, можно пользоваться:
//         String str = "apple";
//         str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//         Играем до тех пор, пока игрок не отгадает слово
//         Используем только маленькие буквы

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random ranWords = new Random();
        int takeTheWordFromArray = ranWords.nextInt(words.length);
        String hiddenWord = words[takeTheWordFromArray];
        Scanner scan = new Scanner (System.in);
        System.out.println("Здравствуйте. Как Вас зовут?");
        String name = scan.nextLine();
        System.out.println(name + ", сыграем в игру Угадайте слово. Компьютер загадает слово. Как Вы думаете, какое?");
        boolean wordCheck;
        char [] hide = new char[15];
        Arrays.fill(hide,'#');
        do {
            for (int i = 0; i < hiddenWord.length(); i++) {
                System.out.println("Введите слово на английском маленькими буквами.");
                String answeredWord = scan.nextLine();
                wordCheck = hiddenWord.equals(answeredWord);

                if (wordCheck) {
                    System.out.println("Поздравляю, " + name + "!!! Это верный ответ");
                    return;
                } else if (!wordCheck) {
                    for (int j = 0; j <= i; j++) {
                        hide[j] = hiddenWord.charAt(j);
                    }
                    System.out.println("Неверно.");
                    System.out.println(name + ", попробуйте еще раз.");
                    System.out.println("Давайте я Вам помогу. Открою часть слова: ");
                    for (int j = 0; j < hide.length; j++) {
                        System.out.print(hide[j]);
                    }
                    System.out.println(" ");

                }
            }
        }while (wordCheck = true);
    }
}

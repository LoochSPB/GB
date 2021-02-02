package ru.geekbrains.lesson7;

import javax.tools.JavaCompiler;

public class TaskString {

//  7.* Задания по строкам:
//    a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//    б) Распечатать последний символ строки. Используем метод String.charAt().
//    в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//    г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//    д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//    e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//    ж) Заменить все символы “а” на “о”.
//    з) Преобразуйте строку к верхнему регистру.
//    и) Преобразуйте строку к нижнему регистру.
//    к) Вырезать строку Java c помощью метода String.substring().

    public static void stringMorph(String input) {
        System.out.println("1. The last char is: " + input.charAt(input.length() - 1));
        System.out.println("2. String ends with - !!! - " + input.endsWith("!!!"));
        System.out.println("3. String starts with - I like - " + input.startsWith("I like"));
        System.out.println("4. String contains - Java - " + input.contains("Java"));
        System.out.println("5. Position of - Java - is " + input.indexOf("Java"));
        System.out.println("6. Was: " + input + ", become: " + input.replaceAll("a", "o"));
        System.out.println("7. Was: " + input + ", become: " + input.toUpperCase());
        System.out.println("8. Was: " + input + ", become: " + input.toLowerCase());
        System.out.println("9. Was: " + input + ", become: " + input.substring(input.indexOf("Java")));

    }


}

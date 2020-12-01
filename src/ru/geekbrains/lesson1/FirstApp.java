package ru.geekbrains.lesson1;

public class FirstApp {

    public static void main (String[] args)
    {
        variables();
        System.out.println("Задание 3: " + calculate(5,3, 8,7));
        System.out.println("Задание 4: " + numCheck(9,1));
        posOrNeg(15);
        System.out.println("Задание 6: " + negativeNumCheck(-1));
        printHelloName("Илья");
        yearCheck(800);
    }

    static void variables () {

        //Создать переменные всех пройденных типов данных, и инициализировать их значения;

        int i;
        float f;
        char c;
        boolean b;

        i = 10;
        f = 3.14f;
        c = '!';
        b = true;

        System.out.println("Задание 2: ");
        System.out.println(i);
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);
    }

    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат,где a, b, c, d – входные параметры этого метода;
    */
    static float calculate (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*
    Написать метод, принимающий на вход два числа, и проверяющий что их сумма
    лежит в пределах от 10 до 20(включительно), если да – вернуть true,
    в противном случае – false;
    */

    static boolean numCheck (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
    */

    static void posOrNeg (int a) {
        System.out.println("Задание 5:");
        if (a < 0) {
            System.out.println(a + " - Число Отрицательное");
        }
        else {
            System.out.println(a + " - Число Положительное");
        }


    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;
    */

    static boolean negativeNumCheck (int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }


    /*
    Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    */

    static void printHelloName (String name) {
        System.out.println("Задание 7:");
        System.out.println("Привет, " + name + "!");
    }

    /*
    Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */

    static void yearCheck (int a) {

        System.out.println("Задание 8:");

        if ((a %= 400) == 0) {
            System.out.println("Год високосный");
        }
        else if ((a %= 100) == 0) {
            System.out.println("Год невисокосный");
        }
        else if ((a %= 4) == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }








}
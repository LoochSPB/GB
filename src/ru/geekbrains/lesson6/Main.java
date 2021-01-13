package ru.geekbrains.lesson6;

import java.util.Random;

public class Main {
//  1. Создать классы Собака и Кот с наследованием от класса Животное.
//  2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//  В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
//  или высоту (для прыжков).
//  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//  прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//  4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//  (Например, dog1.run(150); -> результат: run: true)
//  5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
//  6. ** Добавить подсчет созданных котов, собак и животных.

    public static void main(String[] args) {
        Random rand = new Random();
        Animal [] animals = new Animal[10];
        for (int i = 0; i < animals.length/2; i++) {
            animals[i] = new Cat();
        }
        for (int i = animals.length/2; i < animals.length; i++) {
            animals[animals.length - i] = new Dog();
        }
        for (int i = 0; i < animals.length ; i++) {
            int distance = rand.nextInt(1000);
            System.out.print(animals[i]);
            animals[i].jump(rand.nextInt(5));
            System.out.println();
            System.out.print(animals[i]);
            animals[i].run(distance);
            System.out.println();
            System.out.print(animals[i]);
            animals[i].swim(rand.nextInt(300));
            System.out.println();
        }
    }



}

package ru.geekbrains.lesson6;

import java.util.Random;

public class Pets {
//  1. Создать классы Собака и Кот с наследованием от класса Животное.
//  2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//  В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
//  или высоту (для прыжков).
//  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//  прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//  4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//  (Например, dog1.isRun(150); -> результат: isRun: true)
//  5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
//  6. ** Добавить подсчет созданных котов, собак и животных.


    private static Animal[] animalGen() {
        return new Animal[]{
                new Cat(),
                new Cat(),
                new Dog(),
                new Cat(150, 5),
                new Dog(400, 2, 50),
        };
    }


    public static void main(String[] args) {
        Animal[] animals = animalGen();
        animalAction(animals);
        animalCounter();
    }

    private static void animalCounter() {
        System.out.println("Всего собак " + Dog.getCounter());
        System.out.println("Всего кошек " + Cat.getCounter());
        System.out.println("Всего животных " + Animal.getCounter());
    }

    private static void animalAction(Animal[] animals) {
        Random random = new Random();
        for (Animal animal: animals) {
            animal.printInfo();
            animal.isJump(random.nextInt(5));
            animal.isRun(random.nextInt(500));
            animal.isSwim(random.nextInt(75));
        }

    }


}

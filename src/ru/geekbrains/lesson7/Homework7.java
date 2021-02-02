package ru.geekbrains.lesson7;

public class Homework7 {

//  1. Расширить задачу про котов и тарелки с едой
//  2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
//  3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
//  4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
//  5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
//  6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку


    public static void main(String[] args) {
        taskAboutStr();
        taskAboutCats();



    }

    private static void taskAboutCats() {
        Cat[] cats = new Cat[10];
        Plate plate = new Plate(100);
        catGenerator(cats);
        catsCare(cats, plate);


    }

    private static void catsCare(Cat[] cats, Plate plate) {
        do {
            feedCats(cats, plate);
            plate.fillPlate();

            feedCheck(cats);
        } while (!feedCheck(cats));
        System.out.println("Кошки накормлены!");
    }

    private static boolean feedCheck(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHunger) {
                return false;
            }
        }
        return true;
    }

    private static void feedCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
        plate.info();
    }

    private static void taskAboutStr() {
        System.out.println("Задание по String.");
        TaskString.stringMorph("I like Java!!!");
        System.out.println();
        System.out.println();
        System.out.println("Задание по кошкам.");
    }

    private static void catGenerator(Cat[] cats) {
        System.out.println("Пришли кошки:");
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + i, (int) (Math.random() * 50));
            cats[i].info();
        }
    }

}

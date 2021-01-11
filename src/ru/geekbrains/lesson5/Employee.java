package ru.geekbrains.lesson5;

public class Employee {
//    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//    2. Конструктор класса должен заполнять эти поля при создании объекта;
//    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//    4. Создать массив из 5 сотрудников
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//    ...
//    persArray[4] = new Person(...);
//
//    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo () {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Почта: " + email + "; Телефон: " + phone +
                "; Зарплата: " + salary + "; Возраст: " + age);
    }
    public int getAge () {
        return age;
    }
}

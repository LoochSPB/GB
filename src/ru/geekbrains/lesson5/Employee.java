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

    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees [0] = new Employee("Зигзаг МакКряк", "Летчик", "borntofly@mail.ru",
                "89217676767", 150000, 43);
        employees [1] = new Employee("Иванов Иван", "Менеджер", "ivanov@mail.ru",
                "89215555565", 50000, 30);
        employees [2] = new Employee("Петров Евгний", "Инженер", "petrove@mail.ru",
                "89215585565", 70000, 46);
        employees [3] = new Employee("Левитан Юрий", "Диктор", "voice@mail.ru",
                "89215587565", 20000, 52);
        employees [4] = new Employee("Дегтерев Антон", "Диджей", "degot@mail.ru",
                "89218987565", 80000, 22);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printInfo();
            }
        }
    }

}

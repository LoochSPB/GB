package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Зигзаг МакКряк", "Летчик", "borntofly@mail.ru",
                "89217676767", 150000, 43);
        employees[1] = new Employee("Иванов Иван", "Менеджер", "ivanov@mail.ru",
                "89215555565", 50000, 30);
        employees[2] = new Employee("Петров Евгний", "Инженер", "petrove@mail.ru",
                "89215585565", 70000, 46);
        employees[3] = new Employee("Левитан Юрий", "Диктор", "voice@mail.ru",
                "89215587565", 20000, 52);
        employees[4] = new Employee("Дегтерев Антон", "Диджей", "degot@mail.ru",
                "89218987565", 80000, 22);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }

        }
    }
}

package ru.geekbrains.lesson7;

public class Cat {

    private int hunger;
    private final String NAME;
    public boolean isHunger;

    public Cat(String NAME, int hunger) {
        this.NAME = NAME;
        this.hunger = hunger;
        if (hunger > 0) {
            this.isHunger = true;
        }
        else {isHunger = false;}

    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void eat(Plate plate) {
        if (isHunger) {
            if (this.getHunger() > plate.getFood()) {
                System.out.println("Еды в тарелке недостаточно.");

            } else {
                System.out.println(this.NAME + " is eating...");
                plate.foodDecrease(getHunger());
                this.hunger = 0;
                this.isHunger = false;
            }
        }

    }

    public  void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "NAME='" + NAME + '\'' +
                ", hunger=" + hunger +
                ", isHunger=" + isHunger +
                '}';
    }
}

package ru.geekbrains.lesson6;

public class Cat extends Animal {

    private int jumpLimit =    //TODO write limits
    private int runLimit =    //TODO write limits
    private int swimLimit =    //TODO write limits

    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void jump(int height) {
        boolean isJump = height < 200;
        System.out.println(height + "m : " + isJump);
    }

    @Override
    public void swim(int distance) {

    }

}

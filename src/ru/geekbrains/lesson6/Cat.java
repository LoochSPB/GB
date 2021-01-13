package ru.geekbrains.lesson6;

public class Cat extends Animal {

    private int jumpLimit = (int) (2 + (Math.random() * 10));
    private int runLimit = (int) (200 + (Math.random() * 1000));


    @Override
    public void run (int distance) {
        boolean isRun = distance <= runLimit;
        System.out.println("run: " + isRun);

    }

    @Override
    public void jump(int height) {
        boolean isJump = height <= jumpLimit;
        System.out.println("Jump: " + isJump);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can not swim!");
    }

}

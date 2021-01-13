package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private int jumpLimit = (int) (2 + (Math.random() * 2));
    private int runLimit = (int) (500 + (Math.random() * 200));
    private int swimLimit = (int) (10 + (Math.random() * 200));


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
        boolean isJump = distance <= swimLimit;
        System.out.println("Jump: " + isJump);
    }

}

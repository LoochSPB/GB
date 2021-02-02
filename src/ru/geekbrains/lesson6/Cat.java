package ru.geekbrains.lesson6;

public class Cat extends Animal {

    private static final int JUMP_LIMIT = 2;
    private static final int RUN_LIMIT = 300;
    private static final int SWIM_LIMIT = 0;

    private static int counter;

    public Cat(int runLimit, int jumpLimit) {
        super(runLimit, jumpLimit, SWIM_LIMIT);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public Cat() {
        this(RUN_LIMIT, JUMP_LIMIT);
    }

    @Override
    public boolean isRun(int distance) {
        if (distance <= this.runLimit) {
            System.out.printf("Кошка смогла пробежать расстояние %d, максимальное расстояние %d%n", distance, runLimit);
            return true;
        }
        System.out.printf("Кошка не смогла пробежать расстояние %d, максимальное расстояние %d%n", distance, runLimit);
        return false;
    }

    @Override
    public boolean isJump(int height) {
        if (height <= this.jumpLimit) {
            System.out.printf("Кошка смогла прыгнуть на высоту %d, максимальное расстояние %d%n", height, jumpLimit);
            return true;
        }
        System.out.printf("Кошка не смогла прыгнуть на высоту %d, максимальное расстояние %d%n", height, jumpLimit);
        return false;
    }

    @Override
    public boolean isSwim(int distance) {
        System.out.println("Кошки не умеют плавать");
        return false;
    }

}

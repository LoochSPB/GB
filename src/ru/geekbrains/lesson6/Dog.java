package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private static final int JUMP_LIMIT = 1;
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;

    private static int counter;

    public Dog(int runLimit, int jumpLimit, int swimLimit) {
        super(runLimit, jumpLimit, swimLimit);
        counter++;
    }

    public Dog() {
        this(RUN_LIMIT, JUMP_LIMIT, SWIM_LIMIT);
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public boolean isRun(int distance) {
        if (distance <= this.runLimit) {
            System.out.printf("Собака смогла пробежать расстояние %d, максимальное расстояние %d%n", distance, runLimit);
            return true;
        }
        System.out.printf("Собака не смогла пробежать расстояние %d, максимальное расстояние %d%n", distance, runLimit);
        return false;
    }

    @Override
    public boolean isJump(int height) {
        if (height <= this.jumpLimit) {
            System.out.printf("Собака смогла прыгнуть на высоту %d, максимальное расстояние %d%n", height, jumpLimit);
            return true;
        }
        System.out.printf("Собака не смогла прыгнуть на высоту %d, максимальное расстояние %d%n", height, jumpLimit);
        return false;
    }

    @Override
    public boolean isSwim(int distance) {
        if (distance <= this.swimLimit) {
            System.out.printf("Собака смогла проплыть расстояние %d, максимальное расстояние %d%n", distance, swimLimit);
            return true;
        }
        System.out.printf("Собака не смогла проплыть расстояние %d, максимальное расстояние %d%n", distance, swimLimit);
        return false;
    }

}

package ru.geekbrains.lesson6;

public abstract class Animal {

    protected int runLimit;
    protected int jumpLimit;
    protected int swimLimit;

    private static int counter;

    public Animal(int runLimit, int jumpLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public Animal() {
    }

    public abstract boolean isRun(int distance);
    public abstract boolean isJump(int height);
    public abstract boolean isSwim(int distance);

    public void printInfo (){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "runLimit=" + runLimit +
                ", jumpLimit=" + jumpLimit +
                ", swimLimit=" + swimLimit +
                '}';
    }
}

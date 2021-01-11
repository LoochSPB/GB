package ru.geekbrains.lesson6;

import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

public abstract class Animal {


    protected String name;
    protected int age;

    protected Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run (int distance);
    public abstract void jump (int height);
    public abstract void swim (int distance);

    }

package ru.geekbrains.lesson6;

import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

public abstract class Animal {

    protected Animal() {
    }

    public abstract void run (int distance);
    public abstract void jump (int height);
    public abstract void swim (int distance);

    }

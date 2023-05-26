package ru.sber.lambdas;

public class Chicken implements Sounding {
    @Override
    public void sound() {
        System.out.println("cluck");
    }
}

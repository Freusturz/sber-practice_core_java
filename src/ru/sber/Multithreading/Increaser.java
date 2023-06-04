package ru.sber.Multithreading;

public class Increaser extends Thread {

    private final ResourceProcessor processor;

    public Increaser(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        processor.increase();
    }

}

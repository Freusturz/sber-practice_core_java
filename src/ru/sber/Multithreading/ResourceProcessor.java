package ru.sber.Multithreading;

public class ResourceProcessor {
    private final Resource resource;

    public ResourceProcessor(Resource resource) {
        this.resource = resource;
    }

    public void increase() {
        synchronized (this) {
            resource.number++;
        }
    }

    public void decrease() {
        resource.number--;
    }

    public int get() {
        return resource.number;
    }
}

package ru.sber.Streams;

public class StringContainer {
        public String name;

        public int count;


    public StringContainer(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return name + " | " + count;
    }

}

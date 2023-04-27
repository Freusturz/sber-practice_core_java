package ru.sber.Collections;

public interface List<T> extends Collection<T> {
    void add(int index, T item);

    void set(int index, T item);

    T get(int index) throws IndexOutOfBoundsException;

    int indexOf(T item);

    int lastIndexOf(T item);
    T removeAt(int index) throws IndexOutOfBoundsException;

    List<T> subList(int from, int to) throws IndexOutOfBoundsException;

}



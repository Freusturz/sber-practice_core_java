package ru.sber.Collections;

public interface Collection<T> {
    int size();
    boolean isEmpty();
    boolean add(T item);
    boolean remove(T item);
    void clear();
    boolean contains(T item);
}

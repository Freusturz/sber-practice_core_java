package ru.sber.Collections;

import java.util.NoSuchElementException;
public interface Deque<T> extends Collection<T> {

    void addFirst(T item);
    void addLast(T item);
    T getFirst() throws NoSuchElementException;
    T getLast() throws NoSuchElementException;
    T pollFirst();
    T pollLast();
    T removeFirst() throws NoSuchElementException;
    T removeLast() throws NoSuchElementException;
}

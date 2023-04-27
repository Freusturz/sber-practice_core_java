package ru.sber.Collections;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<T> implements List<T> {
    private static class Iterator<T> implements java.util.Iterator<T> {

        private int CurI = 0;
        private final ArrayList<T> list;


        public Iterator(ArrayList<T> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return CurI < list.size();
        }

        public T next() throws NoSuchElementException {
            if (hasNext()) {
                return list.get(CurI++);
            }

            throw new NoSuchElementException();
        }
    }

    private static final int sizelist = 5;

    private Object[] data;

    private int size = 0;

    private void checkI(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Индекс вышел за границы списка");
        }
    }

    private ArrayList(T[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public ArrayList() {
        this.data = new Object[sizelist];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(T item) {
        return indexOf(item) >= 0;
    }

    public boolean add(T item) {
        if (this.size + 1 >= this.data.length) {
            Object[] newData = new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }

        this.data[this.size++] = item;
        return true;
    }

    public boolean remove(T item) {
        int previousSize = this.size;
        int i = indexOf(item);

        while (i != -1) {
            removeAt(i);
            i = indexOf(item);
        }

        return this.size == previousSize;
    }

    public void clear() {
        this.data = new Object[sizelist];
        this.size = 0;
    }

    public void add(int index, T item) {
        if (index == this.size) {
            add(item);
            return;
        }

        if (index > this.size) {
            return;
        }

        Object[] oldArray = this.data;

        if (this.size + 1 >= this.data.length) {
            Object[] newData = new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, index);
            this.data = newData;
        }

        System.arraycopy(oldArray, index, this.data, index + 1, this.size - index);
        this.data[index] = item;
        this.size++;
    }

    public void set(int i, T item) {
        if (i == this.size) {
            add(item);
        } else if (i < this.size) {
            this.data[i] = item;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        checkI(index);

        return (T) this.data[index];
    }

    public int indexOf(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(this.data[i], item)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = this.size - 1; i >= 0; i--) {
            if (this.data[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public T removeAt(int index) throws IndexOutOfBoundsException {
        checkI(index);

        Object objectToReturn = this.data[index];
        this.data[index] = null;
        System.arraycopy(this.data, index + 1, this.data, index, this.size - index);
        this.size--;

        return (T) objectToReturn;
    }

    public List<T> subList(int left, int right) throws IndexOutOfBoundsException {
        checkI(left);
        checkI(right);
        int copySize = right - left;
        Object[] newlist = new Object[Math.max(copySize, 5)];
        System.arraycopy(this.data, right, newlist, 0, copySize);
        return new ArrayList<>((T[])newlist, left - right);
    }

    public Iterator<T> iterator() {
        return new Iterator(this);
    }
}


package ru.sber.Collections;

import java.util.NoSuchElementException;
import java.util.Objects;
public class LinkedList<T> implements Deque<T>, List<T>, Iterable<T> {
    private static class Iterator<T> implements java.util.Iterator<T> {

        private final LinkedList<T> list;

        private int curInd = 0;

        public Iterator(LinkedList<T> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return curInd < list.size();
        }

        public T next() throws NoSuchElementException {
            if (hasNext()) {
                return list.get(curInd++);
            }

            throw new NoSuchElementException();
        }

    }

    private static class Node<T> {

        public T data;

        public Node<T> previous;

        public Node<T> next;

        public Node(T data, Node<T> previous, Node<T> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

    }

    private Node<T> head;

    private Node<T> tail;

    private int size;

    private void checkBounds() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
    }

    private void checkPositionIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Р ВР Р…Р Т‘Р ВµР С”РЎРѓ Р Р†РЎвЂ№РЎв‚¬Р ВµР В» Р В·Р В° Р С–РЎР‚Р В°Р Р…Р С‘РЎвЂ РЎвЂ№ РЎРѓР С—Р С‘РЎРѓР С”Р В°");
        }
    }

    private void checkElementIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Р ВР Р…Р Т‘Р ВµР С”РЎРѓ Р Р†РЎвЂ№РЎв‚¬Р ВµР В» Р В·Р В° Р С–РЎР‚Р В°Р Р…Р С‘РЎвЂ РЎвЂ№ РЎРѓР С—Р С‘РЎРѓР С”Р В°");
        }
    }

    private Node<T> getNode(int index) throws IndexOutOfBoundsException {
        checkElementIndex(index);

        Node<T> currentNode = this.head;

        while (index-- > 0) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    private Node<T> removeNode(Node<T> nodeToRemove) {
        Node<T> nextNode = nodeToRemove.next;
        Node<T> previousNode = nodeToRemove.previous;

        if (previousNode == null) {
            this.head = nextNode;
        } else {
            previousNode.next = nextNode;
        }

        if (nextNode == null) {
            this.tail = previousNode;
        } else {
            nextNode.previous = previousNode;
        }

        this.size--;
        return nextNode;
    }

    private LinkedList(Node<T> head, Node<T> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
        addLast(item);
        return true;
    }

    public boolean remove(T item) {
        boolean atLeastOneDeletion = false;

        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if (Objects.equals(currentNode.data, item)) {
                currentNode = removeNode(currentNode);
                atLeastOneDeletion = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return atLeastOneDeletion;
    }


    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(T item) {
        Node<T> headNode = this.head;
        Node<T> newNode = new Node<T>(item, null, headNode);
        this.head = newNode;

        if (headNode == null) {
            this.tail = newNode;
        } else {
            headNode.previous = newNode;
        }

        this.size++;
    }

    public void addLast(T item) {
        Node<T> tailNode = this.tail;
        Node<T> newNode = new Node<T>(item, tailNode, null);
        this.tail = newNode;

        if (tailNode == null) {
            this.head = newNode;
        } else {
            tailNode.next = newNode;
        }

        this.size++;
    }

    public T getFirst() throws NoSuchElementException {
        checkBounds();

        return this.head.data;
    }


    public T getLast() throws NoSuchElementException {
        checkBounds();

        return this.tail.data;
    }


    public T pollFirst() {
        if (this.head == null) {
            return null;
        }

        return this.head.data;
    }

    public T pollLast() {
        if (this.tail == null) {
            return null;
        }

        return this.tail.data;
    }

    public T removeFirst() throws NoSuchElementException {
        checkBounds();

        T objectToReturn = this.head.data;
        Node<T> nextNode = this.head.next;
        this.head = nextNode;

        if (nextNode == null) {
            this.tail = null;
        } else {
            nextNode.previous = null;
        }

        this.size--;
        return objectToReturn;
    }

    public T removeLast() throws NoSuchElementException {
        checkBounds();

        T objectToReturn = this.tail.data;
        Node<T> previousNode = this.tail.previous;
        this.tail = previousNode;

        if (previousNode == null) {
            this.head = null;
        } else {
            previousNode.previous = null;
        }

        this.size--;
        return objectToReturn;
    }

    public void add(int index, T item) {
        checkPositionIndex(index);

        if (this.size == index) {
            addLast(item);
        } else {
            Node<T> linkToNode = getNode(index);
            Node<T> previousNode = linkToNode.previous;
            Node<T> newNode = new Node<T>(item, previousNode, linkToNode);
            linkToNode.previous = newNode;

            if (previousNode == null) {
                this.head = newNode;
            } else {
                previousNode.next = newNode;
            }

            this.size++;
        }
    }

    public void set(int index, T item) {
        if (this.size == index) {
            addLast(item);
        } else if (this.size > index) {
            getNode(index).data = item;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException {
        return getNode(index).data;
    }

    public int indexOf(T item) {
        int i = 0;

        for (Node<T> currentNode = this.head; currentNode != null; currentNode = currentNode.next) {
            if (Objects.equals(currentNode.data, item)) {
                return i;
            }

            i++;
        }

        return -1;
    }

    public int lastIndexOf(T item) {
        int index = this.size;

        for (Node<T> currentNode = this.tail; currentNode != null; currentNode = currentNode.previous) {
            index--;

            if (Objects.equals(currentNode.data, item)) {
                return index;
            }
        }

        return -1;
    }

    public T removeAt(int index) throws IndexOutOfBoundsException {
        checkElementIndex(index);

        Node<T> currentNode = this.head;

        while (index-- > 0) {
            currentNode = currentNode.next;
        }

        T objectToReturn = currentNode.data;
        removeNode(currentNode);
        return objectToReturn;
    }

    public List<T> subList(int from, int to) throws IndexOutOfBoundsException {
        checkElementIndex(from);
        checkPositionIndex(to);

        return new LinkedList<T>(getNode(from), getNode(to - 1), to - from);
    }
    public Iterator<T> iterator() {
        return new Iterator<T>(this);
    }
}



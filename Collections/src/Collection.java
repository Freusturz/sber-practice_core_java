public interface Collection<T> {
    int size();
    boolean isEmpty();
    boolean add(Object item);
    boolean remove(Object item);
    void clear();
    boolean contains(Object item);
}

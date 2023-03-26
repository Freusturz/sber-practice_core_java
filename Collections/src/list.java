//import Java.Util.IndexOutOfBoundsException;
public interface list<T> extends Collection<T> {
    void add(int index, T item);

    void set(int index, T item);

    T get(int index) throws IndexOutOfBoundsException;

    int indexOf(T item);

    int lastIndexOf(T item);
    //
    T removeAt(int index) throws IndexOutOfBoundsException;

    list<T> subList(int from, int to) throws IndexOutOfBoundsException;
}



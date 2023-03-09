//import Java.Util.IndexOutOfBoundsException;
public interface list extends Collection {
    void add(int index, Object item);

    void set(int index, Object item);

    Object get(int index) throws IndexOutOfBoundsException;

    int indexOf(Object item);

    int lastIndexOf(Object item);
    //
    Object removeAt(int index) throws IndexOutOfBoundsException;

    list subList(int from, int to) throws IndexOutOfBoundsException;
}



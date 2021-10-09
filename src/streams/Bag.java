package streams;

import java.util.ArrayList;
import java.util.List;


/**
 * Generic class
 * @param <T>
 */

public class Bag<T> {

    private List<T> list;

    public Bag() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public void clear() {
        list.clear();
    }
}

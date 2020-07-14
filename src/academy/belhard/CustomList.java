package academy.belhard;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private Object[] items;
    private int size;

    public static final int INITIAL_CAPACITY = 3;
    public static final int INCREASE_CAPACITY_STEP = 10;

    public CustomList() {
        items = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T item) {
        if (size + 1 >= items.length) {
            increaseCapacity();
        }

        items[size] = item;
        size++;
    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }

        return (T) items[index];
    }

    public int getSize() {
        return size;
    }

    private void increaseCapacity() {
        int newArrayCapacity = items.length + INCREASE_CAPACITY_STEP;
        Object[] newArray = new Object[newArrayCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = items[i];
        }

        items = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomListIterator<>(size, items);
    }
}

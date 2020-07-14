package academy.belhard;

import java.util.Iterator;

public class CustomListIterator<T> implements Iterator<T> {
    private int size;
    private int currentIndex;
    private Object[] items;

    public CustomListIterator(int size, Object[] items) {
        this.size = size;
        this.items = items;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return size > currentIndex;
    }

    @Override
    public T next() {
        T result = (T) items[currentIndex];
        currentIndex++;

        return result;
    }
}

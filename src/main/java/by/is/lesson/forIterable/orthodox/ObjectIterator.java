package by.is.lesson.forIterable.orthodox;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectIterator implements Iterator<Object> {

    private int index = 0;
    private ObjectStr obj;

    public ObjectIterator(ObjectStr objectStr) {
        this.obj = objectStr;
        this.index = 3;
    }

    public boolean hasNext() {
        if (index == 3) return obj.hasFirst() || obj.hasSecond() || obj.hasThird();
        if (index == 2) return obj.hasFirst() || obj.hasSecond();
        if (index == 1) return obj.hasFirst();
        return false;
    }

    public Object next() throws NoSuchElementException {
        if (index <= 0) {
            throw new NoSuchElementException("No more elements in this word!");
        }
        try {
            if (index == 3) {
                return obj.getThirdObject();
            }
            if (index == 2) {
                return obj.getSecondObject();
            }
            return obj.getFirstObject();
        } finally {
            index--;
        }

    }

    @Override
    public void remove() {

    }
}

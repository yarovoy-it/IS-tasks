package by.is.lesson.forIterable.orthodox;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectIterator implements Iterator<Object> {

    private int count = 0;
    private ObjectStr obj;

    public ObjectIterator(ObjectStr objectStr) {
        this.obj = objectStr;
        this.count = 3;
    }

    public boolean hasNext() {
        return count > 0;
    }

    public Object next() throws NoSuchElementException {
        if (count <= 0) {
            throw new NoSuchElementException("No more elements in this word!");
        }
        try {
            if (count == 3) {
                return obj.getThirdObject();
            }
            if (count == 2) {
                return obj.getSecondObject();
            }
            return obj.getFirstObject();
        } finally {
            count--;
        }

    }

    @Override
    public void remove() {

    }
}

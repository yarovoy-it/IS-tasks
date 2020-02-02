package by.is.lesson.forIterable.orthodox;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectIterator implements Iterator<Object> {

    private Integer count = 0;
    private Object[] objects;

    public ObjectIterator(Object[] objects) {
        this.objects = objects;

    }

    public boolean hasNext() {
        if (count == objects.length) {
            return false;
        }
        return true;
    }


    public Object next() throws NoSuchElementException {
        if (count > objects.length) {
            throw new NoSuchElementException("No more elements in this word!");
        }
        return objects[count++];
    }

    @Override
    public void remove() {

    }
}
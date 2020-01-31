package by.is.lesson.forIterable.orthodox;

import java.util.Iterator;

public class ObjectStr implements Iterable<Object> {

    public Object firstObject = null;
    public Object secondObject = "123";
    public Object thirdObject = new Object();

    public Object getFirstObject() {
        return firstObject;
    }

    public void setFirstObject(Object firstObject) {
        this.firstObject = firstObject;
    }

    public boolean hasFirst() {
        return firstObject != null;
    }

    public Object getSecondObject() {
        return secondObject;
    }

    public void setSecondObject(Object secondObject) {
        this.secondObject = secondObject;
    }

    public boolean hasSecond() {
        return secondObject != null;
    }

    public Object getThirdObject() {
        return thirdObject;
    }

    public void setThirdObject(Object thirdObject) {
        this.thirdObject = thirdObject;
    }

    public boolean hasThird() {
        return thirdObject != null;
    }

    @Override
    public Iterator<Object> iterator() {
        return new ObjectIterator(this);
    }
}

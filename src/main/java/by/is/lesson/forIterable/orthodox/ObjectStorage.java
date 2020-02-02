package by.is.lesson.forIterable.orthodox;

import java.util.Iterator;

public class ObjectStorage implements Iterable<Object> {

    public Object firstObject = null;
    public Object secondObject = "123";
    public Object thirdObject = new Object();

    public Object getFirstObject() {
        return firstObject;
    }

    public void setFirstObject(Object firstObject) {
        this.firstObject = firstObject;
    }

    public Object getSecondObject() {
        return secondObject;
    }

    public void setSecondObject(Object secondObject) {
        this.secondObject = secondObject;
    }

    public Object getThirdObject() {
        return thirdObject;
    }

    public void setThirdObject(Object thirdObject) {
        this.thirdObject = thirdObject;
    }

    private Object[] load() {
        Object[] value = new Object[3];
        value[0] = this.getFirstObject();
        value[1] = this.getSecondObject();
        value[2] = this.getThirdObject();
        return value;
    }

    @Override
    public Iterator<Object> iterator() {
        return new ObjectIterator(this.load());
    }
}

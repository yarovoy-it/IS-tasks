package by.is.lesson.forIterable.reflection;

import java.lang.reflect.Field;
import java.util.Iterator;


public class ObjectStorageReflection implements Iterable {

    private Object firstObject = 3;
    public Object secondObject = "123";
    public Object thirdObject = new Object();

    private Object[] value() {
        Field[] fields = this.getClass().getDeclaredFields();
        int countFields = fields.length;
        Object[] values = new Object[countFields];
        for (int index = 0; index < countFields; index++) {
            try {
                values[index] = fields[index].get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return values;
    }

    @Override
    public Iterator<Object> iterator() {
        Iterator<Object> it = new Iterator<Object>() {
            private Object[] value = value();
            private int arrSize = value.length;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < arrSize;
            }

            @Override
            public Object next() {
                return value[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}






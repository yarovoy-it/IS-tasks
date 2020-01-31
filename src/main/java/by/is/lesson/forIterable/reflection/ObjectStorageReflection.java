package by.is.lesson.forIterable.reflection;

import java.lang.reflect.Field;
import java.util.Iterator;


public class ObjectStorageReflection implements Iterable {

    public Object firstObject = 3;
    public Object secondObject = "123";
    public Object thirdObject = new Object();

    private Object[] value() {
        int countFields = this.getClass().getFields().length;
        Field[] fields = this.getClass().getFields();
        Object[] values = new Object[countFields];
        for (int index = 0; index <= countFields - 1; index++) {
            try {

                String name = fields[index].getName();
                values[index] = this.getClass().getField(name).get(this);
            } catch (IllegalAccessException | NoSuchFieldException e) {
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
                return arrSize-- != 0;
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






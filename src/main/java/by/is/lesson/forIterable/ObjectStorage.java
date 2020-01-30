package by.is.lesson.forIterable;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Objects;


public class ObjectStorage implements Iterable {

    public Object frstObject = 3;
    public Object secondObject = "123";
    public Object thirdObject = new Object();

    private Object value() {
        int countFields = this.getClass().getFields().length;
        Object value = null;
        while (countFields != 0) {
            Field[] fields = this.getClass().getFields();
            try {
                String name = fields[countFields - 1].getName();
                value = this.getClass().getField(name).get(this);
                countFields--;
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            return value;
        }
        return value;
    }


    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return value();
            }

            @Override
            public void remove() {

            }
        };
    }
}






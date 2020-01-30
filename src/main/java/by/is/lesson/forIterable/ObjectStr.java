package by.is.lesson.forIterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectStr implements Iterable<ObjectStr>{

    public int frstObject;

    public ObjectStr(int frstObject) {
        this.frstObject = frstObject;
    }

    @Override
    public Iterator<ObjectStr> iterator() {
        return new Iterator<ObjectStr>() {
            private ObjectStr foo = new ObjectStr(0);

            @Override
            public boolean hasNext() {
                return foo.frstObject < ObjectStr.this.frstObject;
            }

            @Override
            public ObjectStr next() {
                if (!hasNext()) throw new NoSuchElementException();
                ObjectStr cur = foo;
                foo = new ObjectStr(cur.frstObject + 1);
                return cur;
            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public String toString() {
        return "ObjectStr{" +
                "frstObject=" + frstObject +
                '}';
    }
}

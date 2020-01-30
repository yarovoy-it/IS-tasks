package by.is.lesson.forIterable;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectStr implements Iterable<ObjectStr>{

    public int firstObject;

    public ObjectStr(int firstObject) {
        this.firstObject = firstObject;
    }

    @Override
    public Iterator<ObjectStr> iterator() {
        return new Iterator<ObjectStr>() {
            private ObjectStr foo = new ObjectStr(0);

            @Override
            public boolean hasNext() {
                return foo.firstObject < ObjectStr.this.firstObject;
            }

            @Override
            public ObjectStr next() {
                if (!hasNext()) throw new NoSuchElementException();
                ObjectStr cur = foo;
                foo = new ObjectStr(cur.firstObject + 1);
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
                "firstObject=" + firstObject +
                '}';
    }
}

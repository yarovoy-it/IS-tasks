package by.is.lesson.forIterable;


import by.is.lesson.forIterable.orthodox.ObjectStorage;
import by.is.lesson.forIterable.reflection.ObjectStorageReflection;

import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        ObjectStorageReflection objectStorageRef = new ObjectStorageReflection();
        for (Object o : objectStorageRef) {
            System.out.println(o);
        }

        ObjectStorage objectStorage = new ObjectStorage();
        for (Object o : objectStorage) {
            System.out.println(o);
        }



//        Iterator iterator = objectStorageRef.iterator();
//        System.out.println(" ----- - ------ ------");
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
    }
}

package by.is.lesson.forIterable;


import by.is.lesson.forIterable.reflection.ObjectStorageReflection;


public class Main {

    public static void main(String[] args) {

        ObjectStorageReflection objectStorageRef = new ObjectStorageReflection();
        for (Object o : objectStorageRef) {
            System.out.println(o);
        }
//
//        ObjectStr objectStorage = new ObjectStr();
//        for (Object o : objectStorage) {
//            System.out.println(o);
//        }

//        Iterator iterator = objectStorageRef.iterator();
//        System.out.println(" ----- - ------ ------");
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

    }
}

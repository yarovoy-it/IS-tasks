package by.is.lesson.forIterable;


import by.is.lesson.forIterable.orthodox.ObjectStr;

public class Main {

    public static void main(String[] args) {

//        ObjectStorageReflection objectStorage = new ObjectStorageReflection();
//        for (Object o : objectStorage) {
//            System.out.println(o);
//        }

        ObjectStr objectStorage = new ObjectStr();
        for (Object o : objectStorage) {
            System.out.println(o);
        }
    }
}

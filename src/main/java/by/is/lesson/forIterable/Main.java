package by.is.lesson.forIterable;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ObjectStr objectStorage = new ObjectStr(4);
        for (Object o : objectStorage) {
            System.out.println(o.toString());
        }

//        https://stackoverflow.com/questions/47066644/how-to-create-a-custom-iterator-in-java
    }
}

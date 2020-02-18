package by.is.lesson;


import by.is.lesson.folderTask.Folder;

import java.io.IOException;
import java.util.List;

import static by.is.lesson.recursion.TheBiggestValue.defineBiggestValue;

public class Main {




    public static void main(String[] args) {
        byte [] arrayByte = new byte[10];
        arrayByte[0] = 5;
        arrayByte[1] = 7;
        arrayByte[2] = 9;
        arrayByte[3] = 14;
        arrayByte[4] = 25;
        arrayByte[5] = 24;
        arrayByte[6] = 15;
        arrayByte[7] = 1;
        arrayByte[8] = 87;
        arrayByte[9] = 35;


        System.out.println(defineBiggestValue(arrayByte,0));

    }
}
//        List<Folder> fullHouse = aggregate(load());
//        System.out.print(fullHouse);

//        Map<Integer, Folder> idAndFolders = new HashMap<>();
//        for (Folder folder: load()) {
//            Integer fatherId = folder.getParentId();
//        }

//        ObjectStorageReflection objectStorageRef = new ObjectStorageReflection();
//        for (Object o : objectStorageRef) {
//            System.out.println(o);
//        }
//
//        ObjectStorage objectStorage = new ObjectStorage();
//        for (Object o : objectStorage) {
//            System.out.println(o);
//        }










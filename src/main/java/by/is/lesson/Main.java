package by.is.lesson;


import by.is.lesson.folderTask.Folder;

import java.util.List;

import static by.is.lesson.folderTask.FolderLoader.load;
import static by.is.lesson.folderTask.FolderUtil.aggregate;

public class Main {

    public static void printer(List<Folder> folders, String s) {
        String space = s;
        for (Folder folder : folders) {
            System.out.println(space + folder);
            if (folder.getChildFolder() != null) {
                space += "    ";
                printer(folder.getChildFolder(), space);
                space = space.substring(0, space.length() - 4);
            }

        }
    }

    public static void main(String[] args) {

//      List<Folder> fullHouse = aggregate(load());
        Main m = new Main();
        printer(aggregate(load()), "");
//        System.out.println(aggregate(load()));

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


    }
}




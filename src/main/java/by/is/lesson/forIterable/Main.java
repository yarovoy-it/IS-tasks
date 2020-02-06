package by.is.lesson.forIterable;


import by.is.lesson.forIterable.folder.Folder;
import by.is.lesson.forIterable.folder.FolderLoader;
import sun.security.pkcs11.wrapper.Functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Main m = new Main();
        m.getRelationship(FolderLoader.load().get(1));


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

    private Map<Folder, List<Folder>> getRelationship(Folder fatherId) {
//        Map<Folder, List<Folder>> femali = new HashMap<>();
//        femali.entrySet().stream().map(folderList -> folderList);
        Map<Folder, List<Folder>> folderMap = FolderLoader.load()
                .stream()
                .filter(folders -> folders.getParentId().equals(fatherId.getId()))
                .peek(fp -> System.out.println(fp))
                .collect(
                        Collectors.groupingBy(fatherId, folder -> folder));
//                        Collectors.groupingBy(fatherId, Collectors.mapping(fold->fold, Collectors.toList())));
//                        Collectors.groupingBy(fatherId, Collectors.toList()));

//        FolderLoader.load().stream().collect(Collectors.groupingBy())
//

//                .map(folder -> folder.getParentId(fatherId.getId())).collect()

//                          .collect(Collectors.toList());

//        List<Folder> folders = FolderLoader.load().stream().map(folder -> folder.setChildFolder(folders.)).collect(Collectors.toList());
//        System.out.println(folders);
//        https://stackoverflow.com/questions/47523258/java-stream-listobject-to-mapobject-listobject
//        https://stackoverflow.com/questions/20363719/java-8-listv-into-mapk-v
//        https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#toMap-java.util.function.Function-java.util.function.Function-
        System.out.println(folderMap);
        return null;
    }


}




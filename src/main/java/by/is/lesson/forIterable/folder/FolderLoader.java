package by.is.lesson.forIterable.folder;

import java.util.ArrayList;
import java.util.List;

public class FolderLoader {


    public static List<Folder> load() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder(1, null, "fundamental"));
        folders.add(new Folder(2, 1, "2firstGeneration"));
        folders.add(new Folder(4, 2, "4SecondGeneration"));
        folders.add(new Folder(5, 2, "5SecondGeneration"));
        folders.add(new Folder(8, 4, "8thirdGeneration"));
        folders.add(new Folder(9, 4, "9thirdGeneration"));
        folders.add(new Folder(10, 5, "3firstGeneration"));

        folders.add(new Folder(3, 1, "3firstGeneration"));
        folders.add(new Folder(6, 3, "6SecondGeneration"));
        folders.add(new Folder(7, 3, "7SecondGeneration"));
        folders.add(new Folder(11, 6, "3thirdGeneration"));
        folders.add(new Folder(12, 7, "3thirdGeneration"));
        folders.add(new Folder(13, 7, "3thirdGeneration"));
        folders.add(new Folder(14, 6, "fourthGeneration"));
        folders.add(new Folder(15, 6, "fourthGeneration"));
        return folders;
    }
}

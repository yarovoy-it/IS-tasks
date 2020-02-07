package by.is.lesson.folderTask;

import java.util.ArrayList;
import java.util.List;

public class FolderLoader {

    public static List<Folder> load() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder(1, 0, "fundamental"));
        folders.add(new Folder(2, 1, "firstGeneration"));
        folders.add(new Folder(4, 2, "SecondGeneration"));
        folders.add(new Folder(5, 2, "SecondGeneration"));
        folders.add(new Folder(8, 4, "thirdGeneration"));
        folders.add(new Folder(9, 4, "thirdGeneration"));
        folders.add(new Folder(10, 5, "firstGeneration"));

        folders.add(new Folder(3, 1, "firstGeneration"));
        folders.add(new Folder(6, 3, "SecondGeneration"));
        folders.add(new Folder(7, 3, "SecondGeneration"));
        folders.add(new Folder(11, 6, "thirdGeneration"));
        folders.add(new Folder(12, 7, "thirdGeneration"));
        folders.add(new Folder(13, 7, "thirdGeneration"));
        folders.add(new Folder(14, 6, "fourthGeneration"));
        folders.add(new Folder(15, 6, "fourthGeneration"));
        return folders;
    }
}

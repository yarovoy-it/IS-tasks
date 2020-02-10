package by.is.lesson.folderTask;

import java.util.ArrayList;
import java.util.List;

public class FolderLoader {

    public static List<Folder> load() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder(16, 0, "root"));
        folders.add(new Folder(17, 16, "firstRoot"));
        folders.add(new Folder(18, 16, "firstRoot"));
        folders.add(new Folder(19, 16, "firstRoot"));
        folders.add(new Folder(23, 22, "thirdRoot"));
        folders.add(new Folder(20, 19, "SecondRoot"));
        folders.add(new Folder(21, 19, "SecondRoot"));
        folders.add(new Folder(22, 19, "SecondRoot"));
        folders.add(new Folder(1, 0, "fundamental"));
        folders.add(new Folder(2, 1, "1firstGeneration"));
        folders.add(new Folder(3, 1, "1firstGeneration"));
        folders.add(new Folder(4, 1, "1firstGeneration"));
        folders.add(new Folder(5, 2, "SecondGeneration"));
        folders.add(new Folder(6, 2, "SecondGeneration"));
        folders.add(new Folder(7, 2, "SecondGeneration"));
        folders.add(new Folder(8, 4, "SecondGeneration"));
        folders.add(new Folder(9, 4, "SecondGeneration"));
        folders.add(new Folder(10, 5, "thirdGeneration"));
        folders.add(new Folder(11, 6, "thirdGeneration"));
        folders.add(new Folder(12, 7, "thirdGeneration"));
        folders.add(new Folder(13, 7, "thirdGeneration"));
        folders.add(new Folder(14, 6, "thirdGeneration"));
        folders.add(new Folder(15, 6, "thirdGeneration"));
        return folders;
    }
}

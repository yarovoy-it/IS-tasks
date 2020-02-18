package by.is.lesson.recursion;

import by.is.lesson.folderTask.Folder;

import java.util.List;

public class FolderPrint {

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


}

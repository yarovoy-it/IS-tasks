package by.is.lesson.folderTask;

import java.util.*;
import java.util.stream.Collectors;

public class FolderUtil {

    public static Map<Folder, List<Folder>> getRelationship(Folder father) {
        //dont like this realisation
        Map<Folder, List<Folder>> family = new HashMap<>();
        List<Folder> children = FolderLoader.load()
                .stream()
                .filter(fp -> Objects.nonNull(fp.getParentId()))
                .filter(folders -> folders.getParentId().equals(father.getId()))
                .collect(Collectors.toList());
        family.put(father, children);
        return family;
    }

    public static Folder setChild(Integer fatherId) {
        Optional<Folder> fatFather = FolderLoader.load()
                .stream()
                .filter(father -> father.getId().equals(fatherId))
                .map(father -> {
                    father.setChildFolder(
                            FolderLoader.load()
                                    .stream()
                                    .filter(child -> child.getParentId().equals(fatherId))
                                    .collect(Collectors.toList()));
                    return father;
                })
                .findFirst();
        return fatFather.orElseThrow(() -> new RuntimeException());
    }

    public static Map<Folder, List<Folder>> singleLoop(Integer id) {
        Map<Folder, List<Folder>> family = new HashMap<>();
        Folder father = null;
        List<Folder> children = new ArrayList<>();
        for (Folder folder : FolderLoader.load()) {
            if (folder.getId().equals(id) || folder.getParentId().equals(id)) {
                if (folder.getId().equals(id)) {
                    father = folder;
                } else {
                    children.add(folder);
                }
                family.put(father, children);
            }
        }
        return family;
    }

    public static Folder treeFolder() {
        for (Folder folder : FolderLoader.load()) {

        }

        return null;
    }


}



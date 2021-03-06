package by.is.lesson.folderTask;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FolderUtil {

    public static Folder aggregateSingle(List<Folder> list) {
        Map<Integer, Folder> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Folder temp = list.get(i);
            map.put(temp.getId(), temp);
            if (map.get(temp.getParentId()) == null) {
                map.put(temp.getParentId(), temp);
            }
            Folder fromMap = map.get(temp.getParentId());
            List<Folder>list1 = map.get(temp.getParentId()).getChildFolder();
            if (list1 == null) {
                list1 = new ArrayList<>();
                fromMap.setChildFolder(list1);
            }
            list1.add(temp);
            System.out.println(list1);
        }
        Folder collected = map.get(0);
        return null;
    }

    public static List<Folder> aggregate(List<Folder> list) {
        Map<Integer, List<Folder>> map = list
                .stream()
                .collect(
                        Collectors.groupingBy(Folder::getParentId,
                                Collectors.mapping(Function.identity(),
                                        Collectors.toList())));
        return combineTreeStructure(map, list);
    }

    private static List<Folder> combineTreeStructure(Map<Integer, List<Folder>> map, List<Folder> list) {
        return list
                .stream()
                .peek(folder -> folder
                        .setChildFolder(map.get(folder.getId())))
                .filter(folder -> Objects.equals(folder.getParentId(), 0))
                .collect(Collectors.toList());
    }

    public static Map<Folder, List<Folder>> getRelationship(Folder father) {
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
}



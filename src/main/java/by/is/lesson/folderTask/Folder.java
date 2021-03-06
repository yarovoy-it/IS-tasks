package by.is.lesson.folderTask;

import java.util.List;

public class Folder {

    private Integer id;

    private Integer parentId;

    private String name;

    private List<Folder> childFolder;

    public Folder() {
    }

    public Folder(Integer id, Integer parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getChildFolder() {
        return childFolder;
    }

    public void setChildFolder(List<Folder> childFolder) {
        this.childFolder = childFolder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", childFolder=" + childFolder +
                '}';
    }
}

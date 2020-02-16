package by.is.lesson.pattern.factory;

public class Factory {

    public Solder create(String solder) {
        switch (solder) {
            case "warrior":
                return new Warrior();
            case "archer":
                return new Archer();
            default:
                return null;
        }
    }
}

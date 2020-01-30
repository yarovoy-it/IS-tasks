package by.is.lesson.forIterable;



public class Main {

    public static void main(String[] args) {

        ObjectStorage objectStorage = new ObjectStorage();
        for (Object o : objectStorage) {
            System.out.println(o);
        }
    }
}

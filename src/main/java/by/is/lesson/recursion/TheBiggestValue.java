package by.is.lesson.recursion;

public class TheBiggestValue {

    public static byte defineBiggestValue(byte[] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("not valid value");
        }
        return defineBiggestValueByRecursion(array, 0);
    }

    private static byte defineBiggestValueByRecursion(byte[] array, int index) {
        if (index < array.length) {
            byte biggestByte = array[index];
            biggestByte = biggestByte < defineBiggestValueByRecursion(array, index + 1) ? defineBiggestValueByRecursion(array, index + 1) : biggestByte;
            return biggestByte;
        }
        return -1;


    }


}

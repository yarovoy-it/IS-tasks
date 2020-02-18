package by.is.lesson.recursion;

public class TheBiggestValue {

    public static byte defineBiggestValue(byte[] array, int index) {
        if (array == null | array.length < 1) {
            throw new IllegalArgumentException("not valid value");
        }
        if (index < array.length) {
            byte biggestByte = array[index];
            biggestByte = biggestByte < defineBiggestValue(array, index + 1) ? defineBiggestValue(array, index + 1) : biggestByte;
            return biggestByte;
        }
        return -1;
    }


}

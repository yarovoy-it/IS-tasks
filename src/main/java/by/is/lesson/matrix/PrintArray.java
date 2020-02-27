package by.is.lesson.matrix;

import java.util.Arrays;

public class PrintArray {

    /**
     * Print 2d array
     *
     * @param array 2d
     */
    public static void printArray(int[][] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("Nothing to print");
        }
        for (int[] tempArray : array) {
            System.out.println(Arrays.toString(tempArray));
        }
    }

    /**
     * Print 2d array upend
     *
     * @param array 2d
     */
    public static void printArrayUpend(int[][] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("Nothing to print");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int colIndex = 0; colIndex < array[0].length; colIndex++) {
            for (int row = 0; row < array.length; row++) {
                stringBuilder.append(array[row][colIndex]).append(" ");
            }
            System.out.println(stringBuilder);
            stringBuilder = new StringBuilder();
        }
    }

}


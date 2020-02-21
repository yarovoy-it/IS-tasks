package by.is.lesson.matrix;

import java.util.Arrays;

public class PrintArray {

    public static void printArray(int[][] array) {
        for (int[] tempArray : array) {
            System.out.println(Arrays.toString(tempArray));
        }
    }

    public static void printArrayUpend(int[][] array) {
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


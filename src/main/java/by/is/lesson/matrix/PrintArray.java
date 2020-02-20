package by.is.lesson.matrix;

public class PrintArray {

    public static int[][] collectPyramidStructure(int[][] array) {
        int pirSize = array.length + array[0].length;
        int[][] pyramid = new int[pirSize][pirSize];
        for (int row = 0; row < pyramid.length; row++) {
            for (int col = 0; col < pyramid[row].length; col++) {
                int columns = 0;
                int rows = 0;
                if (row < pirSize / 2) {
                    rows = Math.min(row, col);
                } else {
                    rows = Math.min(pyramid.length - 1 - row, col);
                }
                if (col < pirSize / 2) {
                    columns = Math.min(row, col);
                } else {
                    columns = Math.min(row, pirSize - 1 - col);
                }
                pyramid[row][col] = Math.min(columns, rows);
            }
        }
        return pyramid;
    }

    public static void printPyramid(int[][] array) {
        int arraySize = array.length;
        int[][] fullArray = printArrayColumn(array);
        for (int row = 0; row < arraySize; row++) {
            for (int col = 0; col < arraySize; col++) {
                if (row < arraySize / 2) {
                    array[row][col] = Math.min(row, fullArray[row][col]);
                } else {
                    array[row][col] = Math.min((arraySize - 1 - row), fullArray[row][col]);
                }
                System.out.print(array[row][col]);
            }
            System.out.println("");
        }
    }

    private static int[][] printArrayColumn(int[][] array) {
        int arraySize = array.length;
        for (int row = 0; row < arraySize; row++) {
            for (int col = 0; col < arraySize; col++) {
                if (row < arraySize / 2) {
                    array[col][row] = row;
                } else {
                    array[col][row] = (arraySize - 1 - row);
                }
            }
        }
        return array;
    }


}

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

    public static void printArray(int[][] array) {
        for (int col = 0; col < array.length; col++) {
            for (int row = 0; row < array[col].length; row++) {
                System.out.print(array[col][col - col] + " ");
                array[col][row] = col;
                System.out.print(array[col][row] + " ");
            }
            System.out.println("");
        }
    }


}

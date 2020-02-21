package by.is.lesson.matrix;

public class PrintArray {

    /**
     * Method print array as pyramid structure
     *
     * 0 0 0 0 0 0 0
     * 0 1 1 1 1 1 0
     * 0 1 2 2 2 1 0
     * 0 1 2 3 2 1 0
     * 0 1 2 2 2 1 0
     * 0 1 1 1 1 1 0
     * 0 0 0 0 0 0 0
     * @param array
     */
    public static int[][] setArrayPyramidStructure(int[][] array) {
        int sizeColumn = array.length ;
        int sizeRow = array[0].length;
//        int[][] pyramid = new int[pirSize][pirSize];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int columns = 0;
                int rows = 0;
                if (row < sizeRow / 2) {
                    rows = Math.min(row, col);
                } else {
                    rows = Math.min(array.length - 1 - row, col);
                }
                if (col < sizeColumn / 2) {
                    columns = Math.min(row, col);
                } else {
                    columns = Math.min(row, sizeColumn - 1 - col);
                }
                array[row][col] = Math.min(columns, rows);
            }
        }
        return array;
    }

    public static void printArraySpiral(int[][] array){
        int arraySize = array.length;

        for (int row = 0; row < arraySize; row++) {
            for (int col = 0; col < arraySize; col++) {
                array[row][col] = col;

            }

        }

    }


}

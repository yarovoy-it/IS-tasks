package by.is.lesson.matrix;

public class BuildArray {

    /**
     * Method filling up array, as pyramid structure
     * <p>
     * 0 0 0 0 0 0 0
     * 0 1 1 1 1 1 0
     * 0 1 2 2 2 1 0
     * 0 1 2 3 2 1 0
     * 0 1 2 2 2 1 0
     * 0 1 1 1 1 1 0
     * 0 0 0 0 0 0 0
     *
     * @param rowSize    number of row
     * @param columnSize number of column
     * @return full array numbers
     */
    public static int[][] buildPyramidArray(int rowSize, int columnSize) {
        int tempValueColumn = 0;
        int tempValueRow = 0;
        int[][] array = new int[rowSize][columnSize];
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                if (row < rowSize / 2) {
                    tempValueRow = row;
                } else {
                    tempValueRow = rowSize - 1 - row;
                }
                if (column < columnSize / 2) {
                    tempValueColumn = column;
                } else {
                    tempValueColumn = columnSize - 1 - column;
                }
                array[row][column] = Math.min(tempValueColumn, tempValueRow);
            }
        }
        return array;
    }


}

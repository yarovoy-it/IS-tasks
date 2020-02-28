package by.is.lesson.matrix;

public class BuildArray {

    /**
     * Method filling up array, as pyramid structure. One by one cell
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
    public static int[][] buildPyramidArrayСonsistently(int rowSize, int columnSize) {
        int tempValueColumn;
        int tempValueRow;
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

    /**
     * Method filling up array, as pyramid structure.
     * Separating array on four part then defined value for top left part  and setting them on other piece.
     * <p>
     * 0 0 | 0 0
     * 0 1 | 1 0
     * ----------
     * 0 1 | 1 0
     * 0 0 | 0 0
     *
     * @param rowSize    number of row
     * @param columnSize number of column
     * @return full array numbers
     */
    public static int[][] buildPyramidBySeparate(int rowSize, int columnSize) {
        int rows = rowSize % 2 == 0 ? rowSize / 2 : (rowSize / 2)+1;
        int columns = columnSize % 2 == 0 ? columnSize / 2 : (columnSize / 2)+1;
        int[][] array = new int[rowSize][columnSize];
        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                int currentValue = Math.min(row, column);
                array[row][column] = currentValue;
                array[rowSize - 1 - row][column] = currentValue;
                array[row][columnSize - 1 - column] = currentValue;
                array[rowSize - 1 - row][columnSize - 1 - column] = currentValue;
            }
        }
        return array;
    }


}

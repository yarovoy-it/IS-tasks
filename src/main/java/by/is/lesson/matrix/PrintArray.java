package by.is.lesson.matrix;

public class PrintArray {

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

    public static void printArrayFirst(int[][] array) {
        for (int mainArray = 0; mainArray < array.length; mainArray++) {
            for (int subArray = 0; subArray < array[mainArray].length; subArray++) {
                System.out.print(array[mainArray][mainArray] + " ");
                array[mainArray][subArray] = subArray;
                System.out.print(array[mainArray][mainArray] + " ");
            }
            System.out.println(array[mainArray][mainArray]);
        }
    }


}

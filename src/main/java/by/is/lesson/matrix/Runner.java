package by.is.lesson.matrix;

import static by.is.lesson.matrix.PrintArray.printPyramid;


public class Runner {

    public static void main(String[] args) {

        int[][] wave = new int[7][7];
        int[][] matrix = new int[3][4];
//        int[][] array = collectPyramidStructure(matrix);
//        StringBuilder sb2 = new StringBuilder();
//        for (int[] tempArray : array) {
//            sb2.append(Arrays.toString(tempArray)).append('\n');
//        }
//        System.out.println(sb2);


//        printArray(matrix);

//        System.out.println();
        printPyramid(wave);
    }

}


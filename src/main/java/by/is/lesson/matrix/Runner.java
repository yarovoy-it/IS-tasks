package by.is.lesson.matrix;

import java.util.Arrays;

import static by.is.lesson.matrix.PrintArray.collectPyramidStructure;

public class Runner {

    public static void main(String[] args) {

        int[][] array = new int[7][7];


        StringBuilder sb2 = new StringBuilder();
        for (int[] tempArray : collectPyramidStructure(array)) {
            sb2.append(Arrays.toString(tempArray)).append('\n');
        }
        System.out.println(sb2);

    }

}


package by.is.lesson.matrix;

import static by.is.lesson.matrix.BuildArray.buildPyramidBySeparate;
import static by.is.lesson.matrix.PrintArray.printArray;


public class Runner {

    public static void main(String[] args) {

        int[][] array = buildPyramidBySeparate(5, 7);

        printArray(array);


    }

}


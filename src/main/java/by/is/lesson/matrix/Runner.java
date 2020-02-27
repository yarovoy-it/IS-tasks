package by.is.lesson.matrix;

import static by.is.lesson.matrix.BuildArray.buildPyramidArray;
import static by.is.lesson.matrix.PrintArray.printArray;
import static by.is.lesson.matrix.PrintArray.printArrayUpend;


public class Runner {

    public static void main(String[] args) {

        int[][] array = buildPyramidArray(14, 6);

        printArray(array);

        printArrayUpend(array);




    }

}


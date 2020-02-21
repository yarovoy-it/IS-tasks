package by.is.lesson.matrix;

import static by.is.lesson.matrix.BuildArray.buildPyramidArray;
import static by.is.lesson.matrix.PrintArray.printArray;
import static by.is.lesson.matrix.PrintArray.printArrayUpend;


public class Runner {

    public static void main(String[] args) {

        int[][] array = buildPyramidArray(4, 6);
        printArray(array);
        printArrayUpend(array);

//        for (int[] tempArray : buildArrayPyramidStructure(array)) {
//            System.out.println(Arrays.toString(tempArray));
//        }


    }

}


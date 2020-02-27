package by.is.lesson.lcm;

public class Multiple {

    public static long lcmOfArrayElements(int[] array) {
        long lcm = 1;
        int divisor = 2;
        while (true) {
            int counter = 0;
            boolean divisible = false;
            for (int index = 0; index < array.length; index++) {
//                if (array[index] == 0) {
//                    return 0;
//                }
//                if (array[index] < 0) {
//                    array[index] = array[index] * (-1);
//                }
                if (array[index] == 1) {
                    counter++;
                }
                if (array[index] % divisor == 0) {
                    divisible = true;
                    array[index] = array[index] / divisor;
                }
            }
            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
            if (counter == array.length) {
                return lcm;
            }
        }
    }
}

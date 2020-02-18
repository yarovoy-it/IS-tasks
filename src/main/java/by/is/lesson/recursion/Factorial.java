package by.is.lesson.recursion;

public class Factorial {

    public int defineFactorials(int factorial) {
        int sum = 1;
        if (factorial == 1 || factorial == 0) {
            return sum;
        }
        sum = factorial * defineFactorials(factorial - 1);
        System.out.println(sum);
        return sum;
    }
}

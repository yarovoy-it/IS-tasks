package by.is.lesson;

public class TestClass {

    public int defineFactorials(int factorial) {
        if (1 < factorial) {
            System.out.println("done");
        }
        int sum = factorial * defineFactorials(factorial - 1) ;
        return sum;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        System.out.println(tc.defineFactorials(5));

    }


}

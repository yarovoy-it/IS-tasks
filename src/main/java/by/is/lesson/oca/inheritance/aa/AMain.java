package by.is.lesson.oca.inheritance.aa;

public class AMain {

    public static void main(String[] args) {
        A a = new A();
        AA aa = new AA();
        a = aa;
        aa = (AA) a;

        AA a2 = new AA();
        System.out.println(a2.a);

    }
}

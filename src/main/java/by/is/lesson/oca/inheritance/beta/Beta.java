package by.is.lesson.oca.inheritance.beta;

public class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String arg[]) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }

}

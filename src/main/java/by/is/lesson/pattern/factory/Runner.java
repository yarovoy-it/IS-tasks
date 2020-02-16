package by.is.lesson.pattern.factory;

public class Runner {

    public static void main(String[] args){
        Factory factory = new Factory();
        Solder s1 = factory.create("warrior");
        Solder s2 = factory.create("archer");
        s1.say();
        s2.say();
    }
}

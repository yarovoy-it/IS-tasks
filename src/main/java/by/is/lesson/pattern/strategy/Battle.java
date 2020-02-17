package by.is.lesson.pattern.strategy;

import by.is.lesson.pattern.strategy.model.Archer;
import by.is.lesson.pattern.strategy.model.General;
import by.is.lesson.pattern.strategy.model.Musketeer;
import by.is.lesson.pattern.strategy.model.Warrior;

public class Battle {

    public static void main(String[] args) {
        System.out.println("-------Create warrior");
        Warrior w = new Warrior();
        System.out.println(w.attack());
        System.out.println(w.move());
        System.out.println(w.say());
        System.out.println("-------Destroy warrior \n");

        System.out.println("-------Create archer");
        Archer a = new Archer();
        System.out.println(a.attack());
        System.out.println(a.move());
        System.out.println(a.say());
        System.out.println("-------Destroy archer \n");

        System.out.println("-------Create general");
        General g = new General();
        System.out.println(g.attack());
        System.out.println(g.move());
        System.out.println(g.say());
        System.out.println("-------Destroy general \n");

        System.out.println("-------Create Musketeer");
        Musketeer m = new Musketeer();
        System.out.println(m.attack());
        System.out.println(m.move());
        System.out.println(m.say());
        System.out.println("-------Destroy Musketeer \n");

    }
}

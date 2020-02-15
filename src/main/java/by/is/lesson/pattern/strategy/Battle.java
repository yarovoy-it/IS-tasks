package by.is.lesson.pattern.strategy;

import by.is.lesson.pattern.strategy.logic.ActionStrategy;
import by.is.lesson.pattern.strategy.logic.impl.ArcherActionImpl;
import by.is.lesson.pattern.strategy.logic.impl.GeneralActionImpl;
import by.is.lesson.pattern.strategy.logic.impl.WarriorActionImpl;

public class Battle {

    private static ActionStrategy strategy;

    public static void main(String[] args) {
        strategy = new GeneralActionImpl();
        System.out.print(strategy.attack());
        System.out.print(strategy.move());
        System.out.println(strategy.order());

        strategy = new ArcherActionImpl();
        System.out.print(strategy.attack());
        System.out.print(strategy.move());
        System.out.println(strategy.order());

        strategy = new WarriorActionImpl();
        System.out.print(strategy.attack());
        System.out.print(strategy.move());
        System.out.println(strategy.order());

    }
}

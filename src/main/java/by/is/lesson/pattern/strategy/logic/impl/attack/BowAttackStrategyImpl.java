package by.is.lesson.pattern.strategy.logic.impl.attack;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;
import by.is.lesson.pattern.strategy.logic.MoveStrategy;

public class BowAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "I`m attack with bow";
    }

}

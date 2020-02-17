package by.is.lesson.pattern.strategy.logic.impl.attack;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;

public class NotAttackStratageImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "I will not attack";
    }
}

package by.is.lesson.pattern.strategy.logic.impl.attack;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;

public class SwordAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "Kill them all by sword";
    }
}

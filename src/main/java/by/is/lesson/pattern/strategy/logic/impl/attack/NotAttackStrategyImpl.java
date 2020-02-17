package by.is.lesson.pattern.strategy.logic.impl.attack;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;

/**
 * They can not attack .
 */
public class NotAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "I will not attack";
    }
}

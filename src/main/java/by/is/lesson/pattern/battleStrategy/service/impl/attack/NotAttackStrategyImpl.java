package by.is.lesson.pattern.battleStrategy.service.impl.attack;

import by.is.lesson.pattern.battleStrategy.service.AttackStrategy;

/**
 * They can not attack .
 */
public class NotAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "I will not attack";
    }
}

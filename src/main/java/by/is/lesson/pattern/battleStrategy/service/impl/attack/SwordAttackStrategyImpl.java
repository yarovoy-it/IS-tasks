package by.is.lesson.pattern.battleStrategy.service.impl.attack;

import by.is.lesson.pattern.battleStrategy.service.AttackStrategy;

/**
 * They can attack by sword.
 */
public class SwordAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "Kill them all by sword";
    }
}

package by.is.lesson.pattern.strategy.logic.impl.attack;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;

/**
 * They can attack by guns.
 */
public class MusketAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "Piu pieY";
    }
}

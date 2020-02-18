package by.is.lesson.pattern.battleStrategy.service.impl.attack;

import by.is.lesson.pattern.battleStrategy.service.AttackStrategy;

/**
 * They can attack by guns.
 */
public class MusketAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "Piu pieY";
    }
}

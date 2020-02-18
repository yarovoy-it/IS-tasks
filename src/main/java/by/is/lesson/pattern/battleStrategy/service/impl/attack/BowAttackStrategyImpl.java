package by.is.lesson.pattern.battleStrategy.service.impl.attack;

import by.is.lesson.pattern.battleStrategy.service.AttackStrategy;

/**
 * They can attack by bow.
 */
public class BowAttackStrategyImpl implements AttackStrategy {
    @Override
    public String attack() {
        return "I`m attack with bow";
    }

}

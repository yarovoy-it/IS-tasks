package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.impl.say.SilenceSayStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.attack.SwordAttackStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.move.WalkMoveStrategyImpl;

public class Warrior extends Solder {

    private boolean shield;

    public Warrior() {
        setAttackStrategy(new SwordAttackStrategyImpl());
        setMoveStrategy(new WalkMoveStrategyImpl());
        setSayStrategy(new SilenceSayStrategyImpl());
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }
}

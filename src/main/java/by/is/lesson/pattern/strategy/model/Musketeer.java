package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.impl.attack.MusketAttackStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.say.SilenceSayStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.move.WalkMoveStrategyImpl;

public class Musketeer extends Solder {

    public Musketeer() {
        setAttackStrategy(new MusketAttackStrategyImpl());
        setMoveStrategy(new WalkMoveStrategyImpl());
        setSayStrategy(new SilenceSayStrategyImpl());
    }
}

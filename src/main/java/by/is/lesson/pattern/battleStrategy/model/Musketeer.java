package by.is.lesson.pattern.battleStrategy.model;

import by.is.lesson.pattern.battleStrategy.service.impl.attack.MusketAttackStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.say.SilenceSayStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.move.WalkMoveStrategyImpl;

public class Musketeer extends Solder {

    public Musketeer() {
        setAttackStrategy(new MusketAttackStrategyImpl());
        setMoveStrategy(new WalkMoveStrategyImpl());
        setSayStrategy(new SilenceSayStrategyImpl());
    }
}

package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.impl.attack.BowAttackStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.move.ImmobileMoveStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.say.SilenceSayStrategyImpl;

public class Archer extends Solder {

    private Integer arrow;

    public Archer(){
        setAttackStrategy(new BowAttackStrategyImpl());
        setMoveStrategy(new ImmobileMoveStrategyImpl());
        setSayStrategy(new SilenceSayStrategyImpl());
    }

    public Integer getArrow() {
        return arrow;
    }

    public void setArrow(Integer arrow) {
        this.arrow = arrow;
    }
}

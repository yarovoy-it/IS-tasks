package by.is.lesson.pattern.battleStrategy.model;

import by.is.lesson.pattern.battleStrategy.service.impl.attack.BowAttackStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.move.ImmobileMoveStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.say.SilenceSayStrategyImpl;

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

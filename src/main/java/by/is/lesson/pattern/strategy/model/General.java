package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.impl.attack.NotAttackStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.move.WalkMoveStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.say.CommandSayStrategyImpl;

public class General extends Solder {

    private String order;

    public General() {
        setAttackStrategy(new NotAttackStrategyImpl());
        setMoveStrategy(new WalkMoveStrategyImpl());
        setSayStrategy(new CommandSayStrategyImpl());
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}

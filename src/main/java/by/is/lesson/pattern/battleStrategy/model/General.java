package by.is.lesson.pattern.battleStrategy.model;

import by.is.lesson.pattern.battleStrategy.service.impl.attack.NotAttackStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.move.WalkMoveStrategyImpl;
import by.is.lesson.pattern.battleStrategy.service.impl.say.CommandSayStrategyImpl;

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

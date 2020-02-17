package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.impl.attack.NotAttackStratageImpl;
import by.is.lesson.pattern.strategy.logic.impl.move.WalkMoveStrategyImpl;
import by.is.lesson.pattern.strategy.logic.impl.say.OrderSayStrategyImpl;

public class General extends Solder {

    private String order;

    public General() {
        setAttackStrategy(new NotAttackStratageImpl());
        setMoveStrategy(new WalkMoveStrategyImpl());
        setSayStrategy(new OrderSayStrategyImpl());
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}

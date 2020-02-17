package by.is.lesson.pattern.strategy.logic.impl.move;

import by.is.lesson.pattern.strategy.logic.MoveStrategy;

public class WalkMoveStrategyImpl implements MoveStrategy {
    @Override
    public String move() {
        return "Go go go";
    }
}

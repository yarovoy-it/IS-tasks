package by.is.lesson.pattern.strategy.logic.impl.move;

import by.is.lesson.pattern.strategy.logic.MoveStrategy;

public class ImmobileMoveStrategyImpl implements MoveStrategy {
    @Override
    public String move() {
        return "I`m can`t move";
    }
}

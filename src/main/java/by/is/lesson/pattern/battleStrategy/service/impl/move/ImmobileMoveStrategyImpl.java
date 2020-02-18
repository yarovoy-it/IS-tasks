package by.is.lesson.pattern.battleStrategy.service.impl.move;

import by.is.lesson.pattern.battleStrategy.service.MoveStrategy;

/**
 * These soldiers can not move
 */
public class ImmobileMoveStrategyImpl implements MoveStrategy {
    @Override
    public String move() {
        return "I`m can`t move";
    }
}

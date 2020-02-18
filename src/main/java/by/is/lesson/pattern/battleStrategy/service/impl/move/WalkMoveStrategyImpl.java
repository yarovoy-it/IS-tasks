package by.is.lesson.pattern.battleStrategy.service.impl.move;

import by.is.lesson.pattern.battleStrategy.service.MoveStrategy;

/**
 * Strategy, for walking soldiers.
 */
public class WalkMoveStrategyImpl implements MoveStrategy {
    @Override
    public String move() {
        return "Go go go";
    }
}

package by.is.lesson.pattern.strategy.logic.impl;

import by.is.lesson.pattern.strategy.logic.ActionStrategy;

public class ArcherActionImpl implements ActionStrategy {
    @Override
    public Integer move() {
        return null;
    }

    @Override
    public Double attack() {
        return 30.0;
    }

    @Override
    public String order() {
        return null;
    }

}

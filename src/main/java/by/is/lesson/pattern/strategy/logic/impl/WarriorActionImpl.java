package by.is.lesson.pattern.strategy.logic.impl;

import by.is.lesson.pattern.strategy.logic.ActionStrategy;

public class WarriorActionImpl implements ActionStrategy {
    @Override
    public Integer move() {
        return 10;
    }

    @Override
    public Double attack() {
        return 20.0;
    }

    @Override
    public String order() {
        return null;
    }

}

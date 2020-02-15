package by.is.lesson.pattern.strategy.logic.impl;

import by.is.lesson.pattern.strategy.logic.ActionStrategy;

public class GeneralActionImpl implements ActionStrategy {
    @Override
    public Integer move() {
        return 5;
    }

    @Override
    public Double attack() {
        return null;
    }

    @Override
    public String order() {
        return "Attack !!!!!";
    }

}

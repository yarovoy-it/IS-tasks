package by.is.lesson.pattern.strategy.logic.impl.say;

import by.is.lesson.pattern.strategy.logic.SayStrategy;

/**
 * For soldiers who can't say nothing.
 */
public class SilenceSayStrategyImpl implements SayStrategy {
    @Override
    public String say() {
        return "mmmmmmmmmmmmm";
    }
}

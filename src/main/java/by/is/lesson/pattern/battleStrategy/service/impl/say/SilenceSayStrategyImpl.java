package by.is.lesson.pattern.battleStrategy.service.impl.say;

import by.is.lesson.pattern.battleStrategy.service.SayStrategy;

/**
 * For soldiers who can't say nothing.
 */
public class SilenceSayStrategyImpl implements SayStrategy {
    @Override
    public String say() {
        return "mmmmmmmmmmmmm";
    }
}

package by.is.lesson.pattern.strategy.logic.impl.say;

import by.is.lesson.pattern.strategy.logic.SayStrategy;

/**
 * For soldiers how can command
 */
public class CommandSayStrategyImpl implements SayStrategy {
    @Override
    public String say() {
        return "Do something !!!";
    }
}

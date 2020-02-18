package by.is.lesson.pattern.battleStrategy.service.impl.say;

import by.is.lesson.pattern.battleStrategy.service.SayStrategy;

/**
 * For soldiers how can command
 */
public class CommandSayStrategyImpl implements SayStrategy {
    @Override
    public String say() {
        return "Do something !!!";
    }
}

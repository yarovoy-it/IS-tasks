package by.is.lesson.pattern.strategy.model;

import by.is.lesson.pattern.strategy.logic.AttackStrategy;
import by.is.lesson.pattern.strategy.logic.MoveStrategy;
import by.is.lesson.pattern.strategy.logic.SayStrategy;

public abstract class Solder {

    private Long id;

    private AttackStrategy attackStrategy;

    private MoveStrategy moveStrategy;

    private SayStrategy sayStrategy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public SayStrategy getSayStrategy() {
        return sayStrategy;
    }

    public void setSayStrategy(SayStrategy sayStrategy) {
        this.sayStrategy = sayStrategy;
    }

    public String attack() {
        return this.attackStrategy.attack();
    }

    public String move() {
        return this.moveStrategy.move();
    }

    public String say() {
        return this.sayStrategy.say();
    }
}

package by.is.lesson.pattern.battleStrategy.model;

import by.is.lesson.pattern.battleStrategy.service.AttackStrategy;
import by.is.lesson.pattern.battleStrategy.service.MoveStrategy;
import by.is.lesson.pattern.battleStrategy.service.SayStrategy;

public abstract class Solder {

    private Long id;

    private AttackStrategy attackStrategy;

    private MoveStrategy moveStrategy;

    private SayStrategy sayStrategy;

    public String attack() {
        return this.attackStrategy.attack();
    }

    public String move() {
        return this.moveStrategy.move();
    }

    public String say() {
        return this.sayStrategy.say();
    }


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


}

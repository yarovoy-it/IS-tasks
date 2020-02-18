package by.is.lesson.pattern.shopStrategy.strategy.impl;

import by.is.lesson.pattern.shopStrategy.strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("paid with credit/debit card");
    }
}

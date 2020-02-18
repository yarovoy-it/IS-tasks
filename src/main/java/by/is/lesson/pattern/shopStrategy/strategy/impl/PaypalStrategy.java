package by.is.lesson.pattern.shopStrategy.strategy.impl;

import by.is.lesson.pattern.shopStrategy.strategy.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("paid using Paypal.");
    }

}

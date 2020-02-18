package by.is.lesson.pattern.shopStrategy.model;

import by.is.lesson.pattern.shopStrategy.strategy.PaymentStrategy;
import by.is.lesson.pattern.shopStrategy.strategy.impl.CreditCardStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        setPaymentStrategy(new CreditCardStrategy());
        this.items = new ArrayList<Item>();
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void pay() {
        this.paymentStrategy.pay();
    }
}

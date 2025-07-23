package com.dp.strategy;

// Step 1: Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Step 3: Context class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set strategy dynamically
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        paymentStrategy.pay(amount);
    }
}

// Step 4: Client code
public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // User chooses to pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // User switches to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}
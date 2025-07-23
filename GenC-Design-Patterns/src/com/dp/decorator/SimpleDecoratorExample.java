package com.dp.decorator;

// Step 1: Define the base interface
interface Coffee {
    String getDescription();
}

// Step 2: Create a concrete implementation
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Plain Coffee";
    }
}

// Step 3: Create a decorator class that implements the same interface
class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }
}

class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }
}

// Step 4: Client code
public class SimpleDecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()); // Plain Coffee

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()); // Plain Coffee + Milk

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()); // Plain Coffee + Milk + Sugar
    }
}
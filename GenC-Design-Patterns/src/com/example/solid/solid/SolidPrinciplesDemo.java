package com.example.solid.solid;

/**
 * Demonstrates SOLID principles in Java with a notification system.
 */
public class SolidPrinciplesDemo {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        NotificationService service = new NotificationService(emailNotifier);
        service.send("Welcome to SOLID principles!");

        service.setNotifier(smsNotifier);
        service.send("Your OTP is 123456");
    }
}

/**
 * S - Single Responsibility Principle (SRP)
 * Each class has one responsibility.
 * Notifier interface is responsible for sending notifications.
 */
interface Notifier {
    void notifyUser(String message);
}

/**
 * O - Open/Closed Principle (OCP)
 * Classes are open for extension but closed for modification.
 * You can add new types of notifiers without changing existing code.
 */
class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

/**
 * L - Liskov Substitution Principle (LSP)
 * Subtypes must be substitutable for their base types.
 * EmailNotifier and SMSNotifier can be used wherever Notifier is expected.
 */

/**
 * I - Interface Segregation Principle (ISP)
 * Notifier interface is simple and specific.
 * Clients are not forced to depend on methods they do not use.
 */

/**
 * D - Dependency Inversion Principle (DIP)
 * High-level modules depend on abstractions, not concrete classes.
 * NotificationService depends on Notifier interface.
 */
class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.notifyUser(message);
    }
}
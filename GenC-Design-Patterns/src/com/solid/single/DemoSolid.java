package com.solid.single;

public class DemoSolid {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.notifyUser("Welcome to the SOLID principles!");

        Notifier smsNotifier = new SMSNotifier();
        smsNotifier.notifyUser("Your order has been shipped!");

    }
}

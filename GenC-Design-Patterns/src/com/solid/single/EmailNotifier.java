package com.solid.single;

public class EmailNotifier implements Notifier {

    public void notifyUser(String message) {
        // Logic to send an email notification
        System.out.println("Email sent with message: " + message);
    }

}

package com.dp.singleton;

class Bird{

    private Bird() {
        System.out.println("Bird constructor called");
    }
    
    public void fly(){
        System.out.println("Bird is flying");
    }
    
    public static Bird getInstance() {
        return new Bird();
    }
}

public class SingletonConcept {

    public static void main(String[] args) {


       Bird b1 =  Bird.getInstance();
       b1.fly();

       System.out.println("Bird b1: " + b1);

       Bird b2 = Bird.getInstance();
       b2.fly();

       System.out.println("Bird b2: " + b2);

        // Bird bird = new Bird();
        // bird.fly();
        // System.out.println("Bird 1: " + bird);
        // System.out.println("Bird 1: " + bird);

        // Bird bird2 = new Bird();
        // bird2.fly();
        // System.out.println("Bird 2: " + bird2);
    }

}

package com.dp.singleton;

class Bird{
    public void fly(){
        System.out.println("Bird is flying");
    }
}

public class SingletonConcept {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        System.out.println("Bird 1: " + bird);
        System.out.println("Bird 1: " + bird);

        Bird bird2 = new Bird();
        bird2.fly();
        System.out.println("Bird 2: " + bird2);
    }

}

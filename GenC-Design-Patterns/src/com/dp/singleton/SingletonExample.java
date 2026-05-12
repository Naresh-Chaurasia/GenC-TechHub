package com.dp.singleton;


// Only one instance of class.
// If new instance is created, it should return the same instance.


class Trainer{

    private static Trainer instance;

    private Trainer() {
        
    }

    public static Trainer getInstance() {
        if (instance == null) {
            instance = new Trainer();
        }
        return instance;
    }

}


public class SingletonExample {

    public static void main(String[] args) {

        Trainer t1 = Trainer.getInstance();
        System.out.println(t1);

        Trainer t2 = Trainer.getInstance();
        System.out.println(t2);

    }



}

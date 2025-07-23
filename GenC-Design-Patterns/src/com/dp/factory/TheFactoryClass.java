package com.dp.factory;

interface Person {
    public void talk();
}

class Male implements Person {
    public void talk() {
        System.out.println("Male is talking");
    }
}

class Female implements Person {
    public void talk() {
        System.out.println("Female is talking");
    }
}

class Other implements Person {
    public void talk() {
        System.out.println("Other is talking");
    }
}

public class TheFactoryClass {


    static Person getPerson(String type) {
        Person p = null;
        if (type.equalsIgnoreCase("m")) {
            p = new Male();
        } else if (type.equalsIgnoreCase("f")) {
            p = new Female();
        } else {
            p = new Other();
        }
        return p;
    }

}

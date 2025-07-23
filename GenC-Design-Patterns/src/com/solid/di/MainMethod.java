package com.solid.di;

class CallCar {
    public void callingCar() {
        Car car = new Car();
        car.start();
    }
}

public class MainMethod {

    public static void main(String[] args) {
        CallCar callCar = new CallCar();
        callCar.callingCar();
    }

}

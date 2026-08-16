package com.isaachome.demo;


class Vehicle{
    void startEngine(){
        System.out.println("Vehicle is started");
    }
}
class Car extends Vehicle{

    @Override
    void startEngine(){
        System.out.println("Car is started");
    }
}

class Truck extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Truck is started");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        Truck truck = new Truck();
        truck.startEngine();

    }
}

package com.isaachome.designpattern.cars;

// Feature of a Car
class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        if (this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        }else {
            System.out.println("Car isn't started");
        }
    }
}

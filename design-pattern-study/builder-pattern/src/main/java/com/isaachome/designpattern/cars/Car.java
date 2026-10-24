package com.isaachome.designpattern.cars;

// Product
class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel =0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        if(this.tripComputer != null){
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "\ncarType= " + carType +
                "\nseats= " + seats +
                "\nengine= " + engine +
                "\ntransmission= " + transmission +
                "\ntripComputer= " + tripComputer +
                "\ngpsNavigator= " + gpsNavigator +
                "\nfuel= " + fuel ;
    }
}

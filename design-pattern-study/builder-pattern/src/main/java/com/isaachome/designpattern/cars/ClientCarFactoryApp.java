package com.isaachome.designpattern.cars;

public class ClientCarFactoryApp {
    static void main() {
        // initialization of director
        var director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println( car);

        System.out.println("==============");
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        var manualCar = manualBuilder.getResult();
        System.out.println(manualCar.print());
    }
}

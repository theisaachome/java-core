package com.isaachome.designpattern.cars;

class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland Yard, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
    public String getRoute() {
        return route;
    }
}

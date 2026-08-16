package com.isaachome.demo.exercise;

class Device {
    protected void turnOn(){
        System.out.println("Turning on the device");
    }
}

class SmartPhone extends Device{
    @Override
    protected void turnOn() {
        System.out.println("Turning on the smart phone");
    }
    void makeCall(){
        System.out.println("Calling...");
    }
    public void turnOn(String time){
        System.out.println("Turning on the smart phone at "+time);
    }
}

class SmartWatch extends Device{

}
public class SmartDevice {
    static void main() {

    }
}

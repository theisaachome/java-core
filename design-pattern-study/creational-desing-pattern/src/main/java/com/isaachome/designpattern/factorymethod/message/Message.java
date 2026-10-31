package com.isaachome.designpattern.factorymethod.message;

abstract class Message {
    protected abstract void send();

    void addDefaultHeader() {
        System.out.println("This is a default header");
    }

    void encrypt() {
        System.out.println("Encrypting message");
    }
}

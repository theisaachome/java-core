package com.isaachome.designpattern.factorymethod.message;

class SMSMessage extends Message {
    @Override
    public void send() {
        System.out.println("SMS Message is sent");
    }
}

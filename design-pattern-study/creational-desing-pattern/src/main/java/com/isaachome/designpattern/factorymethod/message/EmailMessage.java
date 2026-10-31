package com.isaachome.designpattern.factorymethod.message;

class EmailMessage extends Message {
    @Override
    protected void send() {
        System.out.println("Email Message is sent");
    }
}

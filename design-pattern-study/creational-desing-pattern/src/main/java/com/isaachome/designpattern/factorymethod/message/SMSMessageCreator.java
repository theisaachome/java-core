package com.isaachome.designpattern.factorymethod.message;

public class SMSMessageCreator extends MessageCreator {
    @Override
    Message createMessage() {
        return new SMSMessage();
    }
}

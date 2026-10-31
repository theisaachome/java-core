package com.isaachome.designpattern.factorymethod.message;

public class EmailMessageCreator extends MessageCreator {
    @Override
    Message createMessage() {
        return new EmailMessage();
    }
}

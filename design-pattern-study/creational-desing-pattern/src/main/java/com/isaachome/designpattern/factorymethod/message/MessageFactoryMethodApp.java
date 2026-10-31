package com.isaachome.designpattern.factorymethod.message;

public class MessageFactoryMethodApp {
    static void main() {
        System.out.println("Message Factory Method");
        printMessage(new EmailMessageCreator());
        printMessage(new SMSMessageCreator());
    }

    static void printMessage(MessageCreator creator) {
        creator.createMessage().send();
        creator.createMessage().encrypt();
        creator.createMessage().addDefaultHeader();
    }
}



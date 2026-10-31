package com.isaachome.designpattern.factorymethod.message;

abstract class MessageCreator {

    /**
     * This is the factory method.
     *
     * @return A {@link Message}
     */
    abstract Message createMessage();

    /**
     * This is called by client code to get a message.
     *
     * @return A {@link Message}
     */
    Message getMessage() {
        var msg = createMessage();
        msg.addDefaultHeader();
        msg.encrypt();
        msg.send();
        return msg;
    }
}

package com.isaachome.demo;

class Notification{
    protected String receiver;
    public  Notification(String receiver){
        this.receiver = receiver;
    }

    protected void sendNotification(String message){
        System.out.println("Sending default notification to "+receiver+" : "+message+"!.");
    }
}
class EmailNotification extends Notification{
    public EmailNotification(String receiver) {
        super(receiver);
    }

    @Override
    protected void sendNotification(String message) {
        System.out.println("Sending email notification to "+receiver+" : "+message+"!.");
    }
}

class SMSNotification extends Notification{
    public SMSNotification(String receiver) {
        super(receiver);
    }
    @Override
    protected void sendNotification(String message) {
        System.out.println("Sending SMS notification to "+receiver+" : "+message+"!.");
    }
}
public class InheritanceExercise {
    static void main() {
        var emailNotification = new EmailNotification("isaachome");
        emailNotification.sendNotification("Hello");

        var smsNotification = new SMSNotification("isaachome");
        smsNotification.sendNotification("Hello");
    }
}

package com.isaachome.demo;

import java.time.LocalDateTime;

interface  Trainable{
    void attendTraining();
}
interface Interviewer{
    void conductInterview();
    default void submitInterviewStatus(){
        System.out.println("Accept");
    }
    static void bookConferenceRoom(LocalDateTime dateTime,int duration){
        System.out.println("Interview scheduled on:" + dateTime);
        System.out.println("Book Conference Room for : " + duration);
    }
}
class Employee{
    String name;
    String address;
    String phoneNumber;
    String experience;
    int salary;

    static void defaultPlan(){
        System.out.println("Default Plan");
    }
}
class Programmer extends Employee implements Trainable{
    void writeCode(){}
    @Override
    public void attendTraining() {
        System.out.println("Programmer attend training...");
    }
}
class Manager extends Employee implements Trainable ,Interviewer{
    @Override
    public void conductInterview() {
        System.out.println("Manager conduct interview...");
    }
    void reportStatus(){}

    @Override
    public void attendTraining() {
        System.out.println("Manager attend training...");
    }

    @Override
    public void submitInterviewStatus() {
        System.out.println("Manager submitting interview...");
    }
}
public class UseOfInterface {
    static void main() {
        var programmer = new  Programmer();
        var manager = new Manager();
        programmer.writeCode();
        programmer.attendTraining();
        programmer.defaultPlan();
        manager.reportStatus();
        manager.conductInterview();
        manager.attendTraining();
        manager.submitInterviewStatus();
        Interviewer.bookConferenceRoom(LocalDateTime.now(),30);
    }
}

interface MyInterface{
    int number=100;
    void method();
    interface interface2{}
    interface interface3{}
}

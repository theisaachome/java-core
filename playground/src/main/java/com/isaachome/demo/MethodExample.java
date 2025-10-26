package com.isaachome.demo;

class Phone{
    double weight;
    void setWeight(double val){
        weight = val;
    }
    double getWeight(){
        return this.weight;
    }
    boolean sendMessage(String phone,String msg){
        boolean msgSentStatus = false;
        if(send(phone,msg)){
            msgSentStatus = true;
        }
        return msgSentStatus;
    }
    boolean send(String phone,String msg){
        return   true;
    }
}
class Employee {
    int daysOfWork(int ...days){
        int daysOff = 0;
        if (days.length == 0){
            daysOff = 1;
        }
        for(int day : days){
            daysOff += day;
        }
        return   daysOff;
    }
}
public class MethodExample {
    static void main() {
        Phone phone = new Phone();
        phone.setWeight(20.0);
        System.out.println(phone.getWeight());
    }
}

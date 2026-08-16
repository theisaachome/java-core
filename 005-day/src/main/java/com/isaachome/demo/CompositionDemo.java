package com.isaachome.demo;

class Processor{
    int cores;
    int threads;
    int speed;
    public Processor(int cores,int threads,int speed){
        this.cores = cores;
        this.threads = threads;
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cores=" + cores +
                ", threads=" + threads +
                ", speed=" + speed +
                '}';
    }
}
class Monitor{
    int resolution;
    int refreshRate;
    public Monitor(int resolution,int refreshRate){
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }
    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", refreshRate=" + refreshRate +
                '}';
    }

    public int getResolution() {
        return resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }
}
class Keyboard{
    int keys;
    public Keyboard(int keys){
        this.keys = keys;
    }
    public int getKeys() {
        return keys;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keys=" + keys +
                '}';
    }
}
class Mouse{
    int buttons;
    public Mouse(int buttons){
        this.buttons = buttons;
    }
    public int getButtons() {
        return buttons;
    }
    @Override
    public String toString() {
        return "Mouse{" +
                "buttons=" + buttons +
                '}';
    }
}

class Computer{
    Processor processor;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    public Computer(Processor processor,Monitor monitor,Keyboard keyboard,Mouse mouse){
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
    @Override
    public String toString() {
        return "Computer::::" +
                "\nprocessor=" + processor +
                "\nmonitor=" + monitor +
                "\nkeyboard=" + keyboard +
                "\nmouse=" + mouse +
                '}';
    }
}
public class CompositionDemo {
    static void main() {
        var processor = new Processor(12,64,6400);
        var monitor = new Monitor(1920,60);
        var keyboard = new Keyboard(100);
        var mouse = new Mouse(2);
        var computer = new Computer(processor,monitor,keyboard,mouse);
        System.out.println(computer);
    }
}

package com.isaachome.study.machine;

public class OfficePrinter implements Printer, Scanner{
    @Override
    public void print() {
        System.out.println("OfficePrinter---Printing document");
    }

    @Override
    public void scan() {
        System.out.println("OfficePrinter---Scanning document");
    }
}

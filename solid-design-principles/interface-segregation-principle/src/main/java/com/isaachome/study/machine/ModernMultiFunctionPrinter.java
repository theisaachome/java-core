package com.isaachome.study.machine;

public class ModernMultiFunctionPrinter implements Printer, Scanner, Fax{
    @Override
    public void print() {
        System.out.println("ModernMultiFunctionPrinter---Printing document");
    }
    @Override
    public void scan() {
        System.out.println("ModernMultiFunctionPrinter---Scanning document");
    }
    @Override
    public void fax() {
        System.out.println("ModernMultiFunctionPrinter---Faxing document");
    }
}

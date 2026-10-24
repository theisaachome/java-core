package com.isaachome.study.machine;

public class BasePrinter implements Machine{
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fax() {
     throw new UnsupportedOperationException("Not supported yet.");
    }
}

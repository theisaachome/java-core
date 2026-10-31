package com.isaachome.designpattern.abstractfactory.bank;

public class CIMBAccount implements AccountService {
    @Override
    public void createAccount(String customerName) {
        System.out.println("CIMB Account Created for " + customerName);
    }
}

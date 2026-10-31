package com.isaachome.designpattern.abstractfactory.bank;

public class MayBankAccount implements AccountService {
    @Override
    public void createAccount(String customerName) {
        System.out.println("Creating MayBank account for " + customerName);
    }
}

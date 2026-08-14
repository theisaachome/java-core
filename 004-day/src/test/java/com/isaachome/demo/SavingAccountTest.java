package com.isaachome.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
    private SavingAccount savingAccount;
    private SavingAccount savingAccount2;

    @BeforeEach
    void setUp(){
        savingAccount = new SavingAccount("123456789",1000);
        savingAccount2 = new SavingAccount("123456789",1000);
    }

    @Test
    @DisplayName("Test Saving Account Deposit")
    void deposit(){
        savingAccount.deposit(1000);
        assertEquals(2000, savingAccount.getBalanceInCents());
    }
    @Test
    @DisplayName("Test Saving Account Withdraw")
    void withdraw(){
        savingAccount.withdraw(1000);
        assertEquals(0, savingAccount.getBalanceInCents());
    }

    @Test
    @DisplayName("Test Saving Account Transfer")
    void transfer(){
        savingAccount.transfer(500,savingAccount2);
        assertEquals(500, savingAccount.getBalanceInCents());
        assertEquals(1500, savingAccount2.getBalanceInCents());
    }
}
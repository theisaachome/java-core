package com.isaachome.demo.bank.kpay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    void setUp(){
        this.bankAccount = new BankAccount("123456789",1000.00,2468);

    }
    @Test
    void testToString(){
        assertEquals("BankAccount{accountNumber='123456789', balance=1000.0, pinCode=2468}",bankAccount.toString());
    }

    @Test
    @DisplayName("Test Bank Account Deposit")
    void testDeposit(){
        bankAccount.deposit(100.0);
        Assertions.assertEquals(1100.00,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test Bank Account Withdraw")
    void testWithdraw(){
        bankAccount.withdraw(500,2468);
        Assertions.assertEquals(500.00,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test Bank Account Withdraw with invalid pin")
    void testInvalidPin(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bankAccount.withdraw(500,1234));
    }

    @Test
    @DisplayName("Test Bank Account Withdraw with invalid amount")
    void testInvalidAmount(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bankAccount.withdraw(0,2468));
    }

}
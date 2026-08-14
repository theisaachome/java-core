package com.isaachome.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    private Money money;

    @BeforeEach
    void setUp(){
        money = new Money(1000);
    }
    @Test
    @DisplayName("Test Money Add")
    void testAdd(){
       var result= money.add(new Money(1000));
        Assertions.assertEquals(2000,result.getAmountInCents());
    }

    @Test
    @DisplayName("Test Money Substract")
    void testSubstract(){
        var result= money.substract(new Money(1000));
        Assertions.assertEquals(0,result.getAmountInCents());
    }
}
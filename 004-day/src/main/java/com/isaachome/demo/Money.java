package com.isaachome.demo;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Money {
    static {
        System.out.println("Money Class is loaded into JVM");
    }
    private final long amountInCents;
    private final Currency currency;

    Money(long amountinCents, Currency currency) {
        this.amountInCents = amountinCents;
        this.currency = currency;
    }
    Money(long amountinCents) {
        this(amountinCents, Currency.getInstance("USD"));
    }

    Money add(Money other){
        validateCurrency(other);
        return new Money(this.amountInCents + other.amountInCents, this.currency);
    }
    public Money substract(Money other){
        validateCurrency(other);
        return new Money(this.amountInCents - other.amountInCents, this.currency);
    }
    private void validateCurrency(Money other){
      if(!Objects.equals(this.currency, other.currency)){
          throw new IllegalArgumentException("Currency Mismatch");
      }
    }

//    public double getAmountInCents() {
//        return amountInCents / 100.0;
//    }


    public long getAmountInCents() {
        return amountInCents;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amountInCents=" + amountInCents +
                ", currency=" + currency +
                '}';
    }
}

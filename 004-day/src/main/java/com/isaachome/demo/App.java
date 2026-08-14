package com.isaachome.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       var bank = new BankAccount("Isaac",20000);
        System.out.printf("Balance: %f,\nName: %s",bank.getBalance(),bank.getAccountHolder());

        var user = new Account("username","username@gmail.com");
    }
}

package com.isaachome.demo;

public class Bank {
    private final  double accounts;

    public Bank(double accounts) {
        this.accounts = accounts;
    }




    static void main() {
        int STEPS=3;
        int MAX_AMOUNT = 1000;
        int DELAY = 1000;
       Runnable r = ()->{
         try {
             for (int i = 0; i < STEPS; i++) {
                 double amount = MAX_AMOUNT * Math.random();
                 new Bank().transfer(0,1,amount);
                 Thread.sleep((int)(DELAY * Math.random()));
             }
         } catch (Exception e) {
            // TODO: handle exception
         }
       };

       var t = new Thread(r);
       t.start();
    }
    void  transfer(int from, int to, double amount){
        System.out.println();
    }
}

package com.isaachome.designpattern.prototype.game;

public class Client {

    static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(0, 10, 20), 20);
        swordsman.attack();

        System.out.println(swordsman);

        var swordman2 = (Swordsman) swordsman.clone();
        swordman2.attack();
		
    }

}

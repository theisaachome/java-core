package com.isaachome.wildcard;

import java.util.Arrays;
import java.util.List;

class Meat{
    private String name;
    public Meat(String name){this.name = name;}

    public String getName() {
        return name;
    }
}
class Beef extends Meat{
    Beef(String name){super(name);}
}
class Chicken extends Meat{
    Chicken(String name){super(name);}
}
class Mutton extends Meat{
    Mutton(String name){super(name);}
}

public class WildCard {

    static double getList(List<? extends  Number> lists){
        double sum=0;
        for(Number n : lists){
            sum += n.doubleValue();
        }
        return  sum;
    }
    static void getMenu(List<? extends Meat> curries){
       curries.forEach(meat -> System.out.println("Curry : " + meat.getName()));
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Sum of Integer: "+getList(list));

        List<Double> doubles = Arrays.asList(2.2,3.3,4.4,5.5);
        System.out.println("Sum of Double: "+getList(doubles));

        System.out.println("==============");
        List<Meat> meats = Arrays.asList(new Beef("Beef"),new Chicken("Chicken"),new Mutton("Mutton"));
        getMenu(meats);
    }
}

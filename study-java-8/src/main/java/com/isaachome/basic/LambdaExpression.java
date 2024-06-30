package com.isaachome.basic;

@FunctionalInterface
interface StringToInteger{
    int map(String s);
}

@FunctionalInterface
interface Adder{
    int add(int x,int y);
}
@FunctionalInterface
interface  Joiner{
    String join(String s, String t);
}
public class LambdaExpression {
    public static void main(String[] args) {
        StringToInteger mapper = (String str)-> str.length();
        String name="Isaac";
        int nameLength = mapper.map(name);
        System.out.println("Name : " + nameLength + ", mapped Value : " + nameLength);

        Adder adder = (x, y) ->  x+y;
        Joiner joiner = (s,t) -> s+t;
        int num=adder.add(10,20);
        System.out.println( num);
        System.out.println(joiner.join("Hello","Java-8"));
        System.out.println("++++++++++++");
        System.out.println( add(adder,10,10));
        System.out.println(add((x,y)->x+y,20,20));

        System.out.println(join((x,y)-> x+y,"Hello","World"));

    }

    static int add(Adder adder,int x,int y){
        return  adder.add(x,y);
    }
   static  String join(Joiner joiner,String s, String t){
        return  joiner.join(s +" ", t);
   }

}
@FunctionalInterface
interface  MyComparator<T>{
    int compare(T o1,T o2);
}

@FunctionalInterface
interface MyProcessor{
    <T> void process(T[] list);
}
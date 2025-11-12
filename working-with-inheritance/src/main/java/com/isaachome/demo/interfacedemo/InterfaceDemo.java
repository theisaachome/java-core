
public class InterfaceDemo {
}
interface Jumpable{
    default void relax(){
        System.out.println("No Jumping");
    }
    static int maxDistance(){
        return 100;
    }
}
interface  Moveable{
    default  void relax(){
        System.out.println("No Jumping");
    }
    static String maxDistance(){
        return "forest";
    }
}

class Animal implements Jumpable,Moveable{
    @Override
    public void relax() {
        System.out.println("Watch movie....");
    }
}

class Mamal implements Jumpable,Moveable{
    @Override
    public void relax() {
        System.out.println("Watch movie....");
    }
}

// multiple interface extending

interface BaseInterface1{
    default void getName(){
        System.out.println("Base Interface 1");
    }
}
interface BaseInterface2{
    default void getName(){
        System.out.println("Base Interface 2");
    }
}

interface MyInterface1 extends BaseInterface1,BaseInterface2{
    int age=10;
    @Override
    default void getName() {
        System.out.println("Just Me...");
    }
}
class MyClass implements MyInterface1{
}
void main() {
    var myClass = new MyClass();
    myClass.getName();
}

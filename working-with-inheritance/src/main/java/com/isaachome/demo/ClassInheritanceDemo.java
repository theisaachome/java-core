

class Employee{
    String name;
    String address;
    String phoneNumber;
    float experience;
}
class Programmer extends Employee{
    String [] programmingLanguages;
    void writeCode(){};
}

class Manager{
    int teamSize;
    void reportProjectStatus(){}
}
class Astronaut extends Employee{
    float hoursInSpace;
}
class Doctor extends Astronaut{
    String surgery;
}
class Parent{}
class Child extends Parent{}

class ClassInheritanceDemo {

}

 void main(){
    System.out.println();
}

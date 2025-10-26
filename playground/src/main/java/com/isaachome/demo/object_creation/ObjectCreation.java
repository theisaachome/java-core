package com.isaachome.demo.object_creation;

class Person{}
class ObjectLifeCycle{
    Person person;
}
class ObjectLifeCycle2{
    Person person = new  Person();
}

class ObjectLifeCycle3{
    String obj1 = new String("Learning Java Object lifecycle");
    String obj2 = "Guru";
}
class Exam{
    private String name;
    private Exam other;
    public Exam(String name){
        this.name = name;
    }
    protected void setExam(Exam other){
        this.other=other;
    }

}
public class ObjectCreation {
    static void main() {
        Exam php = new Exam("php");
        Exam java = new Exam("java");

        php.setExam(java);
        java.setExam(php);

        php = null;
        java = null;
        System.gc();
    }


}

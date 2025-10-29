
class Employee {
    Employee(){
        System.out.println("Employee:: constructor");
    }
    {
        System.out.println("Employee:: initializer 1");
    }
    {
        System.out.println("Employee:: initializer 2");
    }
    void Employee(){}
    static class Manager{

    }
}
class Office{}

void  main(){
    var employee = new Employee();
}

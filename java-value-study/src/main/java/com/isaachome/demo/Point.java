
class Employ{
    private String name;
    ScopedValue<String> scopedValue;

    public Employ(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
void main(){
    System.out.println("Running from main method");
    var emp = new Employ("John");
    System.out.println(emp.getName());
}

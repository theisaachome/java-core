
class Employee{
    String name;
    int age;
    Employee(){
        age=20;
        System.out.println("Constructor.....");
    }
    Employee(String newName){
        this.name=newName;
        age = 25;
    }
    Employee(String newName, int newAge){
        this.name=newName;
        this.age=newAge;
    }
    Employee(int newAge,String newName){
        this.name=newName;
        this.age=newAge;
    }
}
class BankAccount{
    private String accountNumber;
    private String checkBook;
    private String credential;

    public BankAccount(){
        System.out.println("Default Constructor");
    }
    public BankAccount(String accountNumber, String checkBook, String credential) {
        this.accountNumber = accountNumber;
        this.checkBook = checkBook;
        this.credential = credential;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCheckBook() {
        return checkBook;
    }

    public String getCredential() {
        return credential;
    }
}
class ConstructorDemo {
}

void main(){
  var bankAccount = new BankAccount("123454","checkBook","credential");
    System.out.println(bankAccount.getAccountNumber());
    var employee = new Employee();
    System.out.println(employee.age);
    var newEmployee =new Employee("NewEmployee",20);
    var newEmployeeII = new Employee(100,"NewEmployee");
}

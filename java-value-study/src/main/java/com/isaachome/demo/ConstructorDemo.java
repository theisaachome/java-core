
class Employee{
    String name;
    int age;
    Employee(){
        age=20;
        System.out.println("Constructor.....");
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
}

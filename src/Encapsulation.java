//e.g. using person class
class Person1{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0 && age<75){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    public void setName(String name){
        if(name.length()<3){
            System.out.println("Invalid Name");
        }
        else{
            this.name = name;
        }
    }
}
//e.g. 2 of read only and write only
class Student {
    private String rollNumber;   // read-only
    private String password;     // write-only

    // getter (read-only field)
    public String getRollNumber() {
        return rollNumber;
    }

    // setter (write-only field)
    public void setPassword(String password) {
        this.password = password;
    }
}
class BankAccount {
    private double balance; // hidden

    // constructor
    public BankAccount(double initialBalance) {
        if(initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Get balance (controlled access)
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
//    encapsulation is basically hiding the sensitive infromation from the users
//    for that we have to declare teh class varibles and attributes private and have to make the setters and getters (public)
//    so that to sset and update the value of attributes
//    with getter and setter , wwe can get the access of private variables
//     get method is used to access thet value of teh attribute
//    set method is used to set the value of the attribute
//    syntax : get/set followed by name of varible with first as uppercase
//    e.g.
//    private String name;
//    private int id;
//    private double salary;
//    creation of getter function


//    public String getName() {
//        return name;
//    }
////    setter function
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//    public double getSalary() {
//        return salary;
//    }
//    public int getId() {
//        return id;
//    }
    public static  void main(String[] args) {
//        Encapsulation e = new Encapsulation();
//        e.setId(1);
//        e.setSalary(1200);
//        e.setName("ziaurrehman malik");
//        System.out.println(e.name);
//        System.out.println(e.id);
//        System.out.println(e.salary);
//        System.out.println(e.getId());
        Person1 p1 = new Person1();
        p1.setAge(25);
        p1.setName("Jack");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        Student s = new Student();

        // Set password (write-only)
        s.setPassword("abc123");

        // Get rollNumber (read-only)
        System.out.println("Roll Number: " + s.getRollNumber());
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // validation prevents overdraft

        System.out.println("Final Balance: " + account.getBalance());
    }
}

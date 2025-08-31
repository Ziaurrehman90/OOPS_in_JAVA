public class SingleInheritance {
//    A subclass inherits from only one superclass.
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }

}
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}


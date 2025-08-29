public class Modifiers {
//    modifers can be classified into two categories
//    1. access modifiers: they have the control of the access of classss, attributes, methods
//    2. non-access modifiers: they dont have control over the access but insteadd perform some difffernt funtionality

//    public access: it gives the access of the classs to another classs i.e. any class can get the acess of main class
//    default : only those classses can get the access of another classess whichare in the same packagge
//    for attributes, methods or constructors
//    1. public : the code is accesses by any class
//      2. private: we can get the access of code only in the declared class itself
//    3. protected : the code is accesses in the same package and subclasees
//    understanig public and private using an example
    public static void main(String[] args){
        Person obj=new Person();
//        accessing the public modifiers
        obj.name="ziaurrehman";
//        we can get thw access of private variable
//        obj.age=77;

        System.out.println(obj.name);
//        accessing the private variable
//        System.out.println(obj.age);
//        it will give the erorr

    }
//

}
class Person{
//    public attribute
   public  String name;
//    private attribute
    private int age;


}

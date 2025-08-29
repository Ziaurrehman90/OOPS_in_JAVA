public class NonAccessModifiers {
//    they dont control the access , instead perform some other functionality
//    Final, static & abstract
//    1. Final : it can be used in those cases when you dont want that your attribute;s value would be modified , it shoould remain same at any xost
    final int age=22;
    final double PI=3.14;
    NonAccessModifiers(){}
    public  static void main(String[] args) {
        NonAccessModifiers obj=new NonAccessModifiers();
        System.out.println(obj.age);
        System.out.println(obj.PI);
//        obj.age=55;
//        obj.PI=6;
//        it gives error as w cant change the value
//        2. static : it can be used to get the access without creating the objecty while public requires creation of object
//                3. abstract:
    }
}

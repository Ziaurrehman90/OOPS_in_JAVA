// in order to create thew class , we should use class kewword along with the name of class
//lets create a class with a variable x
public class Main2{
    int x=5;
    String str1="learning";
    String str2="OOPS in java";
//    lets call the method
//    public static void main(String[]args) {
////        Now lets create an object of the class
////         class_name object_name;
////        we have ot intialize the object using the new keyword
//        Main2 obj1 = new Main2();
////        now in object we can get thw access of the properties of the class
////        we can print the variable x in tthe object
//        System.out.println(obj1.x);
////        creation of new object
//        Main2 obj2 = new Main2();
//        System.out.println(obj2.x + 10);
//        System.out.println(obj2.str2);
//        System.out.println(obj1.str1);
//
//    }

}
//we can also initated a obejct from 1 class into the new class
//main method : that classs we want to run
//one class should have all the attributes, properties

 class Second{
    public static void main(String[] args) {
        Main2 new_ob=new Main2();
        System.out.println(new_ob.x);

    }
}



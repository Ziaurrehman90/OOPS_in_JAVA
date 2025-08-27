public class Methods {
//    creation of method in a class
    public static void method(){
        System.out.println("Hello good morning all");
    }
//    e.g. of static method
    static void my_function(){
        System.out.println("It is static method which can be called wothout creating the object");
    }
//    e.g. og public method
    public void  my_function2(){
        System.out.println("This is an example of public method ");
    }
    public void fullThrottle(){
        System.out.println("The car is running at a very high speed");
    }
    public void speed(int x){
        System.out.println("The car is running with a speed "+" "+(x*10) );
    }

    public static void main(String[] args) {
//        calling of a method to the main method
        method();
//        therre are 2 types of method creation
//        1. using public and static methods
//        if method is created static then there is no need to create the object in the classs , it can be called directly
        my_function();
//        if method is created using public, then we have to create the object
//        lets call teh public method without creating the object
//        my_function2();
//        it gives an error
//        thus we need to create the object
        Methods obj = new Methods();
        obj.my_function2();

//         accessing the methods with an object
        Methods myCar = new Methods();
        myCar.fullThrottle();
        myCar.speed(10);

    }
}

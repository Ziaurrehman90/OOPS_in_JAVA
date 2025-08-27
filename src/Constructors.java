public class Constructors {
//    constructor always called on creating the object of the class
//    main objective of constructor : giving intial values to teh attributes of the oject
//    lets initialize the attribute
    int x;
    int y;
//    lets define some attrbutes of teh class car
    int car_no;
    double car_price;
    int car_insurance_no;
    String name;
//    default constructor
//    public Constructors() {
////        with construcotr i  have initialsed the valu of teh attribute
////      return type of constructor : NO
////        there is always default constructors
//
//        x=98;
//    }
//    parametric constructors
//    we can give parameters to the constructors to initializew the value of the attributes
//    public Constructors(int num) {
//        y=num;
//    }
public Constructors(int car_no, double car_price, int car_insurance_no, String name ){
    this.car_no = car_no;
    this.car_price = car_price;
    this.car_insurance_no = car_insurance_no;
    this.name = name;

}
    public static void main(String[] args) {
//        Constructors c = new Constructors(87);
//        System.out.println(c.y);
//        now we can give value of attribute as a paramete
//        we can have as many paramets as we want
//        lets create teh car constrcutro
//        obj 1
        Constructors car=new Constructors(12,220000,34,"Mercedes");
        System.out.println(car.car_no);
        System.out.println(car.car_price);
        System.out.println(car.car_insurance_no);
        System.out.println(car.name);
//        obj 2
        Constructors car1=new Constructors(22,500000,56,"Audi");
        System.out.println(car1.car_no);
        System.out.println(car1.car_price);
        System.out.println(car1.car_insurance_no);
        System.out.println(car.name);


    }
}

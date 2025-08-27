//class attributes : variables in a class
public class Main3 {
//    creation of attributes
    int x=5;
    int y=23;
    int z=99;
    int q;
    final int w=99;
//    these all are the attributes
//    we can get the access of the attributes by creating the objects
    public static void main(String [] args){
        Main3 obj = new Main3();
        System.out.println(obj.x);
        System.out.println(obj.y);
//        we can also modify the values of attributes
//        1. assigning the values now
        obj.q=34;
        System.out.println(obj.q);
//        2. we can chagent he value of atttribute
        obj.x=45;
        System.out.println(obj.x);
//        if you dont want that now object would change the value of attribute, simply initiated teh value of attribute with final keyword
        System.out.println(obj.w);
//        obj.w=67;
//        it gives the error as it is restrictd to change the attribute value
        System.out.println(obj.w);
//        with multiple objects we cna change teh value of atribute in one object while for the another it would be same
        Main3 obj2 = new Main3();
        obj2.y=78;
        System.out.println(obj2.y);
        System.out.println(obj.y);
    }
}

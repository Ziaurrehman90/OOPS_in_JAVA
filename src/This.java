public class This {
//    when the classs attributes and method parameters do have the same name
//    then, this keyword would use so that it creares a distingush among both elements
//    e.g.
//    this keyword basically refers the classs variables
    int roll_no;
    String name;
    int classs;
    String school;
    public This(int roll_no, String name, int classs, String school) {
        this.roll_no = roll_no;
        this.name = name;
        this.classs = classs;
        this.school = school;

    }
    public static void main(String [] args){
        This obj=new This(98,"ziaurrehman malik",10,"maharaja agrasen public school");
        System.out.println(obj.roll_no);
        System.out.println(obj.name);
        System.out.println(obj.classs);
        System.out.println(obj.school);
    }
//    this keyword can also be used to call one constructor into the another constructor

}

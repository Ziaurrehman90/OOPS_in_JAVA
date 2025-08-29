import java.util.Scanner;
//importing the package
import java.util.*;
public class Packages {
//    packages are basically a complete folder in a file, it contains various classes
//    packages can be classified into two types, in built packages and user defined packages
//    in built packages are those which arw available in the java itself, they can be easily imported to the code directly
//    syntax : import packagename.*;
//    import package.name.Class;
//    class to import that takes input
//    eg to use the scanner classs
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name=input.nextLine();
        System.out.println(name);

    }

}

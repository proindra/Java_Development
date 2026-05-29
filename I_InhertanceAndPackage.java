import Inheritance.VeryAdvCalc;
// import Inheritance.*; //we can also import all the classes of the package using wildcard, but it is not recommended as it may lead to ambiguity if there are classes with same name in different packages. It is better to import only the classes that we need.
import java.lang.System; //default package, no need to import it, but we can also import it if we want to use it.

public class I_InhertanceAndPackage {
    public static void main(String a[]){
        VeryAdvCalc obj = new VeryAdvCalc();
        
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(7,3);
        double r5 = obj.power(4,5);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
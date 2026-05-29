import Inheritance.VeryAdvCalc;

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
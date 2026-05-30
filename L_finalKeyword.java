// final - variable, method, class
// variable - cannot be changed
// method - cannot be overridden
// class - cannot be inherited


class Calc{
    public final void show(){
        System.out.println("In Calc Show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
//     public void show(){
//         System.out.println("In AdvCalc Show");
//     }



public class L_finalKeyword {
    public static void main(String a[]){
        // final int num = 8;
        // num = 9;
        // System.out.println(num);
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
    
}

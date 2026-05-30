class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class N_TypeCasting {
    public static void main(String a[]){
        // By default, upcasting is done by the compiler. It is implicit and does not require any special syntax.
        // A obj = (A) new B();
        A obj = new B(); // upcasting
        obj.show1();

        B obj1 = (B)obj; // downcasting, it is explicit and requires a cast operator. It is used when you want to access members of the subclass that are not present in the superclass.
        obj1.show2();
    }
    
}

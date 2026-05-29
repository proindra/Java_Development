class A{
    public A(){
        System.out.println("Constructor of class A");
    }
}

class B extends A{
    public B(){
        System.out.println("Constructor of class B");
    }
}


public class ContructorinInheritance {
    public static void main(String a[]) {
        B obj = new B();
    }
}

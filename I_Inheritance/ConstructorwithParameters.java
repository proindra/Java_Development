//By default there will be a super() in the constructor of the child class. If we want to call the parameterized constructor of the parent class, then we have to explicitly call it using super(parameters) in the constructor of the child class.
class A{
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }

    public B(int n){
        // super();
        // super(n);
        // this();
        System.out.println("in B int");
    }
}

public class ConstructorwithParameters {
    public static void main(String a[]) {
        B obj = new B(5);
    }
}

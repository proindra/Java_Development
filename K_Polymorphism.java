// There are two types
// 1. Compile-time polymorphism -- Method overloading
// 2. Runtime polymorphism -- Method overriding
// To stop use final keyword to methods see l_finalKeyword.java

// Runtime Polymorphism

class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C Show");
    }
}


public class K_Polymorphism {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

class Human{

    public Human(){
        System.out.println("Object is created");
    }

    public void show(){
        System.out.println("Show method called");
    }
}

public class H_AnonymousObject {
    public static void main(String a[]) {
        // for example
        // int marks;
        // marks = 90;
        // same as
        // Human obj = new Human();
        new Human(); // Anonymous object, no reference variable to refer this object, so we cannot reuse this object.
    }
}
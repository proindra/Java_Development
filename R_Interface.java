// interface is not class
// and by default all methods in interface are abstract and public 
// we cannot create variable in interface but we can create constant variable in interface and by default all variable in interface are public static final
// interface does not have any memory in heap.

interface A{
//     public abstract void show();
//     public abstract void config();

    int age = 10;            // final and staitc (we cannnot only create we should declare and initialize the variable in interface)
    String name = "prajwal"; // final and staitc (we cannnot only create we should declare and initialize the variable in interface)
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show"); // implements only gets methods not variables.
    }

    public void config(){
        System.out.println("in config");
    }
}
public class R_Interface {
    public static void main(String a[]){
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);  // we can accesss variable by interface we dont need to create object of interface because variable in interface is static by default
        System.out.println(A.name);
    }
}

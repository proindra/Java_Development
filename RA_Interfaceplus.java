// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
// interface - class -> not possible


interface X{
    void display();
}

interface A{
    void show();
    void config();
}


class B implements A,X{  // See here
    public void show(){
        System.out.println("in show"); // implements only gets methods not variables.
    }

    public void config(){
        System.out.println("in config");
    }

    public void display(){
        System.out.println("in display");
    }
}

interface Y extends X{
    void run();

}

public class RA_Interfaceplus {
    public static void main(String a[]){
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.display();
    }
}

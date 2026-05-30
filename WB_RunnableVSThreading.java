// now we can use extends to subclass because of runnable interface

class A implements Runnable
{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hi");
        }
    }
}

class B implements Runnable
{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello");
        }
    }
}



public class WB_RunnableVSThreading {
    public static void main(String a[]){
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

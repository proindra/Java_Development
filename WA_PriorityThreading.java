class A extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {  
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
        }
    }
}



public class WA_PriorityThreading {
    public static void main(String a[]){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        // 5 is the default priority of a thread

        obj2.setPriority(Thread.MAX_PRIORITY);
        // 10 is the maximum priority of a thread

        obj1.start();
        obj2.start();
    }
}

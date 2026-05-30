// Static can be used with inner class but not with method and variable of outer class
class A{

    int age;

    public void show(){
        System.out.println("in show");
    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}



public class QA_InnerClassWithStatic {
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
    
}
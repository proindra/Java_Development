// U will get QB_AnonymousInnerClass$1.class file after compilation
// when u want to implement class A for once u can use anonymous inner class and if A is abstract then also u can use anonymous inner class to implement the abstract method of A

class A{
    public void show(){
        System.out.println("in A show");
    }
}

public class QB_AnonymousInnerClass {
    public static void main(String a[]){
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };      
        obj.show();
    }
}

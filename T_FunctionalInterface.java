@FunctionalInterface
interface A{
    void show(); 
    // only one abstract method is allowed in functional interface and 
    // if we try to add more than one abstract method then it will give compile time error. but we can have any number of default and static method in functional interface.
} 


public class T_FunctionalInterface {
    public static void main(String a[]){
        A obj = new A() {
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}

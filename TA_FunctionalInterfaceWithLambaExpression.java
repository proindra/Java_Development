@FunctionalInterface
interface A{
    void show(int i); 
    // only one abstract method is allowed in functional interface and 
    // if we try to add more than one abstract method then it will give compile time error. but we can have any number of default and static method in functional interface.
} 


public class TA_FunctionalInterfaceWithLambaExpression {
    public static void main(String a[]){
        A obj = (i) -> System.out.println("in show" + i);
        obj.show(5);
    }
}

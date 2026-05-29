class Calculator
{
    public int add(int a, int b){
        return a+b;
    }
}

public class B_OOPs {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
    }

}
// Class  = Variables (Data) + Methods (Behavior)   [Blueprint]
// Object = Instance of a Class                     [Actual thing]

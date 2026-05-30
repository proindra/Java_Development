public class UA_MultiExceptions{
    public static void main(String a[]){

        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero." + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit." + e);
        }
        catch(Exception e) 
        // always put the parent exception at the end because if we put it before the child exception then it will give compile time error because parent exception can handle all the child exception and it will never reach to the child exception.
        {
            System.out.println("Something went wrong" + e);
        }
        

        System.out.println(j);
        System.out.println("Bye");
    }
}